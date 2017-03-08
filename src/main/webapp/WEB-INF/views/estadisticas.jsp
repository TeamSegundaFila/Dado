<%@ include file="includes/header.jsp" %>

	<div  class="row">
		<div class="col-md-12 maincajon">
			<div class="col-md-6">
				<c:if test="${estadisticas.size()>0 }">
					<h2>Ranking Usuarios Activos</h2>
					<ol>
					<c:forEach items="${estadisticas}" var="e">
						<li>${e.nombre} - ${e.contador} Lanzamientos</li>
					</c:forEach>
					</ol>
				</c:if>
				<c:if test="${estadisticas.size()== 0}">
					<h2> No hay lanzamientos </h2>
				</c:if>
			</div>	
			<div class="col-md-6">
				<c:if test="${estadisticasTotales.size()>0 }">
					<h3>Frecuencia resultados</h3>
					<ul>
						<c:forEach items="${estadisticasTotales}" var="t">
							<li>${t.nombre} -<b>${t.contador}</b> - ${t.contador/total*100}%</li>
						</c:forEach>
					</ul>
				</c:if>
				<c:if test="${estadisticasTotales.size()== 0}">
					<p> No hay lanzamientos </p>
				</c:if>
			</div>
		</div>
		<div class="col-md-12 totaltiradas">
			<p>Total de lanzamientos ---> ${total} Lanzamientos</p>
		</div>
		<div class="col-md-12">
			<h3>Historial de lanzamientos del dado</h3>
			<ul>
				<c:forEach items="${ultimos}" var="u">
						<li>#${u.id} ${u.nombre} - ${u.fecha}</li>
				</c:forEach>
			</ul>
		</div>	
	</div>
<%@ include file="includes/footer.jsp" %>