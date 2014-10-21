package cr.msn.dominio;

public class Mensaje {
	private int idMensaje;
    private String fechaEnviado;
    private String asunto;
    private String contenido;
    
	public Mensaje() {
	}

	public Mensaje(int idMensaje, String fechaEnviado, String asunto,
			String contenido) {
		this.idMensaje = idMensaje;
		this.fechaEnviado = fechaEnviado;
		this.asunto = asunto;
		this.contenido = contenido;
	}

	public int getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getFechaEnviado() {
		return fechaEnviado;
	}

	public void setFechaEnviado(String fechaEnviado) {
		this.fechaEnviado = fechaEnviado;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
  

}//Fin Mensaje
