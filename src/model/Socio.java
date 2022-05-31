package model;

public class Socio {
	// algo mas que ya veremos
	private String matricula;

	public Socio(String matricula) {
		super();
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Socio [matricula=" + matricula + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
