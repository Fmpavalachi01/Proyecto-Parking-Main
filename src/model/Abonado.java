package model;

public class Abonado extends Cliente {
	private Bono bono;
	private String matricula;

	public Abonado(Bono bono, String matricula, String nombre, int tarjetaCredito) {
		super(nombre, tarjetaCredito);
		this.bono = bono;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Abonado [bono=" + bono + ", matricula=" + matricula + "]";
	}

	public Bono getBono() {
		return bono;
	}

	public void setBono(Bono bono) {
		this.bono = bono;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
