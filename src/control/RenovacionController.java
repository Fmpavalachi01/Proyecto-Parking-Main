package control;

public interface RenovacionController {
//Funcion que usaremos para efectuar la renovacion del socio. Debe recoger la opcion que elija el usuario 
//y dar de alta de nuevo al socio en caso de que quiera renovar, o sacarlo del repositorio de socios en caso de que no quiera.	
	public boolean renovarMembresiaSocio(boolean renovacion);

//Funcion que usaremos para efectuar la renovacion del socio. Debe recoger la opcion que elija el usuario 
//y dar de alta de nuevo al Abonado en caso de que quiera renovar, o sacarlo del repositorio en caso de que no quiera.		
	public boolean renovarBonoAbonado(boolean renovacion);
}
