public class Principal {

	public static void main(String[] args) {
		Lista<Persona> listaArtesanal = new Lista<>();
		listaArtesanal.agregar(new Persona("Juan", "Santizo"));
		listaArtesanal.agregar(new Persona("Esvin", "González"));
		listaArtesanal.agregar(null);
		listaArtesanal.mostrar();
	}
	
}