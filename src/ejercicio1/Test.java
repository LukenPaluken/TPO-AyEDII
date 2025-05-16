package ejercicio1;

/*
Clase Test para probar el funcionamiento de ConjuntoEspecialTDA.
Agrega varios elementos, imprime el conjunto, elimina un valor,
y muestra el resultado final.
*/
public class Test {
    public static void main(String[] args) {
        ConjuntoEspecialTDA conjunto = new ConjuntoEspecialTDA();
        conjunto.inicializarConjunto();

        /*
        Agrega los elementos: {18, 2, 7, 4, 18, 22, 2, 7}
        El orden en que se imprimen puede ser diferente
        porque se insertan al principio de la lista.
        */
        conjunto.agregar(18);
        conjunto.agregar(2);
        conjunto.agregar(7);
        conjunto.agregar(4);
        conjunto.agregar(18);
        conjunto.agregar(22);
        conjunto.agregar(2);
        conjunto.agregar(7);

        System.out.println("Elementos del conjunto:");
        System.out.println(conjunto.imprimirConjunto());

        /*
        Elimina el primer 2 que aparece.
        */
        conjunto.sacar(2);

        System.out.println("Después de eliminar un 2:");
        System.out.println(conjunto.imprimirConjunto());

        /*
        Verifica si el 18 pertenece al conjunto.
        */
        boolean existe = conjunto.pertenece(18);
        System.out.println("¿El 18 pertenece?: " + existe);

        /*
        Elige un elemento cualquiera del conjunto.
        */
        int elegido = conjunto.elegir();
        System.out.println("Elemento elegido: " + elegido);
    }
}
