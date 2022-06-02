package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.EstacionamientoControllerImpl;
import repositories.EstacionamientoRepositoryImpl;

class EstacionamientoControllerImplTest {

	@Test
void testGenerarEstacionamiento() {
		
		EstacionamientoControllerImpl controlador = new EstacionamientoControllerImpl();
		EstacionamientoRepositoryImpl repositorio = new EstacionamientoRepositoryImpl();

		String matricula = "123B";
		controlador.generarEstacionamiento(matricula);
		assertTrue(repositorio.getExistenciaEstacionamiento(matricula));
	}


}
