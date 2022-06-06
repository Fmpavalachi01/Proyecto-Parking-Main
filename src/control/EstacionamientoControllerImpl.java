package control;

import repositories.EstacionamientoRepository;
import repositories.EstacionamientoRepositoryImpl;

public class EstacionamientoControllerImpl implements EstacionamientoController{
    private EstacionamientoRepository estacionamientos= new EstacionamientoRepositoryImpl();

	@Override
	public void generarEstacionamiento(String matricula) {
		estacionamientos.crearEstacionamiento(matricula);		
	}

}
