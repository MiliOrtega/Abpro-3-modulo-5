package cl.grupodos.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CrearUsuario() {
        super();
       
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombres = request.getParameter("nombre"); 
		String apellidos = request.getParameter("apellido");
		String correo = request.getParameter("email");
		String tipoUsuario = request.getParameter("tipoUsuario");
		
						
		PrintWriter salida;
		response.setContentType("text/html");
		salida = response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1> Usuario Creado </h1>");
		salida.println("<p> Sr/a: "+nombres+ " " + " "  + apellidos + "</p>");
		salida.println("<p> Correo electronico: "+ correo +"</p>");
		salida.println("<p> Tipo de Usuario: "+ tipoUsuario +"</p>");
		salida.println("<spam>"+ "Usuario creado exitosamente" +"</spam>");
		salida.println("</body><html>");
		
		salida.close();
	}
	

}
