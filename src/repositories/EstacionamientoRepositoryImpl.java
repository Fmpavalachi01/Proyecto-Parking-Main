package repositories;

import model.Estacionamiento;

public class EstacionamientoRepositoryImpl implements EstacionamientoRepository {

	@Override
	public void incrementarPlazasOcupadas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disminuirPlazasOcupadas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int mostrarNumeroPlazasDisponibles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void crearEstacionamiento(String matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estacionamiento getEstacionamiento(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getExistenciaEstacionamiento(String matricula) {
		if (getEstacionamiento(matricula)!=null) {
			return true;
		}else {
			
			return false;
		}
	}

}
