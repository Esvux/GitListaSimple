public class Lista <T> {

	//Variables globales - Atributo/Propiedad de clase
	Nodo<T> inicio; //null
	int contador =0;

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

	public T eliminar(int i) {
		if(i < 0) {
			throw new IndexOutOfBoundsException("No se permite eliminar elementos con índice negativo.");
		}
		Nodo<T> anterior = null;
		Nodo<T> actual = this.inicio;
		int contador = 0;
		while(actual != null) {
			if(contador != i) {
				//No es el elemento a eliminar
				anterior = actual;
				actual = actual.puntero;
				contador--;
				continue;
			}
			//Encontré el elemento a eliminar
			anterior.puntero = actual.puntero;
			return actual.valor;

		}
		throw new IndexOutOfBoundsException("Indice fuera de la lista " + i);
	}

	public T reemplazar(int i, T nuevo) {

		if(i<0) {
		    throw new IllegalStateException("El indice no puede ser negativo: " + i);
        }

		// What if inicio == null? Return it
		if(this.inicio == null) {
			throw new IllegalStateException("La lista esta vacia");
		}

        int index = 0;
        Nodo<T> prev = this.inicio;

        // Create new nodo
        Nodo<T> newNodo = new Nodo<>(nuevo);

		// What if i = 0? Replace inicio
		if(i == 0) {
		    T replaced = inicio.valor;
			newNodo.puntero = inicio.puntero;
			this.inicio = newNodo;
			return replaced;
		}

		// Look for the previous one
		while(index != i-1 && prev.puntero != null) {
			prev = prev.puntero;
			index++;
		}

		// Reached the end of the list, without finding the index
		if(index == i-1 && prev.puntero == null) {
			throw new IndexOutOfBoundsException("Posicion no existe " + i);
		} else {
			Nodo<T> replaced = prev.puntero;
			newNodo.puntero = replaced.puntero;
			prev.puntero = newNodo;
			return replaced.valor;
		}




	}

	public void counter(){
		System.out.println("Numero de Items en la lista:" +contador);
	}



}