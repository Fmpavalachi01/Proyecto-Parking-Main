package control;

import repositories.EstacionamientoRepository;

public class EstacionamientoControllerImpl implements EstacionamientoController{
    EstacionamientoRepository estacionamientos;

	@Override
	public void generarEstacionamiento(String matricula) {
		estacionamientos.crearEstacionamiento(matricula);		
	}

}
