package ejercicio6;

public class DiccionarioSinRepetir {
	public static ColaDin valoresSinRepetidos(DiccionarioMultipleDin dicc) {
		// Complejidad O(1) en el mejor caso, O(n^2) en el peor caso.
        ConjuntoTDA claves = dicc.claves();
        ConjuntoTDA valoresUnicos = new ConjuntoTDA();
        valoresUnicos.inicializarConjunto();
        ColaDin cola = new ColaDin();
        cola.inicializarCola();

        while (!claves.conjuntoVacio()) {
            int clave = claves.elegir();
            claves.sacar(clave);

            ConjuntoTDA valores = dicc.recuperar(clave);
            while (!valores.conjuntoVacio()) {
                int valor = valores.elegir();
                valores.sacar(valor);

                if (!valoresUnicos.pertenece(valor)) {
                    valoresUnicos.agregar(valor);
                    cola.acolar(valor);
                }
            }
        }
        return cola;
    }

}
