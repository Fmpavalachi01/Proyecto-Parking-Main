package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.SalidaParkingControllerImpl;
import repositories.AbonadoRepositoryImpl;
import repositories.EstacionamientoRepositoryImpl;
import repositories.SocioRepositoryImpl;

class SalidaParkingControllerImplTest {

	@Test
	void testSalida() {
		
		EstacionamientoRepositoryImpl estacionamiento = new EstacionamientoRepositoryImpl();
		SocioRepositoryImpl socio = new SocioRepositoryImpl();
		AbonadoRepositoryImpl abonado = new AbonadoRepositoryImpl();

		SalidaParkingControllerImpl salirTest = new SalidaParkingControllerImpl(estacionamiento, socio, abonado);

		String matriculaTest = "4676NAH";

		// Controlamos si la matricula es la correcta para salir

		assertTrue(salirTest.salirDelParking(matriculaTest));

	}
}
