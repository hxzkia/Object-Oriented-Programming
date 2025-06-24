CREATE TABLE Pembelian (
nota		VARCHAR(6)		PRIMARY KEY CHECK(nota LIKE ('[0-9][0-9][0-9][0-9][0-9][0-9]')),
idPemasok	VARCHAR(4)		NOT NULL,
idAdmin		INT				NOT NULL,
tanggal		DATE			NOT NULL,
CONSTRAINT
FK_Pembelian_idPemasok FOREIGN KEY (idPemasok) REFERENCES Pemasok (id),
CONSTRAINT
FK_Pembelian_idAdmin FOREIGN KEY (idAdmin) REFERENCES Admin (id),
);