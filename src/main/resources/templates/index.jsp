<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Mascotas</title>
<link rel="stylesheet" href="/bootstrap-4.3.1/css/bootstrap.min.css">
<script src="/bootstrap-4.3.1-dist/js/jquery-3.3.1.slim.min.js"></script>
<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>

</head>
<body>

<h1>Lista de mascotas</h1>

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
      <td><a href="mascota/${mascota.codigo}" role="button"></a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>