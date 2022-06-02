package control;

public interface RealizarPagoController {
	//Funcion que recibe la cantidad a pagar y la cantidad pagada y devuelve el cambio como String para poder
	//mostrarlo como un mensaje. Si la cantidad pagada no es suficiente devuelve la cadena "La cantidad pagada es insuficiente"
     public String realizarPago(String matricula, double pago);
     
     public double getTarifaTotal(String matricula);
}
