package ejercicio6;

public class Test {
	/**
	 * Se recorre el DiccionarioMultipleTDA utilizando el conjunto de claves como punto de entrada.
	 * Por cada clave, se recupera su conjunto de valores asociados.
	 * Cada valor se agrega a un conjunto auxiliar para evitar repeticiones.
	 * Luego, todos los elementos únicos del conjunto se acolan en una ColaTDA de salida.
	 *
	 * De esta forma, se garantiza que la cola resultante contenga únicamente los valores
	 * distintos del diccionario, sin importar cuántas claves los referencien.
	 */

	public static void main(String[] args) {
        DiccionarioMultipleDin dicc = new DiccionarioMultipleDin();
        dicc.inicializarDiccionario();

        // Clave 4 → valores: 4, 5, 6
        dicc.agregar(4, 4);
        dicc.agregar(4, 5);
        dicc.agregar(4, 6);

        // Clave 6 → valores: 7, 5, 8, 9
        dicc.agregar(6, 7);
        dicc.agregar(6, 5);
        dicc.agregar(6, 8);
        dicc.agregar(6, 9);

        // Clave 9 → valores: 4, 8, 7, 5
        dicc.agregar(9, 4);
        dicc.agregar(9, 8);
        dicc.agregar(9, 7);
        dicc.agregar(9, 5);

        // Clave 8 → valores: 7, 4, 5, 9, 0, 4
        dicc.agregar(8, 7);
        dicc.agregar(8, 4);
        dicc.agregar(8, 5);
        dicc.agregar(8, 9);
        dicc.agregar(8, 0);
        dicc.agregar(8, 4); // Repetido, no se vuelve a agregar

        // Obtenemos los valores únicos
        ColaDin cola = DiccionarioSinRepetir.valoresSinRepetidos(dicc);

        System.out.println("Valores únicos encontrados:");
        while (!cola.colaVacia()) {
            System.out.print(cola.primero() + " ");
            cola.desacolar();
        }
    }

}
