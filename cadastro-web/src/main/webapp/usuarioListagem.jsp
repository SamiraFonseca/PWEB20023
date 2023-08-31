<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pr-BR" class="light-style layout-menu-fixed" dir="ltr"
	data-theme="theme-default" data-assets-path="assets/"
	data-template="vertical-menu-template-free">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />

<title>Cadastro Web - Listar Usuários</title>

<meta name="description" content="" />

<!-- Favicon -->
<link rel="icon" type="image/x-icon"
	href="assets/img/favicon/favicon.ico" />

<!-- Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
	rel="stylesheet" />

<!-- Icons. Uncomment required icon fonts -->
<link rel="stylesheet" href="assets/vendor/fonts/boxicons.css" />

<!-- Core CSS -->
<link rel="stylesheet" href="assets/vendor/css/core.css"
	class="template-customizer-core-css" />
<link rel="stylesheet" href="assets/vendor/css/theme-default.css"
	class="template-customizer-theme-css" />
<link rel="stylesheet" href="assets/css/demo.css" />

<!-- Vendors CSS -->
<link rel="stylesheet"
	href="assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css" />

<!-- Page CSS -->

<!-- Helpers -->
<script src="assets/vendor/js/helpers.js"></script>

<!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->
<!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->
<script src="assets/js/config.js"></script>
</head>


<body>
	<div class="content-wrapper">
		<div class="container-xxl flex-grow-1 container-p-y">
			<div class="card">
				<h5 class="card-header">Table Basic</h5>
				<div class="table-responsive text-nowrap">
					<table class="table">

						<tr>
							<th>Id |</th>
							<th>Nome Usuários |</th>
							<th>Email Usuários |</th>
							<th>#</th>
							<th colspan="2">##</th>
						</tr>


						<c:forEach var="usu" varStatus="id" items="${usuarios}">
							<tr
								class="${id.count % 2 == 0 ? 'table-primary' : 'table-secondary' }">
								<td>${usu.id}</td>
								<td>${usu.nome}</td>
								<td><a href="mailto:${usu.email}"> ${usu.email}</a></td>
								<td><a class="btn btn-success"
									href="alterarUsuario?id=${usu.id}">EDITAR</a></td>
								<td><a class="btn btn-danger"
									href="excluirUsuario?id=${usu.id}">EXCLUIR</a></td>
							</tr>
						</c:forEach>


					</table>
				</div>
			</div>
		</div>
	</div>

	<br>
	<a href="usuarioCadastro.jsp">VOLTAR!</a>
</body>
</html>

