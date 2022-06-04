package repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import model.Abonado;
import objectMother.AbonadoMother;

public class AbonadoRepositoryImpl implements AbonadoRepository {
	AbonadoMother abonados=new AbonadoMother();
	private ArrayList<Abonado> listaAbonados = abonados.creaAbonados();

	@Override
	public boolean isAbonado(String matricula) {
		boolean existe = false;
		for (Abonado abonadoElemento : listaAbonados) {
			if (abonadoElemento.getMatricula().equalsIgnoreCase(matricula)) {
				existe = true;
			}
		}
		return existe;
	}

	@Override
	public void eliminarAbonadoPorMatricula(String matricula) {

		boolean eliminado = false;
		Iterator iterator = listaAbonados.iterator();
		while (iterator.hasNext()) {
			Abonado abonadoelemento = (Abonado) iterator.next();

			if (eliminado == false) {
				iterator.remove();
				eliminado = true;
			}
		}

	}

	@Override
	public boolean getBonoDentroDeHorario(String matricula) {

		if (getAbonado(matricula).getBono().comprobarDia(LocalDateTime.now())) {
			return true;
		} else {
			return false;
		}
	}

	public Abonado getAbonado(String matricula) {
		Abonado abonadoAdevolver = null;
		for (Abonado abonadoElement : listaAbonados) {
			if (abonadoElement.getMatricula().equalsIgnoreCase(matricula)) {
				abonadoAdevolver = abonadoElement;
			}
		}

		return abonadoAdevolver;

	}
    
	public String getNombre(String matricula) {
		String nombre="";
		for (Abonado abonado : listaAbonados) {
			if (abonado.getMatricula().equalsIgnoreCase(matricula)) {
				nombre=abonado.getNombre();
			}
		}
		return nombre;
	}
}
