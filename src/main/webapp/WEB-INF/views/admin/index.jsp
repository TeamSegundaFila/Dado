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
			<h1>
				Proyecto 1D6 - Backoffice 
			</h1>
			<img id="imghackerman" src="resources/img/hackerman.jpg" alt="Hackerman"/>
			<hr>
			<h3>
				Listado Usuarios
			</h3>
		</div>
		
		<div class="container">
			<ul>
				<li>Josefina (7 lanzamientos)</li>
				<li>Josu (5 lanzamientos)</li>
				<li>Jesulin (2 lanzamientos)</li>
			</ul>
		</div>
		<p>Crear nuevo usuario</p>
		<br>
		<br>
		<hr>
		<br>
	</div> <!-- inner -->
</div> <!-- outer -->

</body>
</html>
