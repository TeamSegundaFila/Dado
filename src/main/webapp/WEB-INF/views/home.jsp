<%@ include file="includes/header.jsp" %>

<div class="row">
	<div class="col-md-12 maincajon">
		<div class="col-md-12 dadomain">
			<a href="lanzar">
				<img id="imgdado" src="resources/img/dado.gif" alt="Dado button"/>
			</a>
			<p>Pruebe a lanzar los dados para elegir el afortunado. �La magia del azar le est� esperando! <p> 
	       <c:if test="${not empty afortunado && ultimos != null}">
				<h2><b> El afortunado es: ${afortunado} </b></h2>
			</c:if>
	        <c:if test="${empty afortunado && ultimos != null}">
				<p><b> No hay usuarios activos o registrados </b></p>
			</c:if>
		</div>
		<div class="col-md-12">
			<div class="col-md-6">
				<c:if test="${estadisticas.size()>0 }">
					<h2>Ranking Lanzamientos</h2>
					<ol>
						<c:forEach items="${estadisticas}" var="e">
							<li>${e.nombre} - ${e.contador}</li>
						</c:forEach>
					</ol>
				</c:if>
				<c:if test="${estadisticas.size()== 0}">
					<p> No hay lanzamientos </p>
				</c:if>
			</div>
			<div class="col-md-6">
				<h2>Historial de lanzamientos del dado</h2>
				<ul>
					<c:forEach items="${ultimos}" var="u">
							<li>#${u.id} ${u.nombre} - ${u.fecha}</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		
		
	</div>
</div>
		
		
		
		
		

<%@ include file="includes/footer.jsp" %>