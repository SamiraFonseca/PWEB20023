<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }
  
  input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  
  input[type=submit]:hover {
    background-color: #45a049;
  }
  
  div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
  }

</style>
<body>
	<h1>Calculadora de Áreas</h1>
	<br><br>
	
	<div>
	<form action="Calculo.jsp">
	<label for ="base">Valor da Base:</label>
	<input type ="text" name = "base">
	<br><br>
	<label for="altura">Valor da Altura:</label>
	<input type="text" name="altura">
	<br><br>
	<input type="submit" value="CALCULAR!!">
	</div>
	</form>
	
</body>
</html>