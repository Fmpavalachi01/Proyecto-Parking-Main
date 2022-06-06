package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.EntradaParkingControllerImpl;
import control.SalidaParkingControllerImpl;
import repositories.AbonadoRepositoryImpl;
import repositories.SocioRepositoryImpl;

class EntradaParkingControllerImplTest {

	@Test
	void testEntrada() {
		
		AbonadoRepositoryImpl abonado = new AbonadoRepositoryImpl();
		SocioRepositoryImpl socio = new SocioRepositoryImpl();

		EntradaParkingControllerImpl entrarPrueba = new EntradaParkingControllerImpl(abonado, socio);

		String matriculaTest = "4676NAH";
		// Si la matricula existe que me de positiva la prueba
		assertTrue(entrarPrueba.entradaParking(matriculaTest));
	}

}
