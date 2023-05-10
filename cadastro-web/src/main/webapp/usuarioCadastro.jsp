<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


</head>
<body>
<%
	String mensagem = "Bem Vindo!!";
	out.println(mensagem);


		String nome = request.getParameter("nome");
		if(nome == null)
			nome = "";
		
		String email = request.getParameter("email");
		if(email == null)
			email = "";
	%>


<!-- Fazer com que quando se escreve as senhas diferentes o programa colta para a mesma página
 mas com os campos de nome email preenchidos com o que foi digitado antes, fazendoassim, o usuário não digitar novamente esses campos -->

<div class="container-fluid">

	<h2 class="jubotrom">Cadastro Usuário</h2>
	
	<form action="cadastrarUsuario" method="post">
       <label for="nome"> Nome: </label> 
	   <input type="text" name="nome" value="${param.nome}" id="nome">
	   
	   <br><br>
	   
	   <label for="email"> E-mail </label> 
	   <input type="email" name="email" value="${param.email}" id="email"> 
	   
	   <br><br>
	   
	   <label for="dataNasc">Data de Nascimento:</label> 
	   <input type="date" name="dataNasc" id="dataNasc"> 
	   
	    <br><br>
	   
	   <label for="senha">Senha:</label> 
	   <input type="password" name="senha1" id="senha1"> 
	   
	   <br><br>
	   
	   <label for="senha">Confirme a Senha:</label> 
	   <input type="password" name="senha2" id="senha2"> 
	   
		<br><br>
	   
	   <input type="submit" value="	Logar" class="btn btn-primary">
	   <a class="btn btn-primary" href="cadastrarUuario" role="button">Listar Usuários</a>
	   <a class="btn btn-primary" href="usuarioCadastro.jsp" role="button">Voltar</a>

	</form>
	
	<c:if test="${not empty param.nome}">
	<hr>
	<div class="alert alert-danger" role="alert">
	<span>${param.nome} a senha está incorreta!</span>
	</div>
	</c:if>
	
</div>




</body>
</html>