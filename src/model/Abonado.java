package model;

public class Abonado {
	private Bono bono;
	private String matricula;
	public Abonado(Bono bono, String matricula) {
		super();
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
