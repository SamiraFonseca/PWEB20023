<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="pessoa" class="br.edu.ifgoiano.entidade.Pessoa"></jsp:useBean>
	<p>TESTANDO SEUS PAR�METROS</p>
	<br>
	<p>A idade � ${param.idade} e a altura � ${pessoa.altura}</p>
	
</body>
</html>