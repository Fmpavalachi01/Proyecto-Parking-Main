package repositories;

import java.util.ArrayList;

import model.Socio;
import objectMother.SocioMother;

public class SocioRepositoryImpl implements SocioRepository {

	private SocioMother socioMother;
	ArrayList<Socio> listaSocios = socioMother.creaSocios();

	@Override
	public boolean isSocio(String matricula) {
		boolean existe = false;
		for (Socio socioElemento : listaSocios) {
			if (socioElemento.getMatricula().equalsIgnoreCase(matricula)) {
				existe = true;
			}
		}
		return existe;
	}

	@Override
	public void eliminarSocioByMatricula(String matricula) {
		for (Socio socioElement : listaSocios) {
			if (socioElement.getMatricula().equalsIgnoreCase(matricula)) {
				listaSocios.remove(socioElement);
			}
		}

	}

}
