<%@ include file="includes/header.jsp" %>

	<div  class="row">
		<div class="col-md-12 maincajon">
			<div class="col-md-6">
				<c:if test="${estadisticas.size()>0 }">
					<h3>Ranking Lanzamientos de usuarios activos</h3>
					<ol>
					<c:forEach items="${estadisticas}" var="e">
						<li>${e.nombre} - ${e.contador}</li>
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
							<li>${t.nombre} - ${t.probabilidad}%</li>
						</c:forEach>
					</ul>
				</c:if>
				<c:if test="${estadisticasTotales.size()== 0}">
					<h2> No hay lanzamientos </h2>
				</c:if>
			</div>
		</div>
		<div class="col-md-12 totaltiradas">
			<p>Total de lanzamientos : ${total} Lanzamientos</p>
		</div>
		<div class="col-md-12 tablalanzamientos">
			<h3>Historial de lanzamientos del dado</h3>
			<table class="tablePlugin" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombre</th>
						<th>Fecha</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ultimos}" var="u">
						<tr>
							<td>${u.id}</td>
							<td>${u.nombre}</td>
							<td>${u.fecha}</td>
						</tr>		
					</c:forEach>
				</tbody>	
			</table>
		</div>	
	</div>
<%@ include file="includes/footer.jsp" %>