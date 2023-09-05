<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/style.css">
</head>
<body>
		<div class="center">
		<h1>Tarefa</h1>

		<div>
			<label for="titulo">Título:</label> <input type="text" name="tiulo"
				id="titulo" value="${ta.titulo}">
		</div>
		<div>

			<Label for="areaTexto">Descrição:</Label>
			<textarea name="areaTexto" id="areaTexto" style="height: 350px; width: 350px;">${ta.descricao}</textarea>
		</div>
		<a href="index.jsp" ><button class="btn btn-primary">Voltar</button></a>
	</div>
</body>
</html>