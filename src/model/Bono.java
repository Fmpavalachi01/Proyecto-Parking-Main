package model;

public enum Bono {

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;

public enum Bono {
	diario(DayOfWeek.MONDAY, DayOfWeek.FRIDAY), findeSemana(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

	private DayOfWeek initialDay;
	private DayOfWeek endingDay;

	private Bono(DayOfWeek initialDay, DayOfWeek endingDay) {
		this.initialDay = initialDay;
		this.endingDay = endingDay;
	}

	public Boolean comprobarDia(LocalDateTime hora) {
		LocalDate localDate = hora.toLocalDate();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		int conRespectoAInicio = dayOfWeek.compareTo(initialDay);
		int conRespectoAFinal = dayOfWeek.compareTo(endingDay);
		return conRespectoAInicio >= 0 && conRespectoAFinal <= 0;
	}

}}
