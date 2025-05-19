package ejercicio3;

public class Test {

	public static void main(String[] args) {
		/**
		 * Se recorre la pila elemento por elemento utilizando una pila auxiliar para conservar el orden original.
		 * En cada iteración, se verifica si el elemento es par utilizando el operador módulo (%).
		 * Si lo es, se incrementa un contador.
		 * Luego, todos los elementos son devueltos a la pila original desde la pila auxiliar.
		 * De esta manera, se obtiene la cantidad de elementos pares sin modificar el contenido ni el orden de la pila.
		 */
		PilaTDA pila = new Pila();
        pila.inicializarPila();

        // Entrada para la pila: <3, 4, 6, 2, 45, 7, 8>
        // Se apilan en orden inverso para que el tope sea 8
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(6);
        pila.apilar(2);
        pila.apilar(45);
        pila.apilar(7);
        pila.apilar(8);

        // Contar pares
        int cantidadPares = Pila.contarPares(pila);
        System.out.println("Cantidad de elementos pares en la pila: " + cantidadPares);
	}
}
