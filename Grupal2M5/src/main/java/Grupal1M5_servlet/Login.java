package Grupal1M5_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validar_login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Validar el usuario y la contraseña (simulación)
        if ("admin".equals(usuario) && "123456".equals(contrasena)) {
            // Usuario y contraseña válidos, redirigir a una página de bienvenida
            response.sendRedirect("bienvenida.jsp");
        } else {
            // Usuario o contraseña incorrectos, mostrar un mensaje de error
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>Error de inicio de sesión</title></head>");
            out.println("<body>");
            out.println("<h1>Error de inicio de sesión</h1>");
            out.println("<p>Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
