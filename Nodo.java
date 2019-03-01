/**
 * POJO -> Plain Old Java Object
 */

public class Nodo <T> {

	Nodo<T> puntero;
	T valor;

	public Nodo() { }

	public Nodo(T nuevo) {
		this.valor = nuevo;
	}
	
}