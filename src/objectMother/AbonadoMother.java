package objectMother;

import java.util.ArrayList;

import model.Abonado;
import model.Bono;

public class AbonadoMother {


	public ArrayList<Abonado> creaAbonados() {
		ArrayList<Abonado> misAbonados = new ArrayList<Abonado>();
		String[] matriculaEntrada = {"cba123","cba321","abc123","abc321"};
		Bono[] bonoEntrada = { Bono.diario, Bono.findeSemana, Bono.diario, Bono.findeSemana };
		int[] tarjetas = { 123, 234, 345, 456 };
		String[] nombre = { "Elena", "Florian", "Adrian", "Inma" };
		for (int i = 0; i < bonoEntrada.length; i++) {

			if (matriculaEntrada[i] != null && bonoEntrada[i] != null) {
				misAbonados.add(new Abonado(bonoEntrada[i], matriculaEntrada[i],nombre[i], tarjetas[i]));

			}
		}

		return misAbonados;
	}

}