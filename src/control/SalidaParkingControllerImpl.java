package control;

import java.time.LocalDateTime;

import repositories.EstacionamientoRepositoryImpl;

public class SalidaParkingControllerImpl implements SalidaParkingController {
	private EstacionamientoRepositoryImpl estacionamientoRepository=new EstacionamientoRepositoryImpl();

	@Override
	public boolean salirDelParking(String matricula) {

		if (estacionamientoRepository.controlarPeriodoDeGracia(matricula,LocalDateTime.now())) {
			return true;
		} else {
			return false;
		}

	}
}
