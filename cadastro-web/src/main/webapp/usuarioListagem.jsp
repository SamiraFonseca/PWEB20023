<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<style>
table, tr, td {
	border: 1px solid black
}

th {
	background-color: grey;
}

td{
	background-color: lightgrey;
}
</style>

<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Nome Usuários</th>
			<th>Email Usuários</th>
		</tr>
		<c:forEach var="usu" items="${listaUsu}">
			<tr>
				<td>${usu.id}</td>
				<td>${usu.nome}</td>
				<td>${usu.email}</td>
			</tr>
		</c:forEach>
	</table>
	<br>

	<a href="usuarioCadastro.jsp">VOLTAR!</a>

</body>
</html>
