<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="lanzar">
<img src="http://www.reactiongifs.com/r/mgc.gif" alt="Tirar dado"/>
</a>
<c:if test="${afortunado != null}">
<h2> El Afortunado en Leer es: ${afortunado} </h2>
</c:if>
</body>
</html>
