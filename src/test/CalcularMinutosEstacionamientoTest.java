package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Estacionamiento;

class CalcularMinutosEstacionamientoTest {

	@Test
	void testCalcularMinutosEstacionamiento() {
		ArrayList<Estacionamiento> estacionamientos=new ArrayList<Estacionamiento>();
		estacionamientos.add(new Estacionamiento(LocalDateTime.of(2022, 6, 1, 10, 30),"1234"));
		estacionamientos.add(new Estacionamiento(LocalDateTime.of(2022, 6, 1, 10, 30),"1234"));
		estacionamientos.add(new Estacionamiento(LocalDateTime.of(2022, 6, 1, 10, 30),"1234"));
		estacionamientos.get(0).setHoraSalida(LocalDateTime.of(2022, 6, 1, 11, 30));
		estacionamientos.get(1).setHoraSalida(LocalDateTime.of(2022, 6, 2, 10, 30));
		estacionamientos.get(2).setHoraSalida(LocalDateTime.of(2022, 6, 2, 9, 30));
		double[] esperado= {60,1440,1500};
		for (int i = 0; i < esperado.length; i++) {
			assertEquals(esperado[i], estacionamientos.get(i).calcularMinutosEstacionamiento(estacionamientos.get(i).getHoraEntrada(),estacionamientos.get(i).getHoraSalida()));
			
		}
	}

}
