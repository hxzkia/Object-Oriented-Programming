CREATE VIEW view_subtotal_detail_pembelian AS
SELECT 
	nota,
	idProduk,
	jumlah,
	harga,
	(jumlah * harga) AS subtotal
FROM 
	Detail_Pembelian 