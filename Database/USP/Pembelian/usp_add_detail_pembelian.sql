USE [MyToko]
GO
/****** Object:  StoredProcedure [dbo].[usp_add_detail_pembelian]    Script Date: 12/5/2023 3:31:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[usp_add_detail_pembelian]
@nota		VARCHAR(6),
@harga		MONEY,
@jumlah		INT,
@idProduk	VARCHAR(6),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF EXISTS(SELECT idProduk FROM Detail_Pembelian WHERE idProduk = @idProduk and nota = @nota)
	BEGIN
		UPDATE Detail_Pembelian
		SET jumlah += @jumlah
		WHERE idProduk = @idProduk

		SET @result = 1
		RETURN
	END
	ELSE IF NOT EXISTS(SELECT nota FROM Pembelian WHERE nota = @nota) 
	BEGIN 
		SET @result = -1
		RETURN
	END
	ELSE IF NOT EXISTS (SELECT id FROM Produk WHERE id = @idProduk)
	BEGIN
		SET @result = -2
		RETURN
	END
	INSERT INTO Detail_Pembelian
	VALUES(@nota, @idProduk, @harga, @jumlah)
	SET @result = 1
	RETURN
END
