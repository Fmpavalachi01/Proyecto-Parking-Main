package control;

public class SalidaParkingControllerImpl implements SalidaParkingController {
	private RealizarPagoController pagos;

	@Override
	public boolean salirDelParking() {
		if (gestionarTipoSalida()==true) {
			return true;
		}else {
			
			return false;
		}
	}

	@Override
	public boolean gestionarTipoSalida() {
		// TODO Auto-generated method stub
		return false;
	}
}
