package model;

public abstract class Cliente {
	private String nombre;
	private int tarjetaCredito;

	public Cliente(String nombre, int tarjetaCredito) {
		super();
		this.nombre = nombre;
		this.tarjetaCredito = tarjetaCredito;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tarjetaCredito=" + tarjetaCredito + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(int tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

}
