package control;

import java.time.LocalDateTime;

import repositories.EstacionamientoRepository;

public class SalidaParkingControllerImpl implements SalidaParkingController {
	private EstacionamientoRepository estacionamientoRepository;

	@Override
	public boolean salirDelParking(String matricula) {

		if (estacionamientoRepository.controlarPeriodoDeGracia(matricula,LocalDateTime.now())) {
			return true;
		} else {
			return false;
		}

	}
}
