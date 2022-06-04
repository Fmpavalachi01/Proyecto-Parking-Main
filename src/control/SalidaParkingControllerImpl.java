package control;

import java.time.LocalDateTime;

import repositories.AbonadoRepositoryImpl;
import repositories.EstacionamientoRepositoryImpl;
import repositories.SocioRepositoryImpl;

public class SalidaParkingControllerImpl implements SalidaParkingController {
	private EstacionamientoRepositoryImpl estacionamientoRepository=new EstacionamientoRepositoryImpl();
    private SocioRepositoryImpl socioRepository= new SocioRepositoryImpl();
    private AbonadoRepositoryImpl abonadoRepository= new AbonadoRepositoryImpl();
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
}
