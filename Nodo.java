/**
 * POJO -> Plain Old Java Object
 */

public class Nodo <T> {

	Nodo puntero;
	T valor;

	public Nodo() { }

	public Nodo(T nuevo) {
		this.valor = nuevo;
	}
	
}