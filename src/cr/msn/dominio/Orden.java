package cr.msn.dominio;

import java.util.LinkedList;

public class Orden {
	
	private int numOrden;
    private String fecha;
    private String estado;
    private Cliente cliente;
    private LinkedList<ItemOrden> items;
    
	public Orden() {
		cliente = new Cliente();
		items = new LinkedList<>();
	}

	public Orden(int numOrden, String fecha, String estado, Cliente cliente, LinkedList<ItemOrden> items) {
		this.numOrden = numOrden;
		this.fecha = fecha;
		this.estado = estado;
		this.cliente = cliente;
		this.items = items;
	}

	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LinkedList<ItemOrden> getItems() {
		return items;
	}

	public void setItems(LinkedList<ItemOrden> items) {
		this.items = items;
	}
	     

}//Fin Orden
