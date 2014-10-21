package cr.msn.dominio;

public class Categoria {
	
	private int codCategoria;
    private String nombreCategoria;
    private Categoria subcategoria;
    
	public Categoria() {
		subcategoria = new Categoria();
	}

	public Categoria(int codCategoria, String nombreCategoria, Categoria categoria) {
		this.codCategoria = codCategoria;
		this.nombreCategoria = nombreCategoria;
		this.subcategoria = categoria;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public Categoria getCategoria() {
		return subcategoria;
	}

	public void setCategoria(Categoria categoria) {
		this.subcategoria = categoria;
	}
    

}//Fin Categoria
