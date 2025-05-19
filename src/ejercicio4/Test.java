package ejercicio4;

public class Test {
    public static void main(String[] args) {
    	/**
    	 * Se recorre la pila utilizando una pila auxiliar para preservar el contenido original.
    	 * Durante la iteración, se utiliza un conjunto 'vistos' para registrar los elementos ya encontrados,
    	 * y otro conjunto 'repetidos' para almacenar aquellos que aparecen más de una vez.
    	 * Si un elemento ya está en 'vistos', se agrega a 'repetidos'.
    	 * Finalmente, los elementos son restaurados en la pila original desde la auxiliar.
    	 * 
    	 * Esta estrategia permite identificar los elementos repetidos sin perder los datos de la pila original.
    	 */

        PilaTDA pila = new PilaTDA();
        pila.inicializarPila();

        // Entrada para la pila: <3, 3, 6, 2, 6, 7, 8, 4>
        pila.apilar(3);
        pila.apilar(3);
        pila.apilar(6);
        pila.apilar(2);
        pila.apilar(6);
        pila.apilar(7);
        pila.apilar(8);
        pila.apilar(4);

        ConjuntoTDA repetidos = ConjuntoTDA.elementosRepetidos(pila);

        System.out.print("Elementos repetidos: ");
        while (!repetidos.conjuntoVacio()) {
            int valor = repetidos.elegir();
            System.out.print(valor + " ");
            repetidos.sacar(valor);
	        }
	    }
	}