CREATE VIEW view_subtotal_detail_penjualan AS
SELECT 
	nota,
	idProduk,
	jumlah,
	harga,
	(jumlah * harga) AS subtotal
FROM 
	Detail_Penjualan