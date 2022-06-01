package repositories;

import model.Estacionamiento;

public interface EstacionamientoRepository {
	public void incrementarPlazasOcupadas();

	public void disminuirPlazasOcupadas();
	
	public int mostrarNumeroPlazasDisponibles();

	public void crearEstacionamiento(String matricula);

	public Estacionamiento getEstacionamiento(String matricula);
	
	public boolean getExistenciaEstacionamiento(String matricula);

	public double getTarifaTotal(String matricula);

	public boolean controlarPeriodoDeGracia(String matricula);
}
