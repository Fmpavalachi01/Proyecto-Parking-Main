package control;

import repositories.EstacionamientoRepositoryImpl;

public class RealizarPagoControllerImpl implements RealizarPagoController{
    EstacionamientoRepositoryImpl estacionamientoRepository=new EstacionamientoRepositoryImpl();
	@Override
	public String realizarPago(String matricula, double pago) {
		String cambio="";
		double tarifa=estacionamientoRepository.getTarifaTotal(matricula);
		if (pago<tarifa) {
			cambio="La cantidad pagada es insuficiente";
		}else {
			cambio=Math.round(pago-tarifa)+"€";
		}
		return cambio;
	}
	@Override
	public double getTarifaTotal(String matricula) {
		return Math.round(estacionamientoRepository.getTarifaTotal(matricula));
	}
    
}
