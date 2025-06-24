SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_penjualan
@nota			VARCHAR(6),
@idPelanggan	INT,
@idAdmin		INT,
@result			INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF @nota NOT LIKE('[0-9][0-9][0-9][0-9][0-9][0-9]') OR EXISTS(SELECT nota FROM Penjualan WHERE nota = @nota)
	BEGIN
		SET @result = -1;
		RETURN
	END

	IF NOT EXISTS(SELECT id FROM Pelanggan WHERE id = @idPelanggan)
	BEGIN
		SET @result = -2;
		RETURN
	END

	IF NOT EXISTS(SELECT id FROM Admin WHERE id = @idAdmin)
	BEGIN
		SET @result = -3;
		RETURN
	END

	INSERT INTO Penjualan
	VALUES (@nota, @idPelanggan, @idAdmin, GETDATE())
	SET @result = 1;
	RETURN
END
GO
