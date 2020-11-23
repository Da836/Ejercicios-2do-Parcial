public class OrdenamientoBurbuja {
    /*
     * Punto de entrada del programa
     */
    public static void main(String[] args) {
        int numeros[] = { 7, 0, 9, 8, 1, 4, 6, 2, 3, 5 };
        //Imprimimos por pantalla el arreglo de números enteros
        System.out.println("Arreglo sin orden:");
        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println();

        //Ordenamos en forma descendente el arreglo de números enteros y lo imprimimos por pantalla
        System.out.println("Orden descendente:");
        ordSelDesc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    /*
     * Este método ordena en forma descendente el arreglo pasado como argumento usando el
     * algoritmo de selección
     */
    public static void ordSelDesc(int[] arreglo) {
        //Iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;

            //Buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //Encontramos el mayor número
                }
            }

            if (i != max) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
}