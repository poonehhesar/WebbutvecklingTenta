<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/LoginServlet" method="post">

Username: (Hint: My name with a uppercase first letter) <input type="username" name="username"><br>
Password: (The cours name with uppercase first letter) <input type="password" name="password"><br>
<input type="submit" value="register">
</form>


</body>
</html>