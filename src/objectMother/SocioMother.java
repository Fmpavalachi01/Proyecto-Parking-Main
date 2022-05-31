package objectMother;

import java.util.ArrayList;

import model.Socio;

public class SocioMother {

private ArrayList<Socio> misSocios = new ArrayList<Socio>();
	
	public boolean creaSocios(String matriculaEntrada) {
		
		//con el primer if controlo que la matricula no esté vacia
		//si lo cumple retorna true y lo añade al arraylist, sino false
		
		if (matriculaEntrada != null) {
			misSocios.add(new Socio(matriculaEntrada));
			
			return true;
		}
		return false;
		
	}

	public ArrayList<Socio> getMisSocios() {
		return misSocios;
	}
	
}
