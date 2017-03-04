<%@ include file="includes/header.jsp" %>

		<div id="cabecera">
			<h1>
				Proyecto Dado 
			</h1>
			<h3>
				- Fila #2 -
			</h3>
		</div>
		
		<div class="container">
		<div class="col2-left">
			<h2>Ranking Usuarios</h2>
				<ol>
				<c:forEach items="${estadisticas}" var="e">
					<li>${e.nombre} - ${e.contador}</li>
				</c:forEach>
				</ol>
				El ganador es ${estadisticas[0].nombre} !!
		</div>
		<div class="col2-right">
			<p>  La hora según este servidor es ${serverTime}. <p>
			<a href="lanzar">
			<img id="imgdado" src="resources/img/dado.gif" alt="Dado button"/>
			</a>
			<p>  Pruebe a lanzar los dados para elegir el afortunado. ¡La magia del azar le está esperando! <p>
		</div>
		</div>
		
		
		<c:if test="${afortunado != null}">
			<div id="cabecera">
				<h2>El afortunado lector voluntario será:</h2>
			</div>
			<c:forEach items="${ultimos}" var="u">
				<div  class="row">
					<div  class="col3-left">
						<img id="imgmagic" src="resources/img/magic.gif" alt="Magia"/>
					</div>
					<div  class="col3-center">
						<h1  class="ganador"> ¡¡ ${u.nombre} !! </h1>
					</div>
					<div  class="col3-right">
						<img id="imgmagic" src="resources/img/magic.gif" alt="Magia"/>
					</div>
				</div>
				<hr>
			</c:forEach>
		</c:if>
	
		<br>
		<br>

<%@ include file="includes/footer.jsp" %>