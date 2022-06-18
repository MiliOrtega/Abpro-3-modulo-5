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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/CrearUsuarios.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre = request.getParameter("nombre"); 
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String tipoUsuario = request.getParameter("tipoUsuario");
		
						
		PrintWriter salida;
		response.setContentType("text/html");
		salida = response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1> Usuario Creado </h1>");
		salida.println("<p> Sr/a: "+nombre+ " " + " "  + apellido + "</p>");
		salida.println("<p> Correo electronico: "+ email +"</p>");
		salida.println("<p> Tipo de Usuario: "+ tipoUsuario +"</p>");
		salida.println("<spam>"+ "Usuario creado exitosamente" +"</spam>");
		salida.println("</body><html>");
		
		salida.close();
	}
	

}
