public class Principal {

	public static void main(String[] args) {
		Lista<Persona> listaArtesanal = new Lista<>();
		listaArtesanal.agregar(new Persona("Juan", "Santizo"));
		listaArtesanal.agregar(new Persona("Esvin", "González"));
		listaArtesanal.agregar(new Persona("Oscar", "Paiz"));
		listaArtesanal.agregar(new Persona("Rolando", "Secaida"));
		listaArtesanal.agregar(null);
		listaArtesanal.mostrar();

		System.out.println("");
		listaArtesanal.reemplazar(2, new Persona("Hola", "Mundo"));

		listaArtesanal.eliminar(1);
		listaArtesanal.mostrar();
		listaArtesanal.counter();
	}
	
}