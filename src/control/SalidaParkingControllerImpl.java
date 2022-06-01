package control;

import repositories.EstacionamientoRepository;

public class SalidaParkingControllerImpl implements SalidaParkingController {
	private EstacionamientoRepository estacionamientoRepository;

	@Override
	public boolean salirDelParking(String matricula) {

		if (estacionamientoRepository.controlarPeriodoDeGracia(matricula)) {
			return false;
		} else {
			return true;
		}

	}
}
