package control;

import repositories.EstacionamientoRepositoryImpl;

public class EstacionamientoControllerImpl implements EstacionamientoController{
    private EstacionamientoRepositoryImpl estacionamientos=new EstacionamientoRepositoryImpl();

	@Override
	public void generarEstacionamiento(String matricula) {
		estacionamientos.crearEstacionamiento(matricula);		
	}

}
