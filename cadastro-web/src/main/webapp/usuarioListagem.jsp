<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

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
			<th>Id |</th>
			<th>Nome Usuários |</th>
			<th>Email Usuários |</th>
			<th>#</th>
		</tr>
		<c:forEach var="usu" varStatus="id" items="${usuarios}" >
			<tr class="${id.count % 2 == 0 ? 'table-primary' : 'table-secondary' }">
				<td>${usu.id}</td>
				<td>${usu.nome}</td>
				<td> <a href="mailto:${usu.email}"> ${usu.email}</a> </td>
				<td><a class="btn btn-success" href="atualizarUsuario.jsp">EDITAR</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>

	<a href="usuarioCadastro.jsp">VOLTAR!</a>

</body>
</html>