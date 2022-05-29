package control;

public interface EntradaParkingController {
	// Funcion que recoge la matricula del usuario y despues devuelve si es un socio
	// o abonado; o es un esporádico o abonado fuera
	// de horario del bono. Devuelve un boolean que indica si se tiene que generar
	// un estacionamiento o no.
	public boolean identificarUsuario(String matricula);
	//Funcion que indica que un usuario ha entrado al parking y aumenta el numero de plazas ocupadas
	public String entradaParking(boolean identificarUsuario, String matricula);
}
