<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/ListServlet" method="post">

<h2>Heres my list</h2>

<ul name ="fullList">
  <li value="coffee">>Coffee</li>    
  <li value="tea">>Tea</li>    
  <li value="milk">>Milk</li>    
</ul>

<input type=submit value="Count">

</form>

</body>
</html>