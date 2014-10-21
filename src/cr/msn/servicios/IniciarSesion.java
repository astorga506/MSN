package cr.msn.servicios;

import cr.msn.data.ClienteData;

public class IniciarSesion {

	public IniciarSesion() {	

	}
	
	public boolean esCliente(String correo, String contrasena){
		ClienteData cd = new ClienteData();
		return cd.esCliente(contrasena, correo);
	}
	
}
