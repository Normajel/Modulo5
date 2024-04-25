package Grupal1M5_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/informacion-carga")
public class Inicio extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Variables para la carga de clientes
    private int clientesCargados = 0;
    private int ProfesionalesCargados = 0;
    private int AdministrativosCargados = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Información de Carga</title></head>");
        out.println("<body>");
        out.println("<h1>Información de Carga de Clientes</h1>");
        out.println("<p>Total de Clientes Cargados: " + clientesCargados + "</p>");
        out.println("<p>Clientes Profesionales Cargados: " + ProfesionalesCargados + "</p>");
        out.println("<p>Clientes Administrativos Cargados: " + AdministrativosCargados + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    // Método para actualizar la carga de clientes
    protected void cargarClientes(int cantidad) {
        clientesCargados += cantidad;
    }
    
    // Método para actualizar la carga de clientes profesionales
    protected void cargarProfesionales(int cantidad) {
        ProfesionalesCargados += cantidad;
        cargarClientes(cantidad);
    }
    
    // Método para actualizar la carga de clientes administrativos
    protected void cargarAdministrativos(int cantidad) {
        AdministrativosCargados += cantidad;
        cargarClientes(cantidad);
    }
}
