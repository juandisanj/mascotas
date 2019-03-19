<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Mascotas</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>
<body>

	<h1>Lista de mascotas</h1>

	<div class="row page-header">
		<div class="col-lg-12">
			<form class="form-inline" action="/" method="POST">
				<div class="form-group">
					<select	id="nacimiento" name="estado" class="form-control">
						<option value="todos">Todos</option>
						<c:forEach items="${listaEstados}" var="estado">
							<option value="${estado}" selected>${estado}</option>
						</c:forEach>
					</select>
				</div>
				<button type="submit" class="btn btn-primary">Buscar</button>
			</form>
		</div>
	</div>
	

	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Codigo</th>
				<th scope="col">Nombre</th>
				<th scope="col">Propietario</th>
				<th scope="col">Estado</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaMascotas}" var="mascota">
				<tr>
					<th scope="row"><c:out value="${mascota.codigo}" /></th>
					<td><c:out value="${mascota.nombre}" /></td>
					<td><c:out value="${mascota.propietario.nombre}" /></td>
					<td><c:out value="${mascota.estado}" /></td>
					<td><a href="mascota/${mascota.codigo}" role="button">Modificar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>