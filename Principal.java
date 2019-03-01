import java.util.*;

public class Principal {

	public static void main(String[] args) {
		/*
		List<Persona> lista = new ArrayList<>(4);
		lista.add(new Persona("Juan", "Santizo"));
		lista.add(new Persona("Esvin", "González"));
		lista.add(null);
		*/

		Lista<Persona> listaArtesanal = new Lista<>();
		listaArtesanal.agregar(new Persona("Juan", "Santizo"));
		listaArtesanal.agregar(new Persona("Esvin", "González"));
		listaArtesanal.agregar(null);
		listaArtesanal.eliminar(0);
		listaArtesanal.mostrar();
	}
	
}