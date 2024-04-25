<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Contacto</title>
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
    <h1>Formulario de Contacto</h1>
    <form action="formulario-contacto" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="email">Correo Electrónico:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="consulta">Consulta:</label><br>
        <textarea id="consulta" name="consulta" rows="5" cols="40" required></textarea><br><br>
        
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
