public class Lista <T> {

	//Variables globales - Atributo/Propiedad de clase
	Nodo<T> inicio; //null

	public Lista() {
		this.inicio = null;
	}

	public void agregar(T nuevo) {
		if(this.inicio == null) {
			//Es el primer elemento
			this.inicio = new Nodo<>(nuevo);
		} else {
			//Ya hay al menos un elemento
			
			Nodo<T> temp = this.inicio;
			//Una referencia al inicio de la lista
			while(temp.puntero != null) {
				temp = temp.puntero;
			}
			// temp está apuntando al último elemento de la lista

			// creo el nuevo nodo (wrapper)
			Nodo<T> nuevoNodo = new Nodo<>(nuevo);

			// el último apunta al nuevo y listo...
			temp.puntero = nuevoNodo;
		}
	}

	public void mostrar() {
		Nodo<T> temp = this.inicio;
		while(temp != null) {
			System.out.println(temp.valor);
			temp = temp.puntero;
		}
	}

}