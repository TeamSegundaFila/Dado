<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!-- Custom -->
<link href="resources/css/custom.css" rel="stylesheet">

<html>
<head>
	<title>Proyecto 1D6</title>
</head>
<body>

<div class="outer">
	<div class="inner">

		<div id="navbar">
			<span id="navbutton">
				<a href="/formacion">Home</a>
			</span> 
			<span id="navbutton">
				<a href="/formacion/estadisticas">Estadísticas</a>
			</span> 
			<span id="navbutleft"> 
				<a href="/formacion/admin">Admin</a>
			</span>
		</div>

		<div id="cabecera">
			<h1>Estadísticas</h1>
			<h3>- Proyecto Dado - Fila #2 -</h3>
		</div>
		<hr>
		<div  class="row">
			<div  class="col2-left">
				<h2>Ranking Usuarios</h2>
				<ol>
					<li>Josefina (7 lanzamientos)</li>
					<li>Josu (5 lanzamientos)</li>
					<li>Jesulin (2 lanzamientos)</li>
				</ol>
				<p>ˇˇˇJosefina es la más afortunada!!!</p>
			</div>
			
			<div  class="col2-right">
				<div class="container">
					<h3>Frecuencia resultados</h3>
					<ul>
						<li>Resultado 1 - 4 veces</li>
						<li>Resultado 2 - 4 veces</li>
						<li>Resultado 3 - 3 veces</li>
						<li>Resultado 4 - 4 veces</li>
						<li>Resultado 5 - 27 veces</li>
						<li>Resultado 6 - 4 veces</li>
						<p>Representar en histograma de frecuencias?</p>
					</ul>
					
				</div>
				<hr>
				<p>Total de lanzamientos ---> 46 Lanzamientos</p>
				<hr>
				<h3>Historial de lanzamientos del dado</h3>
				<ul>
					<li>Lanzamiento #46 - 27 de marzo</li>
					<li>Lanzamiento #45 - 27 de marzo</li>
					<li>Lanzamiento #44 - 26 de marzo</li>
					<li>Lanzamiento #43 - 25 de marzo</li>
					<li>Lanzamiento #42 - 25 de marzo</li>
				</ul>
				<hr>
				<br>
			</div>
		</div>
		
	</div> <!-- inner -->
</div> <!-- outer -->

</body>
</html>