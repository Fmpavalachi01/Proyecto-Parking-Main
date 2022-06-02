package control;

public interface EntradaParkingController {
	// Funcion que recoge la matricula del usuario y despues devuelve si es un socio
	// o abonado; o es un esporádico o abonado fuera
	// de horario del bono. Devuelve un boolean que indica si se tiene que generar
	// un estacionamiento o no.
	public boolean entradaParking(String matricula);

}
