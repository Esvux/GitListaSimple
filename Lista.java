public class Lista <T> {

	//Variables globales - Atributo/Propiedad de clase
	Nodo<T> inicio; //null
	int contador =0;
	int longitud;
	int i;

	public Lista() {
		this.inicio = null;
		this.longitud = 0;

	}

	public void agregar(T nuevo) {

		if(this.inicio == null) {
			//Es el primer elemento
			this.inicio = new Nodo<>(nuevo);
			longitud++;
		} else {
			//Ya hay al menos un elemento
			Nodo<T> nuevoNodo = new Nodo<>(nuevo);
			nuevoNodo.puntero = this.inicio;
			this.inicio = nuevoNodo;
			longitud++;
		}
	}

	public void mostrar() {
		Nodo<T> temp = this.inicio;
		while(temp != null) {

			System.out.println(contador + " : " + temp.valor);
			contador++;
			temp = temp.puntero;
			contador++;
		}
	}

	public T eliminar(int i) {
		if(i < 0 ) {
			System.out.println("No se permite eliminar elementos menor a 0. ");
		}

		Nodo<T> actual = this.inicio;

		//Si la posicion a eliminar es mayor o igual a 0 y menor o igual a la longitud de lista
		if(i >= 0 && i <= longitud) {

			//Si la pocision es igual a 0
			if(i == 0) {
				this.inicio = actual.puntero;
				longitud--;

			} else { //Si la posicion es mayor a 0

				for (int j = 0; j < i -1; j++) {
					actual = actual.puntero;
				}
				actual.puntero = actual.puntero.puntero;
				longitud--;
			}
		}
		return actual.valor;


	}



	public void counter(){
		System.out.println("Numero de Items en la lista:" +contador);
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
