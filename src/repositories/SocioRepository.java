package repositories;

public interface SocioRepository {

	public boolean isSocio(String matricula);

	public void eliminarSocioByMatricula(String matricula);

}
