package cr.msn.dominio;

public class Tienda {
	private int codTienda;
    private String ubicacion;
    private String telefono;
    private String horario;
    
	public Tienda() {
	}

	public Tienda(int codTienda, String ubicacion, String telefono,
			String horario) {
		this.codTienda = codTienda;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.horario = horario;
	};

	public int getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(int codTienda) {
		this.codTienda = codTienda;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	


}//Fin Tienda
