CREATE TABLE Detail_Pembelian (
nota		VARCHAR(6)		FOREIGN KEY (nota) REFERENCES Pembelian (nota),
idProduk	VARCHAR(6)		FOREIGN KEY (idProduk) REFERENCES Produk (id),
harga		MONEY			NOT NULL,
jumlah		INT				NOT NULL
);