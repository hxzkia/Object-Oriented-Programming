CREATE TABLE Produk (
id			VARCHAR(6)		PRIMARY KEY CHECK(id LIKE ('PR[0-9][0-9][0-9][0-9]')),
nama		VARCHAR(100)	UNIQUE NOT NULL,
kategori	VARCHAR(4)		FOREIGN KEY (kategori) REFERENCES Kategori (id),
stok		INT				NOT NULL,
harga		MONEY			NOT NULL
);