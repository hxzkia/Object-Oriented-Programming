SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE usp_login
@username	VARCHAR(25),
@password	VARCHAR(50),
@result		INT = 0 OUTPUT
AS
BEGIN
	SET NOCOUNT ON;
	if exists (select id from Admin
		where username = @username and password = @password)
	begin
		set @result = (select id from Admin 
		where username = @username and password = @password);
		return
	end

	set @result = 0;
	return
END
GO
