CREATE TRIGGER tr_updproduct_afterinsert_dpj ON Detail_Penjualan
FOR INSERT AS
BEGIN
	UPDATE
		p
	SET
		p.stok -= i.jumlah
	FROM
		Produk p 
	JOIN
		inserted i
	ON
		p.id = i.idProduk
END