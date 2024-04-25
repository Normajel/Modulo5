<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión</title>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="Inicio.jsp">Inicio</a></li>
                <li><a href="Contacto.jsp">Contacto</a></li>
                <li><a href="crearCapacitacion.jsp">CrearCapacitación</a></li>
                <li><a href="listarCapacitacion.jsp">ListarCapacitación</a></li>
                <li><a href="CrearLogin.jsp">CrearUsuario</a></li>
            </ul>
        </nav>
    </header>
    <h1>Iniciar Sesión</h1>
    <form action="validar_login.jsp" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" id="usuario" name="usuario" required><br><br>
        
        <label for="contrasena">Contraseña:</label>
        <input type="password" id="contrasena" name="contrasena" required><br><br>
        
        <input type="submit" value="Iniciar Sesión">
    </form>
</body>
</html>
