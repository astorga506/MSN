package cr.msn.dominio;

import java.util.LinkedList;

public class Carrito {
	
	private LinkedList<ItemCarrito> items;
	
	public Carrito() {
		items = new LinkedList<ItemCarrito>();
	}	

	public Carrito(LinkedList<ItemCarrito> itemes) {
		this.items = itemes;
	}

	public LinkedList<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(LinkedList<ItemCarrito> items) {
		this.items = items;
	}
	
}
