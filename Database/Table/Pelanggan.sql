CREATE TABLE Pelanggan (
id			INT			PRIMARY KEY IDENTITY(1,1),
nama		CHAR(255)	NOT NULL,
nomorHP		VARCHAR(15)	UNIQUE NOT NULL
);