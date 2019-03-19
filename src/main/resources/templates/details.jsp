<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mascota</title>
<link rel="stylesheet" href="/bootstrap-4.3.1/css/bootstrap.min.css">
<script src="/bootstrap-4.3.1-dist/js/jquery-3.3.1.slim.min.js"></script>
<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<ul class="list-group">
		<li class="list-group-item">${mascota.codigo}</li>
		<li class="list-group-item">${mascota.nombre}</li>
		<li class="list-group-item">${mascota.descripcion}</li>
		<li class="list-group-item">${mascota.estado}</li>
		<li class="list-group-item">${mascota.nacimiento}</li>
		<li class="list-group-item">${mascota.visitas}</li>
		<li class="list-group-item">${mascota.propietario.apellido}, ${mascota.propietario.nombre}</li>
	</ul>
	
	<a href="<spring:url value="/index.jsp" />">Menú</a>

</body>
</html>