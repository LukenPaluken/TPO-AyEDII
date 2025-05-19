package ejercicio5;

public class Test {
	public static void main(String[] args) {
		/**
		 * Se recorre la pila utilizando una pila auxiliar para no perder su contenido original.
		 * A medida que se desapilan los elementos, se actualiza un DiccionarioSimpleTDA donde:
		 *  - la clave es el valor del elemento,
		 *  - el valor es la cantidad de veces que dicho elemento aparece en la pila.
		 * 
		 * Si la clave ya existe en el diccionario, se incrementa su valor en uno.
		 * Si no existe, se agrega con un valor inicial de 1.
		 * Finalmente, los elementos se restauran en la pila original desde la pila auxiliar.
		 * 
		 * Esta estrategia permite contar frecuencias sin alterar el contenido de la pila.
		 */

        PilaTDA pila = new PilaTDA();
        pila.inicializarPila();

        // Entrada: <4, 3, 6, 6, 6, 7, 8, 4>
        pila.apilar(4);
        pila.apilar(8);
        pila.apilar(7);
        pila.apilar(6);
        pila.apilar(6);
        pila.apilar(6);
        pila.apilar(3);
        pila.apilar(4);

        DiccionarioSimpleDin diccionario = PilaTDA.contarFrecuencias(pila);

        ConjuntoTDA claves = diccionario.claves();

        System.out.println("Frecuencias de elementos en la pila:");
        while (!claves.conjuntoVacio()) {
            int clave = claves.elegir();
            System.out.println("Elemento: " + clave + " → Frecuencia: " + diccionario.recuperar(clave));
            claves.sacar(clave);
        }
    }

}
