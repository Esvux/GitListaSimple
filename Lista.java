public class Lista <T> {

	//Variables globales - Atributo/Propiedad de clase
	Nodo<T> inicio; //null
	int longitud;

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
		int contador = 1;
		while(temp != null) {
			
			System.out.println(contador + " : " + temp.valor);
			contador++;
			temp = temp.puntero;
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

}