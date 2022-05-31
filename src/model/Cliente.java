package model;

public class Cliente {
	private String nombre;
	private int tarjetaCredito;
	private Socio socio;
	private Abonado abonado;
	public Cliente(String nombre, int tarjetaCredito, Socio socio, Abonado abonado) {
		super();
		this.nombre = nombre;
		this.tarjetaCredito = tarjetaCredito;
		this.socio = socio;
		this.abonado = abonado;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tarjetaCredito=" + tarjetaCredito + ", socio=" + socio + ", abonado="
				+ abonado + "]";
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
	public Socio getSocio() {
		//opcional
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Abonado getAbonado() {
		//opcional
		return abonado;
	}
	public void setAbonado(Abonado abonado) {
		this.abonado = abonado;
	}
}
 