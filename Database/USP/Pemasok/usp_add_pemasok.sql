SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_add_pemasok
@id			VARCHAR(4),
@nama		CHAR(255),
@nomorHP	VARCHAR(15),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF NOT EXISTS(SELECT id FROM Pemasok WHERE id = @id OR nomorHP = @nomorHP)
	BEGIN
		INSERT INTO Pemasok
		VALUES (@id, @nama, @nomorHP)

		SET @result = 1;
		RETURN
	END

	SET @result = 0;
	RETURN
END
GO
