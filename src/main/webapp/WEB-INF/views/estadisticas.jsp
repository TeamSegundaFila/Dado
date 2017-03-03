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
						<c:forEach items="${estadisticasTotales}" var="t">
							<li>${t.nombre} - ${t.contador}</li>
						</c:forEach>
		
					</ul>
					
				</div>
				<br>
				<hr>
				<p>Total de lanzamientos ---> ${total} Lanzamientos</p>
				<hr>
				<h3>Historial de lanzamientos del dado</h3>
				<ul>
					<c:forEach items="${ultimos}" var="u">
							<li>#${u.id} ${u.nombre} - ${u.fecha}</li>
					</c:forEach>
				</ul>
				<hr>
				<br>
			</div>
		</div>
	<%@ include file="includes/footer.jsp" %>