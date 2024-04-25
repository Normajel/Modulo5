package Grupal1M5_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registro_usuario")
public class CrearLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Mapa para almacenar los usuarios y contraseñas
    private Map<String, String> usuarios = new HashMap<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Formulario de registro de usuario
        out.println("<html>");
        out.println("<head><title>Registro de Usuario</title></head>");
        out.println("<body>");
        out.println("<h1>Registro de Usuario</h1>");
        out.println("<form action=\"registro_usuario\" method=\"post\">");
        out.println("Nombre de usuario: <input type=\"text\" name=\"usuario\" required><br>");
        out.println("Contraseña: <input type=\"password\" name=\"contrasena\" required><br>");
        out.println("<input type=\"submit\" value=\"Registrarse\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Verificar si el usuario ya existe
        if (usuarios.containsKey(usuario)) {
            // El usuario ya existe, mostrar mensaje de error
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>Error de Registro</title></head>");
            out.println("<body>");
            out.println("<h1>Error de Registro</h1>");
            out.println("<p>El usuario " + usuario + " ya existe. Por favor, elige otro nombre de usuario.</p>");
            out.println("</body>");
            out.println("</html>");
        } else {
            // Agregar el nuevo usuario y contraseña al mapa
            usuarios.put(usuario, contrasena);
            
            // Respuesta al cliente
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>Registro Exitoso</title></head>");
            out.println("<body>");
            out.println("<h1>Registro Exitoso</h1>");
            out.println("<p>¡Usuario " + usuario + " registrado correctamente!</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
