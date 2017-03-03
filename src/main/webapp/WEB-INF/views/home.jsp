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
			<p>  La hora seg�n este servidor es ${serverTime}. <p>
			<a href="lanzar">
			<img id="imgdado" src="resources/img/dado.gif" alt="Dado button"/>
			</a>
			<p>  Pruebe a lanzar los dados para elegir el afortunado. �La magia del azar le est� esperando! <p>
		</div>
		
		
		<c:if test="${afortunado != null}">
		<div  class="row">
			<div  class="col3-left">
				<img id="imgmagic" src="resources/img/magic.gif" alt="Magia"/>
			</div>
			<div  class="col3-center">
				<h2>El afortunado en leer es:  </h2>
				<h2> �� ${afortunado} !! </h2>
			</div>
			<div  class="col3-right">
				<img id="imgmagic" src="resources/img/magic.gif" alt="Magia"/>
			</div>
		</div>
		<hr>
		</c:if>
		
		<br>
		<br>

<%@ include file="includes/footer.jsp" %>