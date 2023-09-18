<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola Mundo!</h1>
	<%
		//JSP Java Server Pages    	o		Jakarta Server Pages
		//http://localhost:8080/index.jsp
		
		//codigo java (dentro de estas etiquetas)
		out.println("<h2>Hola Mundo Servlet</h2>");
		System.out.println("Esto sale por consola del server!");
		try{
			String nombre=request.getParameter("nombre");
			if(nombre!= null && !nombre.isEmpty()){
			out.println("<h3> Hola" + nombre + "!</h3>");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	%>
</body>
</html>