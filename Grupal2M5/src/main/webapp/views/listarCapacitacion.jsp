<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Capacitaciones</title>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="Inicio.jsp">Inicio</a></li>
                <li><a href="Contacto.jsp">Contacto</a></li>
                <li><a href="crearCapacitacion.jsp">CrearCapacitación</a></li>
                <li><a href="listarCapacitacion.jsp">ListarCapacitación</a></li>
                <li><a href="crearLogin.jsp">CrearUsuario</a></li>
            </ul>
        </nav>
    </header>
   <h1>Listado de Capacitaciones</h1>
    <table>
        <tr>
            <th>Identificador</th>
            <th>RUT del Cliente</th>
            <th>Día</th>
            <th>Hora</th>
            <th>Fecha</th>
            <th>Lugar</th>
            <th>Cantidad de Asistentes</th>
        </tr>
        <!-- Iterar sobre la lista de capacitaciones y mostrar cada una en una fila de la tabla -->
        <c:forEach var="capacitacion" items="${listaCapacitaciones}">
            <tr>
                <td>${capacitacion.identificador}</td>
                <td>${capacitacion.rut}</td>
                <td>${capacitacion.dia}</td>
                <td>${capacitacion.hora}</td>
                <td>${capacitacion.fecha}</td>
                <td>${capacitacion.lugar}</td>
                <td>${capacitacion.cantidadAsistentes}</td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <a href="/formulario-crear-capacitacion">Crear Nueva Capacitación</a> <!-- Enlace al formulario de creación -->
</body>
</html>
