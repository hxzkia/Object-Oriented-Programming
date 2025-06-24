SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_detail_penjualan
@nota		VARCHAR(6),
@harga		MONEY,
@jumlah		INT,
@idProduk	VARCHAR(6),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF EXISTS(SELECT idProduk FROM Detail_Penjualan WHERE idProduk = @idProduk and nota = @nota)
	BEGIN
		UPDATE Detail_Pembelian
		SET jumlah += @jumlah
		WHERE idProduk = @idProduk

		SET @result = 1
		RETURN
	END
	ELSE IF NOT EXISTS(SELECT nota FROM Penjualan WHERE nota = @nota) 
	BEGIN 
		SET @result = -1
		RETURN
	END
	ELSE IF NOT EXISTS (SELECT id FROM Produk WHERE id = @idProduk)
	BEGIN
		SET @result = -2
		RETURN
	END

	INSERT INTO Detail_Penjualan
	VALUES(@nota, @idProduk, @harga, @jumlah)
	SET @result = 1
	RETURN
END
GO