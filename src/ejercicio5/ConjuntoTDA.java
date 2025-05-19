package ejercicio5;

public class ConjuntoTDA {
	private class Nodo { //la c�lula de la estructura
		int info; //el valor almacenado
		Nodo sig; //la referencia al siguiente nodo
	}
	
	private Nodo c; //la referencia de la estructura
	
	public void inicializarConjunto () {
		// Complejidad O(1)
		c = null;
	}
	
	public boolean conjuntoVacio() {
		// Complejidad O(1)
		return (c == null);
	}
	
	public void agregar(int x) {
		// Complejidad O(1) en el mejor caso, O(n) en el peor caso
		if (!this.pertenece(x)) { //se verifica pertenencia
			Nodo nuevo = new Nodo(); //el nuevo nodo que se agregar�
			nuevo.info = x;
			nuevo.sig = c;
			c = nuevo;
		}
	}
	
	public int elegir() { //arbitrario
		// Complejidad O(1)
		return c.info; //elegimos el primero (puede ser cualquiera)
	}
	
	public void sacar(int x) {
		// Complejidad O(1) en el mejor caso, O(n) en el peor caso
		if (c != null) {
			if (c.info == x) { //es el primero
				c = c.sig;
			} else { //es alg�n otro; lo buscamos
				Nodo aux = c;
				while (aux.sig != null && aux.sig.info != x)
					aux = aux.sig;
				if (aux.sig != null) //encontrado
					aux.sig = aux.sig.sig;
			}
		}
	}
	
	public boolean pertenece(int x) {
		// Complejidad O(1) en el mejor caso, O(n) en el peor caso
		Nodo aux = c;
		while (aux != null && aux.info != x)
			aux = aux.sig;
		return (aux != null);
	}
}