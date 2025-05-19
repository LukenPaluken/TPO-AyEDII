package ejercicio1;

/*
Implementación dinámica de ConjuntoEspecialTDA.
Permite múltiples apariciones de un mismo número.
Utiliza una lista enlazada simple para almacenar los elementos sin orden específico.
*/
public class ConjuntoEspecialTDA implements ConjuntoTDA {

    /*
    Nodo de la lista enlazada.
    Contiene un dato entero y una referencia al siguiente nodo.
    */
    private class Nodo {
        int data;
        Nodo siguiente;
    }

    /*
    Referencia al primer nodo del conjunto.
    */
    private Nodo nodo;

    /*
    Inicializa el conjunto asignando null al primer nodo.
    Complejidad: O(1)
    */
    @Override
    public void inicializarConjunto() {
        nodo = null;
    }

    /*
    Agrega un nuevo nodo con el valor x al principio de la lista.
    Se permiten duplicados.
    Complejidad: O(1)
    */
    @Override
    public void agregar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.data = x;
        nuevo.siguiente = nodo;
        nodo = nuevo;
    }

    /*
    Elimina la primera aparición del valor x si existe.
    Recorre la lista manteniendo referencia al nodo anterior.
    Si se encuentra x, se ajustan los enlaces para eliminar el nodo.
    Complejidad: O(n)
    */
    @Override
    public void sacar(int x) {
        Nodo actual = nodo;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.data == x) {
                if (anterior == null) {
                    nodo = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    /*
    Verifica si al menos un nodo contiene el valor x.
    Recorre toda la lista hasta encontrarlo o llegar al final.
    Complejidad: O(n)
    */
    @Override
    public boolean pertenece(int x) {
        Nodo actual = nodo;
        while (actual != null) {
            if (actual.data == x) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /*
    Devuelve el valor del primer nodo (no hay orden definido).
    Si el conjunto está vacío, lanza una excepción.
    Complejidad: O(1)
    */
    @Override
    public int elegir() {
        if (nodo != null) {
            return nodo.data;
        }
		return 0;
    }
    
    /*
    Verifica si el conjunto está vacío.
    Retorna true si nodo es null.
    Complejidad: O(1)
    */
    @Override
    public boolean conjuntoVacio() {
        return nodo == null;
    }

    /*
    Devuelve una cadena con todos los elementos del conjunto separados por espacios.
    Recorre la lista completa y concatena los datos.
    Complejidad: O(n)
    */
    public String imprimirConjunto() {
        String resultado = "";
        Nodo actual = nodo;

        while (actual != null) {
            resultado += actual.data + " ";
            actual = actual.siguiente;
        }

        return resultado.trim();
    }
}
