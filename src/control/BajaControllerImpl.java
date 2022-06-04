package control;

import repositories.AbonadoRepositoryImpl;
import repositories.SocioRepositoryImpl;

public class BajaControllerImpl implements BajaController {
	private SocioRepositoryImpl repositorioSocios=new SocioRepositoryImpl();
	private AbonadoRepositoryImpl repositorioAbonados=new AbonadoRepositoryImpl();

	@Override
	public boolean darDeBaja(String matricula) {
		boolean baja = false;
		if (repositorioSocios.isSocio(matricula) == true) {
			repositorioSocios.eliminarSocioByMatricula(matricula);
			baja = true;
		} else if (repositorioAbonados.isAbonado(matricula) == true) {
			repositorioAbonados.eliminarAbonadoPorMatricula(matricula);
			baja = true;
		} else {
			baja = false;
		}
		return baja;
	}

}
