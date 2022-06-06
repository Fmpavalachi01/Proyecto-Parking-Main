package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.EstacionamientoControllerImpl;
import repositories.EstacionamientoRepositoryImpl;

class EstacionamientoControllerImplTest {

	@Test
	void testGenerarEstacionamiento() {

		EstacionamientoRepositoryImpl miEstacionamiento = new EstacionamientoRepositoryImpl();

		EstacionamientoControllerImpl controlador = new EstacionamientoControllerImpl(miEstacionamiento);
		EstacionamientoRepositoryImpl repositorio = new EstacionamientoRepositoryImpl();

		String matricula = "123B";
		controlador.generarEstacionamiento(matricula);
		assertTrue(repositorio.getExistenciaEstacionamiento(matricula));
	}

	@Test
	void testGenerarEstacionamientoRepository() {
		EstacionamientoRepositoryImpl repositorio = new EstacionamientoRepositoryImpl();

		String matricula = "123B";
		repositorio.crearEstacionamiento(matricula);
		assertTrue(repositorio.getExistenciaEstacionamiento(matricula));
	}
}
