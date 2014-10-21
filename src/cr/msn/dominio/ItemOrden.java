package cr.msn.dominio;

public class ItemOrden {
	
	private float precio;
    private Producto producto;
    private int cantidad;
    
	public ItemOrden() {
		producto = new Producto();
	}

	public ItemOrden(float precio, Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}    

}//Fin ItemOrden
