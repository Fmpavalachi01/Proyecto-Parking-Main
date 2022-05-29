package repositories;

import model.Estacionamiento;

public interface EstacionamientoRepository {
	public void incrementarPlazasOcupadas();

	public void disminuirPlazasOcupadas();
	
	public int mostrarNumeroPlazasDisponibles();

	public void crearEstacionamiento(String matricula);

	public Estacionamiento getEstacionamiento(String matricula);
}
