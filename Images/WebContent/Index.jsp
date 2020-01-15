<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/ImagesServlet" method="post">

	 	<br></br>
	 		 		 
	 	Choose an animal: <select name="animal">
    <option value="elephant">Elephant</option>
    <option value="giraffe">Giraffe</option>
    <option value="wolf">Wolf</option>
  </select>
	 		 	
	 	<br></br>
	 	
 	 <input type="submit" value="Submit">	 	 
	 </form>

</body>
</html>