<%@ include file="includes/header.jsp" %>

		<div id="cabecera">
			<h1>Estadísticas</h1>
			<h3>- Proyecto Dado - Fila #2 -</h3>
		</div>
		<hr>
		<div  class="row">
			<div  class="col2-left">
				<h2>Ranking Usuarios</h2>
				<ol>
				<c:forEach items="${estadisticas}" var="e">
					<li>${e.nombre} - ${e.contador}</li>
				</c:forEach>
				</ol>
				El ganador es ${estadisticas[0].nombre} !!
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
	<%@ include file="includes/footer.jsp" %>