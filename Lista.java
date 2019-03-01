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
			Nodo<T> nuevoNodo = new Nodo<>(nuevo);
			nuevoNodo.puntero = this.inicio;
			this.inicio = nuevoNodo;
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