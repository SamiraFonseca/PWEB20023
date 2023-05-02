<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
a{
border: 1px solid black;
border-radius: 4px;
font-size: 150%;
}

p{
font-size: 27px;
}

div{
background-color: #B22222;
border: 1px solid black;
}
</style>

<body>
	
	
	<%
	String base = request.getParameter("base");
	String altura = request.getParameter("altura");
	
	if(base.isEmpty() || altura.isEmpty()){
		
	%>	
	<div>
	<p>Para que o calculo seja realizado são necessários valores válidos!!</p>	
	</div>	
	<%  }  else {
	
	
	
	Float base1 = Float.parseFloat(base);
	Float altura1 = Float.parseFloat(altura);
	
	Float area = (base1 * altura1)/2;
	
	//String area1 = Float.toString(area);
	
	%>
	
	   <p>A área do triângulo de base ${param.base} e altura ${param.altura} é <%=area %> centímetros quadrados</p>
	
	<% } %>
	<br><br>
	<a  href="TelaCalculo.jsp">VOLTAR!!</a>
	
</body>
</html>