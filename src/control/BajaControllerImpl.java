package control;

import repositories.AbonadoRepository;
import repositories.SocioRepository;


public class BajaControllerImpl implements BajaController {
	private SocioRepository repositorioSocios;
	private AbonadoRepository repositorioAbonados;

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

	public BajaControllerImpl(SocioRepository repositorioSocios, AbonadoRepository repositorioAbonados) {
		super();
		this.repositorioSocios = repositorioSocios;
		this.repositorioAbonados = repositorioAbonados;
	}

}
