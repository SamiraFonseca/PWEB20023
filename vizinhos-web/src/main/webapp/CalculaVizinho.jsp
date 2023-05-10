<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Calcula Vizinhos</title>
</head>
<style>

<style>
input[type=text], select {

width: 100%;
padding: 12px 20px;
margin: 8px 0;
/*display: inline-block;*/
border: 1px solid #ccc;
border-radius: 4px;
/*box-sizing: border-box;*/

 }
  
input[type=submit] {

width: 50%;
background-color: #4682B4;
color: white;
padding: 14px 20px;
margin: 8px 0;
border-radius: 4px;
cursor: pointer;

  }
  
input[type=submit]:hover {

background-color: #ADD8E6;
color:	#000000

  }
  
div {
	
	width: 20%;
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    
  }
</style>

</style>
<body>

	<div>
		<form action="CalculandoVizinho.jsp">
			<label for="NumVizinhos">Informe um número: </label> 
			<input type="text" name="NumVizinhos">
			<br> <br>
			<input type="submit" value="Calcular!!">
		</form>
	</div>

</body>
</html>