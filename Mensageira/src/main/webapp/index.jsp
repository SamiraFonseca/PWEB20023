<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


</head>
<style>

.a1{

border: solid 1px; 
border-radius: 5px;
margin-top: 20px;
margin-right: 40px;
margin-bottom: 20px;
margin-left: 40px;
background-color:#C0C0C0;
}

select{
width: 80%;
border: 2px solid #ccc;
border-radius: 4px;
background-color: #f8f8f8;
}

.a2{
margin-left:200px;

}

.a3{
margin-left:200px
}

.a4{
margin-left:200px
}



.t{
width: 80%;
border: 2px solid #ccc;
border-radius: 4px;
background-color: #f8f8f8;
}

.a5{
margin-left:200px
}

.b{
width: 80px;
background-color: #1E90FF;
margin-left: 80%;
border: none;
border-radius: 4px;
}

.a6{
 background-color: #DCDCDC;

}

.c{
width: 80%;
height: 150px;
padding: 12px 20px;
box-sizing: border-box;
border: 2px solid #ccc;
border-radius: 4px;
background-color: #f8f8f8;
}

</style>
<body>

<div class="a1">
<h1>SERVIÇO DE MENSAGEIRA</h1>
<hr>
<p>Formulário para envio de emails</p>
</div>

<div class="a6">
<br>


<div class="a2">
<label for="email">E-mail:</label>
<select name="email" id="email">
  
 <c:forEach items="${ListaDeEmail}" var="email">
 <option value="${email.email}">${email.email}</option>
 </c:forEach> 
 
</select>
</div>

<br>
<br>

<div class="a3">
<form action="serviço" method="post">
<input type="radio" id="formal" name="cump" value="formal" checked>
<label for="html">Cumprimento Formal</label> 


<input type="radio" id="cumpHorario" name="cump" value="cumpHorario">
<label for="html">Cumprimento Conforme Horário</label><br>

</div>

<br>
<div class="a4">
<input type="checkbox" id="auto" name="auto" value="automatico">
<label for="auto">Incluir aviso de "E-mail Automático"</label>

</div>

<br>
<br>

<div class="a5" >
<label for="titulo">Título:</label>
<input type="text" id="titulo" name="titulo" class="t">


<br>
<br>

<label for="texto">Texto:</label>
<input type="text" id="texto" name="texto" class="c">

</div>
  <br>
  <br>
 
 <input type="submit" value="Enviar" class="b">
</form>
</div>

<!-- 
 <c:if test="${empty param.titulo}">
 	<hr>
			<div class="alert alert-danger" role="alert">
				<span>Nenhum título foi escrito!!</span>
			</div>		
 </c:if>
 
 -->  
 
</body>
</html>