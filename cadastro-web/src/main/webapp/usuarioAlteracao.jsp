<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<style>

div {
	border:1px solid black;
	background-color: lightgrey;
}

</style>
<body>


<div class="container-fluid">
		<h1>Atualizar Usuário</h1>
		<br>
		<form method="post" action="alterarUsuario">
		<input type="hidden" name="id" value="${usuario.id}"> <!-- Onde vai ser pegado o id para por no banco de dados -->
			<label for="nome">Nome:</label>
			<input type="text" name="nome" value="${usuario.nome}"><br><br>
			<label for="email">E-mail:</label>
			<input type="text" name="email" value="${usuario.email}"><br><br>
			<label for="senha1">Senha:</label>
			<input type="password" name="senha1"><br><br>
			<label for="senha2">Senha confirmada:</label>
			<input type="password" name="senha2">
			<hr>
			<input type="submit" value="Salvar" class="btn btn-primary">
			
			<a class="btn btn-secondary" href="cadastrarUsuario" role="button">Voltar</a>
		</form>
</div>	

	<c:if test="${not empty mensagem }">
		<hr>
		<div class="alert alert-danger" role="alert">
		<spam>${mensagem}</spam>
		</div>
	
	</c:if>	

		

</body>
</html>