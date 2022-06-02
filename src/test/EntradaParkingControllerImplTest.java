package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.EntradaParkingControllerImpl;
import control.SalidaParkingControllerImpl;

class EntradaParkingControllerImplTest {

	@Test
	void testEntrada() {
		EntradaParkingControllerImpl entrarPrueba= new EntradaParkingControllerImpl();
		
		String matriculaTest="4676NAH";
		//Si la matricula existe que me de positiva la prueba
		assertTrue(entrarPrueba.entradaParking(matriculaTest));
	}

}
