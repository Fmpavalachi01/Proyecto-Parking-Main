package objectMother;

import java.util.ArrayList;

import model.Abonado;
import model.Bono;

public class AbonadoMother {

	private ArrayList<Abonado> misAbonados = new ArrayList<Abonado>();
	private String[] matriculaEntrada = {"cba123","cba321","abc123","abc321"};
	private Bono[] bonoEntrada = { Bono.diario, Bono.findeSemana, Bono.diario, Bono.findeSemana };
	private int[] tarjetas = { 123, 234, 345, 456 };
	private String[] nombre = { "Elena", "Florian", "Adrian", "Inma" };

	public ArrayList<Abonado> creaAbonados(String matriculaEntrada, Bono bonoEntrada) {
		for (int i = 0; i < this.bonoEntrada.length; i++) {

			if (this.matriculaEntrada[i] != null && this.bonoEntrada[i] != null) {
				misAbonados.add(new Abonado(this.bonoEntrada[i], this.matriculaEntrada[i],this.nombre[i], this.tarjetas[i]));

			}
		}

		return misAbonados;
	}

}