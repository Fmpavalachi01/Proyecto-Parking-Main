package objectMother;

import java.util.ArrayList;

import model.Socio;

public class SocioMother {

	private String[] matriculasEntrada = { "abcd1", "abcd2", "1234a", "1234b" };
	private int[] numeroPlaza = { 1, 2, 3, 4 };
	private int[] tarjetas = { 123, 234, 345, 456 };
	private String[] nombre = { "Elena", "Florian", "Adrian", "Inma" };

	public ArrayList<Socio> creaSocios() {
		ArrayList<Socio> misSocios = new ArrayList<Socio>();

		// con el primer if controlo que la matricula no esté vacia
		// si lo cumple retorna true y lo añade al arraylist, sino false
		for (int j = 0; j < this.matriculasEntrada.length; j++) {

			if (this.matriculasEntrada[j] != null) {
				misSocios.add(new Socio(this.numeroPlaza[j], this.matriculasEntrada[j], this.nombre[j], this.tarjetas[j]));
			}
		}

		return misSocios;
	}

}
