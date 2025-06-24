SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_change_password
@username	VARCHAR(25),
@password	VARCHAR(50),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	IF EXISTS(SELECT id FROM Admin WHERE username = @username)
	BEGIN
		UPDATE Admin
		SET password = @password
		WHERE username = @username
		SET @result = (SELECT id FROM Admin WHERE username = @username);
		RETURN
	END
	SET @result = 0;
	RETURN
END
GO