<%@ include file="../includes/header.jsp" %>
		
	<div class="row">
		<div class="col-md-12 maincajon">		
			<h2>Listado usuarios</h2>
			<c:if test="${not empty msg}">
				<p class="alert alert-success" role="alert">${msg}</p>
			</c:if>
			<a href="admin/usuario/edit" class="btn btn-default">Crear nuevo usuario</a><br><br>
			<div class="col-md-12">
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
		</div>
	</div>
		
<%@ include file="../includes/footer.jsp" %>
	
