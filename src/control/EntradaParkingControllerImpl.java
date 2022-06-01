package control;

import repositories.AbonadoRepository;
import repositories.SocioRepository;


public class EntradaParkingControllerImpl implements EntradaParkingController {
	private AbonadoRepository repositorioAbonados;
	private SocioRepository repositorioSocio;

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
