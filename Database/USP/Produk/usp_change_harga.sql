SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_change_harga
@id		VARCHAR(6),
@harga	MONEY,
@result	INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF EXISTS (SELECT id FROM Produk WHERE id = @id)
	BEGIN
		UPDATE Produk
		SET harga = @harga
		WHERE id = @id
		SET @result = 1;
		RETURN
	END

	SET @result = 0;
	RETURN
END
GO
