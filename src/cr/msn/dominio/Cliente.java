package cr.msn.dominio;

public class Cliente {

	private int idCliente;
    private String nombreCliente;
    private String telefono;
    private String correo;
    private Carrito carrito;
    
	public Cliente() {
		carrito = new Carrito();
	}

	public Cliente(int idCliente, String nombreCliente, String telefono,
			String correo, Carrito carrito) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.correo = correo;
		this.carrito = carrito;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}   
	    
}//Fin Cliente
