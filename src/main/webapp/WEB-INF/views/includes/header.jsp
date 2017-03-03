<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>

<html>
<head>
	<title>Proyecto 1D6</title>
	<base href="/trileros/" />
	<link href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css" rel="stylesheet">
	<!-- Custom -->
	<link href="resources/css/custom.css" rel="stylesheet">
</head>
<body>

<div class="outer">
	<div class="inner">

		<div id="navbar">
			<span id="navbutton">
				<a href="#">Home</a>
			</span> 
			<span id="navbutton">
				<a href="estadisticas">Estadísticas</a>
			</span> 
			<span id="navbutleft"> 
				<a href="admin">Admin</a>
			</span>
		</div>