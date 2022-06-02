package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.SalidaParkingControllerImpl;

class SalidaParkingControllerImplTest {

	@Test
	void testSalida() {
		
		SalidaParkingControllerImpl salirTest=new SalidaParkingControllerImpl();
		String matriculaTest="4676NAH";
		//Controlamos si la matricula es la correcta para salir
		assertTrue(salirTest.salirDelParking(matriculaTest));
		
	}

}
