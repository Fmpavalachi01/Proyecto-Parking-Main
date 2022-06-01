package model;

public class Socio extends Cliente {
	private int numeroPlaza;
	private String matricula;

	public Socio(int numeroPlaza, String matricula, String nombre, int tarjetaCredito) {
		super(nombre, tarjetaCredito);
		this.numeroPlaza = numeroPlaza;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Socio [numeroPlaza=" + numeroPlaza + ", matricula=" + matricula + "]";
	}

	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
