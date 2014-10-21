package cr.msn.dominio;

public class Producto {
	
	private int codProducto;
    private String nombreProducto;
    private String descripcion;
    private String detalles;
    private float precio;
    private int cantDisponible;
    private Categoria categoria;
    
	public Producto() {
		categoria = new Categoria();
	}

	public Producto(int codProducto, String nombreProducto, String descripcion,
			String detalles, float precio, int cantDisponible, Categoria categoria) {
		this.codProducto = codProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.detalles = detalles;
		this.precio = precio;
		this.cantDisponible = cantDisponible;
		this.categoria = categoria;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantDisponible() {
		return cantDisponible;
	}

	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}//Fin Producto
