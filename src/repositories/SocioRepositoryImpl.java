package repositories;

import java.util.ArrayList;
import java.util.Iterator;

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

		boolean eliminado = false;
		Iterator iterator = listaSocios.iterator();
		while (iterator.hasNext()) {
			String abonadoelemento = (String) iterator.next();

			if (eliminado == false) {
				iterator.remove();
				eliminado = true;
			}
		}

	}

}
