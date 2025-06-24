SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_produk
@id			VARCHAR(6),
@nama		CHAR(100),
@kategori	VARCHAR(4),
@stok		INT,
@harga		MONEY,
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF NOT EXISTS(SELECT id FROM Produk WHERE id = @id) AND NOT EXISTS(SELECT nama FROM Produk WHERE nama = @nama)
	BEGIN
		INSERT INTO Produk
		VALUES(@id, @nama, @kategori, @stok, @harga)
		SET @result = 1;
		RETURN
	END

	SET @result = 0;
	RETURN
END
GO