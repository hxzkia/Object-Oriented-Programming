CREATE TRIGGER tr_updproduct_afterupdate_dpj ON Detail_Penjualan
FOR UPDATE AS
BEGIN
	UPDATE
		p
	SET
		p.stok += d.jumlah
	FROM
		Produk p
	JOIN
		deleted d
	ON
		p.id = d.idProduk

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