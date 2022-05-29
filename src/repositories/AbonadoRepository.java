package repositories;

public interface AbonadoRepository {

	public boolean isAbonado(String matricula);

	public void eliminarAbonadoPorMatricula(String matricula);

	public boolean getBonoDentroDeHorario(String matricula);

}
