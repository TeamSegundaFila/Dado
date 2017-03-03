<%@ include file="../includes/header.jsp" %>
			
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
			<table class="tablePlugin" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombre</th>
						<th>Fecha Alta</th>
						<th>Fecha Modificacion</th>
						<th>Fecha Baja</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${usuarios}" var="u">
					<tr>
						<td>${u.id}</td>
						<td><a href="admin/usuario/edit/${u.id}">${u.nombre}</a></td>
						<td>${u.fechaAlta}</td>
						<td>${u.fechaModificacion}</td>
						<td>${u.fechaBaja}</td>
					</tr>		
					</c:forEach>
				</tbody>	
			</table>
		</div>
		<a href="admin/usuario/edit">Crear nuevo usuario</a>
		<br>
		<br>
		<hr>
		<br>
		
<%@ include file="../includes/footer.jsp" %>
	
