package ejercicio2;

public class Test {
	
    public static void main(String[] args) {
    	/**
    	 * Este programa prueba el funcionamiento del TDA DiccionarioSimpleModTDA,
    	 * una extensión de DiccionarioSimpleTDA que registra cuántas veces se
    	 * modifica el valor asociado a cada clave. Al agregar una clave con un nuevo
    	 * valor, se incrementa un contador de modificaciones. Se verifica el correcto
    	 * funcionamiento de las operaciones agregar, eliminar, recuperar y recuperarMod.
    	 */
        DiccionarioSimpleModTDA diccionario = new DiccionarioSimpleModTDA();
        diccionario.inicializarDiccionario();

        // Agregamos los pares (clave, valor)
        diccionario.agregar(7, 3);    // Clave nueva → mod = 0
        diccionario.agregar(16, 4);   // Clave nueva → mod = 0
        diccionario.agregar(3, 4);    // Clave nueva → mod = 0
        diccionario.agregar(16, 2);   // Clave ya existe y valor cambia → mod = 1
        diccionario.agregar(3, 6);    // Clave ya existe y valor cambia → mod = 1
        diccionario.agregar(5, 3);    // Clave nueva → mod = 0

        // Mostrar claves y valores
        ConjuntoTDA claves = diccionario.claves();

        System.out.println("Clave | Valor | Modificaciones");
        while (!claves.conjuntoVacio()) {
            int clave = claves.elegir();
            int valor = diccionario.recuperar(clave);
            int modificaciones = diccionario.recuperarMod(clave);
            System.out.println("  " + clave + "   |   " + valor + "   |       " + modificaciones);
            claves.sacar(clave);
        }
    }
}