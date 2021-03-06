package cl.grupodos.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupodos.conexion.Coneccion;
import cl.grupodos.interfaces.IUsuario;

import cl.grupodos.modelo.Usuario;

public class ImplementacionUsuario implements IUsuario{
	
private Connection coneccion; {
		
	}
	
	public ImplementacionUsuario() {
		coneccion = Coneccion.getInstance();
	}

	@Override
	public Usuario get(int id) {
		
		return null;
	}

	@Override
	public List<Usuario> getAll() {
		String sql = "Select id, Nombre, Apellido, Rut FROM asesorias.usuarios";
		List<Usuario> resultado = new ArrayList <Usuario>();
		try {
			Statement stm = coneccion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				resultado.add(new Usuario(rs.getString("id"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Rut")));
			}
			rs.close();
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
				return resultado;
	}

	@Override
	public void addUsuario(Usuario usuario) {
		
		
String sql = "Insert Usuarios (id, Nombre, Apellido, Rut) values ('"+usuario.getId()+"', '"+usuario.getNombre()+"', '"+usuario.getApellido()+"', '"+ usuario.getRut()+"')";
		
		try {
			Statement stm = coneccion.createStatement();
			stm.execute(sql);
			
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
	}
	
	

}
