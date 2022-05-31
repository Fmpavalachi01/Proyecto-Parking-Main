package control;

import repositories.EstacionamientoRepository;

public class RealizarPagoControllerImpl implements RealizarPagoController{
    EstacionamientoRepository estacionamientoRepository;
	@Override
	public String realizarPago(String matricula, double pago) {
		String cambio="";
		double tarifa=estacionamientoRepository.getTarifaTotal(matricula);
		if (pago<tarifa) {
			cambio="La cantidad pagada es insuficiente";
		}else {
			cambio="El cambio es de: "+(pago-tarifa)+"€";
		}
		return cambio;
	}
    
}
