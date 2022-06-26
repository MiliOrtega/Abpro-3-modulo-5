package cl.grupodos.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.grupodos.implementacion.ImplementacionUsuario;
import cl.grupodos.interfaces.IUsuario;
import cl.grupodos.modelo.Usuario;

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
		
		String id = request.getParameter("id");
		String nombres = request.getParameter("nombre"); 
		String apellidos = request.getParameter("apellido");
		String rut = request.getParameter("rut");
		
		
						
		PrintWriter salida;
		response.setContentType("text/html");
		salida = response.getWriter();
		
		
		IUsuario usuarios = new ImplementacionUsuario();
		usuarios.addUsuario(new Usuario(id, nombres, apellidos, rut));
		
		salida.println("<html><body>");
		salida.println("<h1> Usuario Creado </h1>");
		salida.println("<p> ID: "+id+ " " + "</p>");
		salida.println("<p> Sr/a: "+nombres+ " " + " "  + apellidos + "</p>");
		salida.println("<p> Rut: "+rut+ "</p>");
	
		salida.println("<spam>"+ "Usuario creado exitosamente" +"</spam>");
		salida.println("</body><html>");
		
		salida.close();
	}
	

}
