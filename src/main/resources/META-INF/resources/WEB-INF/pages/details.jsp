<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos de la mascota</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
<h1>Datos de la mascota</h1>
	<ul class="list-group">
		<li class="list-group-item">Código: ${mascota.codigo}</li>
		<li class="list-group-item">Nombre: ${mascota.nombre}</li>
		<li class="list-group-item">Especie: ${mascota.descripcion}</li>
		
			<c:choose>
				<c:when test="${mascota.estado == 'INGRESADO'}">
					<li class="list-group-item" style="color: red;">Estado: ${mascota.estado}</li>
				</c:when>
				<c:otherwise>
					<li class="list-group-item" style="color: green">Estado: ${mascota.estado}</li>
				</c:otherwise>
			</c:choose>
		
		<li class="list-group-item">Fecha de nacimiento: <fmt:formatDate value="${mascota.nacimiento}" pattern="dd-MM-yyyy" /></li>
		<li class="list-group-item">Número de visitas: ${mascota.visitas}</li>
		<li class="list-group-item">Propietario: ${mascota.propietario.apellidos}, ${mascota.propietario.nombre}</li>
	</ul>
	
	<a href="/"><button type="button" class="btn btn-primary btn-lg btn-block">Menú</button></a>

</body>
</html>