<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Información de Carga</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles.css">
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
    
    <!-- Contenido de tu página -->
    <h1>Bienvenido a mi sitio web</h1>
    <div class="container">
        <h1 class="mt-5 mb-4">Información de Carga de Clientes</h1>
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Total de Clientes Cargados</h5>
                        <p class="card-text"><%= request.getAttribute("clientesCargados") %></p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Profesionales Cargados</h5>
                        <p class="card-text"><%= request.getAttribute("ProfesionalesCargados") %></p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Administrativos Cargados</h5>
                        <p class="card-text"><%= request.getAttribute("AdministrativosCargados") %></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

