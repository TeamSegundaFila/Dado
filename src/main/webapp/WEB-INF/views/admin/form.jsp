<%@ include file="../includes/header.jsp" %>
			
		<div id="cabecera">
			<h1>
				Backoffice 
			</h1>
			<h3>
				Formulario - CRUD Usuarios
			</h3>
		</div>
		
		
		<div class="container">
			<h2>CRUD Usuarios</h2>
		<form:form action="usuario/crear" modelAttribute="usuario">
			<label>Id:</label>
			<form:input path="id" readonly="true"/><br><br>
			<label>Nombre:</label>
			<form:input path="nombre"/><br>
			<form:errors path="nombre" cssStyle="color:red;"/><br>
			<label>Fecha Alta:</label>
			<form:input path="fechaAlta" readonly="true"/><br><br>
			<label>Fecha Modificacion:</label>
			<form:input path="fechaModificacion" readonly="true"/><br><br>
			<label>Fecha Baja:</label>
			<form:input path="fechaBaja" readonly="true"/><br><br>
			<c:choose>
				<c:when test="${usuario.id == -1}">
					<form:button type="submit">Crear</form:button>
				</c:when>
				<c:otherwise>
					<form:button type="submit">Modificar</form:button>
				</c:otherwise>
			</c:choose>
		</form:form>
		<form:form action="usuario/altasbajas" modelAttribute="usuario">
			<form:hidden path="id"/>
			<form:hidden path="fechaBaja"/>
			<c:if test="${usuario.fechaBaja == null && usuario.id != -1}">
				<form:button type="submit">Dar de baja</form:button>
			</c:if>
			<c:if test="${usuario.fechaBaja != null && usuario.id != -1}">
				<form:button type="submit">Dar de alta</form:button>
			</c:if>
		</form:form>
		<form:form action="usuario/eliminar" modelAttribute="usuario">
			<form:hidden path="id"/>
			<form:button type="submit">Eliminar</form:button>
		</form:form>
		</div>
		
<%@ include file="../includes/footer.jsp" %>