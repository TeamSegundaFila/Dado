<%@ include file="../includes/header.jsp" %>

<div class="row">
	<div class="col-md-12 maincajon">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<span><a href="admin" class="btn btn-default">Volver</a></span>
			<c:if test="${not empty msg}">
				<p class="alert alert-success" role="alert">${msg}</p>
			</c:if>
			<h2>CRUD Usuarios</h2>
			<form:form action="usuario/crear" modelAttribute="usuario">
				<label>Id:</label>
				<form:input class="form-control" path="id" readonly="true"/><br><br>
				<label>Nombre:</label>
				<form:input class="form-control" path="nombre"/><br>
				<form:errors path="nombre" cssStyle="color:red;"/><br>
				<label>Fecha Alta:</label>
				<form:input class="form-control" path="fechaAlta" readonly="true"/><br><br>
				<label>Fecha Modificacion:</label>
				<form:input class="form-control" path="fechaModificacion" readonly="true"/><br><br>
				<label>Fecha Baja:</label>
				<form:input class="form-control" path="fechaBaja" readonly="true"/><br><br>
				<c:choose>
					<c:when test="${usuario.id == -1}">
						<form:button type="submit" class="btn btn-primary margin1">Crear</form:button>
					</c:when>
					<c:otherwise>
						<form:button type="submit" class="btn btn-primary margin1">Modificar</form:button>
					</c:otherwise>
				</c:choose>
			</form:form>
			<form:form action="usuario/altasbajas" modelAttribute="usuario">
				<form:hidden path="id"/>
				<form:hidden path="fechaBaja"/>
				<c:if test="${usuario.fechaBaja == null && usuario.id != -1}">
					<form:button type="submit" class="btn btn-info margin1">Dar de baja</form:button>
				</c:if>
				<c:if test="${usuario.fechaBaja != null && usuario.id != -1}">
					<form:button type="submit" class="btn btn-info  margin1">Dar de alta</form:button>
				</c:if>
			</form:form>
			<form:form action="usuario/eliminar" modelAttribute="usuario">
				<form:hidden path="id"/>
				<form:button type="submit" class="btn btn-danger">Eliminar</form:button>
			</form:form>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>
<%@ include file="../includes/footer.jsp" %>