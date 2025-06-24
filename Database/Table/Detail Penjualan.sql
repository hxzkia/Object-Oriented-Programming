CREATE TABLE Detail_Penjualan (
nota		VARCHAR(6)		FOREIGN KEY (nota) REFERENCES Penjualan (nota),
idProduk	VARCHAR(6)		FOREIGN KEY (idProduk) REFERENCES Produk (id),
harga		MONEY			NOT NULL,
jumlah		INT				NOT NULL
);