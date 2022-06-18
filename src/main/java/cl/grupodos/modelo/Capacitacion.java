package cl.grupodos.modelo;

public class Capacitacion {
	private String id;
	private String nombreCapacitacion;
	private String Lugar;
	private String hora;
	
	public Capacitacion () {
		
	}
	
	
	public Capacitacion(String id, String nombreCapacitacion, String lugar, String hora) {
		super();
		this.id = id;
		this.nombreCapacitacion = nombreCapacitacion;
		Lugar = lugar;
		this.hora = hora;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}


	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}


	public String getLugar() {
		return Lugar;
	}


	public void setLugar(String lugar) {
		Lugar = lugar;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
	

}
