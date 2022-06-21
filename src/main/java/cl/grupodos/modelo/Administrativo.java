package cl.grupodos.modelo;

public class Administrativo {
	private String Nombre;
	private String fechaIngreso;
	
	
	public Administrativo() {
		
	}
	
	public Administrativo(String nombre, String fechaIngreso) {
		super();
		Nombre = nombre;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Administrativo [Nombre=" + Nombre + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	

}
