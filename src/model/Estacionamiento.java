package model;

import java.time.LocalDateTime;

public class Estacionamiento {
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSalida;
	private final float tarifaPorMinuto=0.01f;
	private String matricula;

	public Estacionamiento(LocalDateTime horaEntrada, String matricula) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
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

	public void setTarifaPorMinuto(float tarifaPorMinuto) {
		this.tarifaPorMinuto = tarifaPorMinuto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
