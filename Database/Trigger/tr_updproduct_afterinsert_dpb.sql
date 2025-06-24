CREATE TRIGGER tr_updproduct_afterinsert_dpb ON Detail_Pembelian
FOR INSERT AS
BEGIN
	UPDATE
		p
	SET
		p.stok += i.jumlah
	FROM
		Produk p 
	JOIN
		inserted i
	ON
		p.id = i.idProduk
END