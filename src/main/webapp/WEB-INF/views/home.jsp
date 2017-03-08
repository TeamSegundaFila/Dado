<%@ include file="includes/header.jsp" %>

<div class="row">
	<div class="col-md-12 maincajon">
		<div class="col-md-12 dadomain">
			<a href="lanzar">
				<img id="imgdado" src="resources/img/dado.png" alt="Dado button"/>
			</a>
			<p>Pruebe a lanzar el dado (Clickeando en la imagen) para elegir el afortunado. ¡La magia del azar le está esperando! <p> 
	        <c:if test="${not empty afortunado}">
				<h2><b> El afortunado es: ${afortunado} </b></h2>
			</c:if>
	        <c:if test="${empty afortunado && ultimos == null}">
				<p><b> No hay usuarios activos o registrados </b></p>
			</c:if>
		</div>
		<div class="col-md-12">
			<div class="col-md-6">
				<c:if test="${estadisticas.size()>0 }">
					<h2>Ranking Lanzamientos Historico</h2>
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
				<h2>Ultimos 5 Lanzamientos</h2>
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