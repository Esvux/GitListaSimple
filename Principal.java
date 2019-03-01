public class Principal {

	public static void main(String[] args) {
		Lista<Persona> listaArtesanal = new Lista<>();
		listaArtesanal.agregar(new Persona("Juan", "Santizo"));
		listaArtesanal.agregar(new Persona("Esvin", "González"));
		listaArtesanal.agregar(null);
		// listaArtesanal.eliminar(0);
		listaArtesanal.mostrar();
		Persona reemplazo = listaArtesanal.reemplazar(1,new Persona("Fernando","Perez"));
        System.out.println("Valor reemplazado: " + reemplazo);
		listaArtesanal.mostrar();
	}
	
}