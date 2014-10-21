package cr.msn.dominio;

import java.util.LinkedList;

public class Caso {
	
	private int numCaso;
    private String estado;
    private String fechaCreacion;
    private String titulo;
    private Cliente cliente;
    private LinkedList<Mensaje> mensajes;
    
	public Caso() {
		cliente = new Cliente();
		mensajes = new LinkedList<>();
	}
	
	public Caso(int numCaso, String estado, String fechaCreacion, String titulo, Cliente cliente, LinkedList<Mensaje> mensajes) {
		this.numCaso = numCaso;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
		this.titulo = titulo;
		this.cliente = cliente;
		this.mensajes = mensajes;
	}
	public int getNumCaso() {
		return numCaso;
	}
	public void setNumCaso(int numCaso) {
		this.numCaso = numCaso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LinkedList<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(LinkedList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

}//Fin Caso
