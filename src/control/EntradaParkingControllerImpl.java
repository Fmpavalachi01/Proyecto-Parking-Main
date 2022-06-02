package control;

import repositories.AbonadoRepositoryImpl;
import repositories.SocioRepositoryImpl;


public class EntradaParkingControllerImpl implements EntradaParkingController {
	private AbonadoRepositoryImpl repositorioAbonados=new AbonadoRepositoryImpl();
	private SocioRepositoryImpl repositorioSocio=new SocioRepositoryImpl();

	@Override
	public boolean entradaParking(String matricula) {
		if (repositorioSocio.isSocio(matricula) == true) {
             		return true;
		} else if (repositorioAbonados.isAbonado(matricula) == true
					&& repositorioAbonados.getBonoDentroDeHorario(matricula) == true) {
				return true;
			}
		return false;
	}


}
