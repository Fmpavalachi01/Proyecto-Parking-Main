package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class BonoTest {

	@Test
	void testBonoDiario() {
		//un martes
		LocalDateTime hora=LocalDateTime.of(2022,5,24,9,23);
		Bono diario=Bono.diario;
		assertTrue(diario.comprobarDia(hora));
		//Lunes
		hora=LocalDateTime.of(2022,5,23,9,23);
		assertTrue(diario.comprobarDia(hora));
		//Sabado
		hora=LocalDateTime.of(2022,5,21,9,23);
		assertFalse(diario.comprobarDia(hora));
		//Domingo
		hora=LocalDateTime.of(2022,5,22,9,23);
		assertFalse(diario.comprobarDia(hora));
		System.out.println("he acabado el diario");
	}
	@Test
	void testBonoFinde() {
		LocalDateTime hora=LocalDateTime.of(2022,5,24,9,23);
		Bono diario=Bono.findeSemana;
		assertFalse(diario.comprobarDia(hora));
		hora=LocalDateTime.of(2022,5,21,9,23);
		assertTrue(diario.comprobarDia(hora));
	}


	}


