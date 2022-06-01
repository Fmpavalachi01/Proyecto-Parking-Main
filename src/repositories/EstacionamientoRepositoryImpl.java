package repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Estacionamiento;

public class EstacionamientoRepositoryImpl implements EstacionamientoRepository {
	private ArrayList<Estacionamiento> estacionamiento = new ArrayList<Estacionamiento>();
	private final int numeroPlazas = 100;
	private int plazasOcupadas = 0;

	@Override
	public void incrementarPlazasOcupadas() {
		plazasOcupadas++;

	}

	@Override
	public void disminuirPlazasOcupadas() {
		plazasOcupadas--;

	}

	@Override
	public int mostrarNumeroPlazasDisponibles() {

		return numeroPlazas - plazasOcupadas;
	}

	@Override
	public void crearEstacionamiento(String matricula) {
		estacionamiento.add(new Estacionamiento(LocalDateTime.now(), matricula));
	}

	@Override
	public Estacionamiento getEstacionamiento(String matricula) {
		Estacionamiento estacionamientoAdevolver = null;
		for (Estacionamiento estacionamientoelemento : estacionamiento) {
			//coomparar que la matricula del estacionamiento sea igual que la que entra, si pasa eso
			// guardamos el estacionamiento elemento en la variable a devolver.
			if (estacionamientoelemento.getMatricula().equalsIgnoreCase(matricula)) {
				estacionamientoAdevolver = estacionamientoelemento;
			}
		}
		return estacionamientoAdevolver;
	}

	@Override
	public boolean getExistenciaEstacionamiento(String matricula) {
		if (getEstacionamiento(matricula) != null) {
			return true;
		} else {

			return false;
		}
	}

	@Override
	public double getTarifaTotal(String matricula) {
		Estacionamiento actual=getEstacionamiento(matricula);
		double tarifaTotal = actual.calcularMinutosEstacionamiento(actual.getHoraEntrada(),actual.getHoraSalida())*actual.getTarifaPorMinuto();
		return tarifaTotal;
	}

	@Override
	public boolean controlarPeriodoDeGracia(String matricula, LocalDateTime horaPago) {
		Estacionamiento actual=getEstacionamiento(matricula);
		double diferenciaMinutos = actual.calcularMinutosEstacionamiento(actual.getHoraSalida(), horaPago);
		if (diferenciaMinutos < 20) {
			return true;
		}
		return false;
	}

}
