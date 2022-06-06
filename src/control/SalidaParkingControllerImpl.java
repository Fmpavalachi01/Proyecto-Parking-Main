package control;

import java.time.LocalDateTime;

import repositories.AbonadoRepository;
import repositories.EstacionamientoRepository;
import repositories.SocioRepository;


public class SalidaParkingControllerImpl implements SalidaParkingController {
	private EstacionamientoRepository estacionamientoRepository;
    private SocioRepository socioRepository;
    private AbonadoRepository abonadoRepository;
	@Override
	public boolean salirDelParking(String matricula) {
        boolean salida=true;
        if (socioRepository.isSocio(matricula)==false && abonadoRepository.isAbonado(matricula)==false) {		
        	if (estacionamientoRepository.controlarPeriodoDeGracia(matricula,LocalDateTime.now())==false) {
        		salida= false;
        	}
		}
        return salida;
	}
	public SalidaParkingControllerImpl(EstacionamientoRepository estacionamientoRepository,
			SocioRepository socioRepository, AbonadoRepository abonadoRepository) {
		super();
		this.estacionamientoRepository = estacionamientoRepository;
		this.socioRepository = socioRepository;
		this.abonadoRepository = abonadoRepository;
	}
	
}
