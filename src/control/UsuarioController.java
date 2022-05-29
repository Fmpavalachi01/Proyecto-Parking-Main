package control;

public interface UsuarioController {
	// Funcion que devuelve true si el usuario es un Cliente y false si el usuario es un esporadico
	public boolean getTipoUsuario(String matricula);
    // Funcion que devuelve true si el cliente es un socio y false si el cliente es un abonado
	public boolean getTipoCliente(String matricula);
}
