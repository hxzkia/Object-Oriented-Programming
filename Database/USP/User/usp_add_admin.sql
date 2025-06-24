SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER PROCEDURE usp_add_admin
@fullname	varchar(255),
@username	varchar(25),
@password	varchar(50),
@result		int	= 0 output
AS
BEGIN
	SET NOCOUNT ON;
	IF NOT EXISTS(select username from Admin where username = @username)
	BEGIN
		INSERT INTO Admin (fullname, username, password)
		VALUES (@fullname, @username, @password)
		SET @result = 1;
		RETURN
	END

	SET @result = 0
	RETURN
END
GO
