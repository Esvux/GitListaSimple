public class Principal {

	public static void main(String[] args) {
		Lista<Persona> listaArtesanal = new Lista<>();
		listaArtesanal.agregar(new Persona("Juan", "Santizo"));
		listaArtesanal.agregar(new Persona("Esvin", "González"));
		listaArtesanal.agregar(new Persona("Oscar", "Paiz"));
		listaArtesanal.agregar(new Persona("Rolando", "Secaida"));
		listaArtesanal.agregar(null);
		listaArtesanal.eliminar(2);
		listaArtesanal.mostrar();
		listaArtesanal.limpiar();
	}

}
