package ejercicio4;

public class PilaTDA {
	private class Nodo { //la c�lula de la estructura
		int info; //el valor almacenado
		Nodo sig; //la referencia al siguiente nodo
	}
	
	private Nodo primero; //la referencia a la estructura
	
	public void inicializarPila() {
		// Complejidad O(1)
		primero = null;
	}
	
	public void apilar(int x) { //el nuevo elemento se agrega al inicio
		// Complejidad O(1)
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = primero;
		primero = nuevo; //nueva referencia a la estructura
	}
	
	public void desapilar() {
		// Complejidad O(1)
		primero = primero.sig; //nueva referencia a la estructura
	}
	
	public boolean pilaVacia() {
		// Complejidad O(1)
		return (primero == null);
	}
	
	public int tope() {
		// Complejidad O(1)
		return primero.info;
	}
	
	
}
