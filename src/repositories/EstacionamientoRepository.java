package repositories;

import java.time.LocalDateTime;

import model.Estacionamiento;

public interface EstacionamientoRepository {
	public void incrementarPlazasOcupadas();

	public void disminuirPlazasOcupadas();
	
	public int mostrarNumeroPlazasDisponibles();

	public void crearEstacionamiento(String matricula);

	public Estacionamiento getEstacionamiento(String matricula);
	
	public boolean getExistenciaEstacionamiento(String matricula);

	public double getTarifaTotal(String matricula);

	public boolean controlarPeriodoDeGracia(String matricula, LocalDateTime horaPago);
	public void setHoraSalida(LocalDateTime now, String matricula);
}
