package control;

import repositories.AbonadoRepository;


public class EntradaParkingControllerImpl implements EntradaParkingController {
	private AbonadoRepository repositorioAbonados;
	private EstacionamientoController estacionamientos;
	private UsuarioController usuarios;

	@Override
	public boolean identificarUsuario(String matricula) {
		if (usuarios.getTipoUsuario(matricula) == true) {
			if (usuarios.getTipoCliente(matricula) == true) {
				return true;
			} else if (usuarios.getTipoCliente(matricula) == false
					&& repositorioAbonados.getBonoDentroDeHorario(matricula) == true) {
				return true;
			}
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
