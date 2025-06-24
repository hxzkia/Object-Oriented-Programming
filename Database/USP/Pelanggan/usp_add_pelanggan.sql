SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_pelanggan
@nama		CHAR(255),
@nomorHP	VARCHAR(15),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF NOT EXISTS(SELECT id FROM Pelanggan WHERE nomorHP = @nomorHP)
	BEGIN
		INSERT INTO Pelanggan
		VALUES (@nama, @nomorHP)

		SET @result = (SELECT id FROM Pelanggan WHERE nomorHP = @nomorHP);
		RETURN
	END

	SET @result = 0;
	RETURN
END
GO
