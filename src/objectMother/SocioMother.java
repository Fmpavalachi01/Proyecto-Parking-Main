package objectMother;

import java.util.ArrayList;

import model.Socio;

public class SocioMother {


	public ArrayList<Socio> creaSocios() {
		String[] matriculasEntrada = { "abcd1", "abcd2", "1234a", "1234b" };
		int[] numeroPlaza = { 1, 2, 3, 4 };
		int[] tarjetas = { 123, 234, 345, 456 };
		String[] nombre = { "Elena", "Florian", "Adrian", "Inma" };
		ArrayList<Socio> misSocios = new ArrayList<Socio>();

		// con el primer if controlo que la matricula no esté vacia
		// si lo cumple retorna true y lo añade al arraylist, sino false
		for (int j = 0; j < matriculasEntrada.length; j++) {

			if (matriculasEntrada[j] != null) {
				misSocios.add(new Socio(numeroPlaza[j], matriculasEntrada[j], nombre[j], tarjetas[j]));
			}
		}

		return misSocios;
	}

}
