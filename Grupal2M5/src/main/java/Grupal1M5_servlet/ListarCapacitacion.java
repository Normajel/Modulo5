package Grupal1M5_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario-crear-capacitacion")
public class ListarCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Formulario de creación de capacitación
        out.println("<html>");
        out.println("<head><title>Crear Capacitación</title></head>");
        out.println("<body>");
        out.println("<h1>Crear Capacitación</h1>");
        out.println("<form method=\"post\">");
        out.println("Identificador: <input type=\"text\" name=\"identificador\" required><br>");
        out.println("RUT del cliente asociado: <input type=\"text\" name=\"rut\" required><br>");
        out.println("Día de la capacitación: ");
        out.println("<select name=\"dia\">");
        out.println("<option value=\"lunes\">Lunes</option>");
        out.println("<option value=\"martes\">Martes</option>");
        out.println("<option value=\"miércoles\">Miércoles</option>");
        out.println("<option value=\"jueves\">Jueves</option>");
        out.println("<option value=\"viernes\">Viernes</option>");
        out.println("<option value=\"sábado\">Sábado</option>");
        out.println("</select><br>");
        out.println("Hora de la capacitación: <input type=\"time\" name=\"hora\" required><br>");
        out.println("Fecha de la capacitación: <input type=\"date\" name=\"fecha\" required><br>");
        out.println("Lugar de la capacitación: <input type=\"text\" name=\"lugar\" required><br>");
        out.println("Cantidad de asistentes: <input type=\"number\" name=\"cantidad\" required><br>");
        out.println("<input type=\"submit\" value=\"Crear\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar datos del formulario enviado por el cliente
        String identificador = request.getParameter("identificador");
        String rut = request.getParameter("rut");
        String dia = request.getParameter("dia");
        String hora = request.getParameter("hora");
        String fecha = request.getParameter("fecha");
        String lugar = request.getParameter("lugar");
        String cantidadAsistentes = request.getParameter("cantidad");

        // Aquí deberías validar los datos ingresados por el usuario antes de continuar

        // Respuesta al cliente
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Capacitación Creada</title></head>");
        out.println("<body>");
        out.println("<h1>Capacitación Creada</h1>");
        out.println("<p>Se ha creado una capacitación con los siguientes datos:</p>");
        out.println("<p>Identificador: " + identificador + "</p>");
        out.println("<p>RUT del cliente asociado: " + rut + "</p>");
        out.println("<p>Día de la capacitación: " + dia + "</p>");
        out.println("<p>Hora de la capacitación: " + hora + "</p>");
        out.println("<p>Fecha de la capacitación: " + fecha + "</p>");
        out.println("<p>Lugar de la capacitación: " + lugar + "</p>");
        out.println("<p>Cantidad de asistentes: " + cantidadAsistentes + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
