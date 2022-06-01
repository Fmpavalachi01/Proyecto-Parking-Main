package objectMother;

import java.util.ArrayList;

import model.Socio;

public class SocioMother {

	private ArrayList<Socio> misSocios = new ArrayList<Socio>();
	private String[] matriculasEntrada = { "abcd1", "abcd2", "1234a", "1234b" };
	private int[] numeroPlaza = { 1, 2, 3, 4 };

	public ArrayList<Socio> creaSocios() {

		// con el primer if controlo que la matricula no esté vacia
		// si lo cumple retorna true y lo añade al arraylist, sino false
		for (int j = 0; j < this.matriculasEntrada.length; j++) {

			if (this.matriculasEntrada[j] != null) {
				misSocios.add(new Socio(this.numeroPlaza[j], this.matriculasEntrada[j]));
			}
		}

		return misSocios;
	}

}
