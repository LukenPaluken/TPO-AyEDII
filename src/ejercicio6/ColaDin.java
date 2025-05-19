package ejercicio6;

public class ColaDin {
	private class Nodo { //la c�lula de la estructura
		int info; //el valor almacenado
		Nodo sig; //la referencia al siguiente nodo
	}

	private Nodo primero; //primer elemento (m�s antiguo)
	private Nodo ultimo; //�ltimo elemento (m�s reciente)
	
	public void inicializarCola(){
		// Complejidad O(1)
		primero = null;
		ultimo = null;
	}
	
	public void acolar(int x){
		// Complejidad O(1)
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = null;
		if (ultimo != null) //cola no vac�a
			ultimo.sig = nuevo;
		ultimo = nuevo;
		if (primero == null) //la cola estaba vac�a
			primero = nuevo;
	}
	
	public void desacolar(){
		// Complejidad O(1)
		primero = primero.sig; //nueva referencia a la estructura
		if (primero == null) //la cola qued� vac�a
			ultimo = null;
	}
	
	public boolean colaVacia(){
		// Complejidad O(1)
		return (ultimo == null);
	}
	
	public int primero(){
		// Complejidad O(1)
		return primero.info;
	}
}
