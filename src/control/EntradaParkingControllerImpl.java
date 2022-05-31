package control;

import repositories.AbonadoRepository;
import repositories.SocioRepository;


public class EntradaParkingControllerImpl implements EntradaParkingController {
	private AbonadoRepository repositorioAbonados;
	private EstacionamientoController estacionamientos;
	private SocioRepository repositorioSocio;

	@Override
	public boolean identificarUsuario(String matricula) {
		if (repositorioSocio.isSocio(matricula) == true) {
             		return true;
		} else if (repositorioAbonados.isAbonado(matricula) == false
					&& repositorioAbonados.getBonoDentroDeHorario(matricula) == true) {
				return true;
			}
		return false;
	}

	@Override
	public String entradaParking(boolean identificarUsuario, String matricula) {
		if (identificarUsuario == true) {
            return "Bienvenido Cliente, procediendo a entrar";
		} else {
			estacionamientos.generarEstacionamiento(matricula);
			 return "Bienvenido, procediendo a entrar";
		}

	}

}
