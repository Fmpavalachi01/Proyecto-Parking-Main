package control;

import repositories.EstacionamientoRepository;

public class EstacionamientoControllerImpl implements EstacionamientoController{
    private EstacionamientoRepository estacionamientos;

	@Override
	public void generarEstacionamiento(String matricula) {
		estacionamientos.crearEstacionamiento(matricula);		
	}

	public EstacionamientoControllerImpl(EstacionamientoRepository estacionamientos) {
		super();
		this.estacionamientos = estacionamientos;
	}

}
