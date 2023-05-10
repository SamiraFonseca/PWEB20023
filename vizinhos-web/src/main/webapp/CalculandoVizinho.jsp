<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<style>
a{
border: 1px solid black;
border-radius: 4px;
font-size: 150%;
}

p{
font-size: 27px;
}

div{
width: 50%;
background-color: #B22222;
border: 1px solid black;
}

.a{
width: 50%;
background-color: #008000;
border: 1px solid black;
}
</style>

<body>
	
	<%
	
	String nViz = request.getParameter("NumVizinhos");
	
	if(nViz.isEmpty()){
		
	%>
		
	<div>
	
	<p>Para calcular os numeros vizinhos é necessário informar um número!</p>
	
	</div>
		
	<%  }  else {
	
		Float nViz1 = Float.parseFloat(nViz);
		Float ant = nViz1 - 1;
		Float sus = nViz1 + 1;
		
		String sus1 = sus.toString();
		String ant1 = ant.toString();

	%>
	
	   <p class="a">O número <%=nViz %> é antecedido por <%=ant %> e sucedido por <%=sus %>.</p>
	
	<% } %>
	
	<br><br>
	<a  href="CalculaVizinho.jsp">VOLTAR!!</a>
	
</body>
</html>