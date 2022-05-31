package objectMother;

import java.util.ArrayList;

import model.Abonado;
import model.Bono;

public class AbonadoMother {

	private ArrayList<Abonado> misAbonados = new ArrayList<Abonado>();

	public boolean creaAbonados(String matriculaEntrada, Bono bonoEntrada) {
		if (matriculaEntrada != null && bonoEntrada != null) {
			misAbonados.add(new Abonado(bonoEntrada, matriculaEntrada));
			return true;
		}
		return false;

	}

	public ArrayList<Abonado> getMisAbonados() {
		return misAbonados;
	}

}