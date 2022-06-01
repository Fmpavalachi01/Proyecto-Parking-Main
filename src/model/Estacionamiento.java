package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Estacionamiento {
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSalida;
	private final float tarifaPorMinuto=0.01f;
	private String matricula;

	public Estacionamiento(LocalDateTime horaEntrada, String matricula) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaSalida = getHoraSalida();
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estacionamiento [horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", tarifaPorMinuto="
				+ tarifaPorMinuto + ", matricula=" + matricula + "]";
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDateTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalDateTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public float getTarifaPorMinuto() {
		return tarifaPorMinuto;
	}

    public double calcularMinutosEstacionamiento(LocalDateTime inicio, LocalDateTime salida) {
    	double minutos=0;
    	double diferenciaDias=salida.toLocalDate().getDayOfYear()-inicio.toLocalDate().getDayOfYear();
    	double diferenciaHoras=salida.toLocalTime().getHour()-inicio.toLocalTime().getHour();
    	if (diferenciaHoras<0) {
			diferenciaHoras=inicio.toLocalTime().getHour()-salida.toLocalTime().getHour();
		}
    	double diferenciaMins=salida.toLocalTime().getMinute()-inicio.toLocalTime().getMinute();
    	if (diferenciaMins<0) {
			diferenciaMins=inicio.toLocalTime().getMinute()-salida.toLocalTime().getMinute();
		}
    	minutos=((diferenciaDias*24)*60)+(diferenciaHoras*60)+diferenciaMins;		
    	return minutos;
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
