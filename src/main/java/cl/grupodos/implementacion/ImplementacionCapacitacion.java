package cl.grupodos.implementacion;

import java.util.List;

import cl.grupodos.interfaces.ICapacitacion;
import cl.grupodos.lista.ListaCapacitacion;
import cl.grupodos.modelo.Capacitacion;

public class ImplementacionCapacitacion implements ICapacitacion {
	
	public ImplementacionCapacitacion() {
		ListaCapacitacion.getInstance().getList().add(new Capacitacion("123", "Primeros Auxilios", "Online", "15:00"));
		ListaCapacitacion.getInstance().getList().add(new Capacitacion("124", "Primeros Auxilios Neonatos", "Online", "18:00"));
		ListaCapacitacion.getInstance().getList().add(new Capacitacion("125", "Prevencion y Combate de Fuego", "Online", "12:00"));
	}



	@Override
	public Capacitacion get(String id) {
		for (Capacitacion c: ListaCapacitacion.getInstance().getList()) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		
		return null;
		
	}

	@Override
	public List<Capacitacion> getAll() {
				return ListaCapacitacion.getInstance().getList();
	}

	@Override
	public void addCapacitacion(Capacitacion capacitacion) {
		ListaCapacitacion.getInstance().getList().add(capacitacion);
		
	}}
