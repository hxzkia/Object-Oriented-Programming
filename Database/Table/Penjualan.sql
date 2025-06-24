CREATE TABLE Penjualan (
nota		VARCHAR(6)		PRIMARY KEY CHECK(nota LIKE ('[0-9][0-9][0-9][0-9][0-9][0-9]')),
idPelanggan	INT				NOT NULL,
idAdmin		INT				NOT NULL,
tanggal		DATE			NOT NULL,
CONSTRAINT
FK_Penjualan_idPelanggan FOREIGN KEY (idPelanggan) REFERENCES Pelanggan (id),
CONSTRAINT
FK_Penjualan_idAdmin FOREIGN KEY (idAdmin) REFERENCES Admin (id),
);