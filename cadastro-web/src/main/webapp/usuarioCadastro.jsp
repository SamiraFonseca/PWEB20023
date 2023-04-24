<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



	<%
		String nome = request.getParameter("nome");
		if(nome == null)
			nome = "";
		
		String email = request.getParameter("email");
		if(email == null)
			email = "";
	%>


	<form action="cadastrarUsuario" method = "post">
	<label for = "nome"> Nome: </label>
	<input type = "text" name = "nome" value="${param.nome}">
	<label for = "email"> E-mail </label>
	<input type = "email" name = "email" value = "${param.email}">
	<label for = "senha">Senha:</label>
	<input type = "password" name = "senha1" id = "senha1">
	<label for = "senha">Confirme a Senha:</label>
	<input type = "password" name = "senha2" id = "senha2">
	<input type = "submit" value="enviar">
	
	</form> 
	
	



</body>
</html>