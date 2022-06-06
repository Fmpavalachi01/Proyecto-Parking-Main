package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.BajaControllerImpl;
import repositories.AbonadoRepositoryImpl;
import repositories.SocioRepositoryImpl;

class BajaControllerImplTest {

	@Test
	void test() {
		
		SocioRepositoryImpl miSocio = new SocioRepositoryImpl();
		AbonadoRepositoryImpl miAbonado = new AbonadoRepositoryImpl();

		BajaControllerImpl controlador = new BajaControllerImpl(miSocio, miAbonado);
		assertFalse(controlador.darDeBaja("9999"));

	}

}
