SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_pembelian
@nota	VARCHAR(6),
@idPemasok	VARCHAR(4),
@idAdmin	INT,
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF @nota NOT LIKE('[0-9][0-9][0-9][0-9][0-9][0-9]') OR EXISTS(SELECT nota FROM Pembelian WHERE nota = @nota)
	BEGIN
		SET @result = -1;
		RETURN
	END

	IF NOT EXISTS(SELECT id FROM Pemasok WHERE id=@idPemasok)
	BEGIN
		SET @result = -2;
		RETURN
	END

	IF NOT EXISTS(SELECT id FROM Admin WHERE id=@idAdmin)
	BEGIN
		SET @result = -3;
		RETURN
	END

	INSERT INTO Pembelian
	VALUES (@nota, @idPemasok, @idAdmin, GETDATE())
	SET @result = 1;
	RETURN
END
GO