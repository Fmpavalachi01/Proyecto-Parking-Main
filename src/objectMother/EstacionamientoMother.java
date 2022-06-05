package objectMother;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import model.Estacionamiento;
import repositories.EstacionamientoRepositoryImpl;

public class EstacionamientoMother {
public ArrayList<Estacionamiento> estacionamientoMother(){
	ArrayList<Estacionamiento> misEstacionamientos=new ArrayList<>();
	String[] matriculas= {"123","matricula","mat1","algo"};
	LocalTime[] horas= {LocalTime.of(12, 30),LocalTime.of(14, 0),LocalTime.of(1, 12),LocalTime.of(12, 01)};
	LocalDate[] dias= {LocalDate.of(2022, 6, 4),LocalDate.of(2022, 4, 17),LocalDate.of(2022, 5, 30),LocalDate.of(2022, 6, 3)};
	for (int i = 0; i < dias.length; i++) {
		
		misEstacionamientos.add(new Estacionamiento(LocalDateTime.of(dias[i], horas[i]), matriculas[i]));
	}
	return misEstacionamientos;
}
}
