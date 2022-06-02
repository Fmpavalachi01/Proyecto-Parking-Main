package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.BajaControllerImpl;

class BajaControllerImplTest {

	@Test
	void test() {
		
		BajaControllerImpl controlador = new BajaControllerImpl();
		assertFalse(controlador.darDeBaja("9999"));

	}

}
