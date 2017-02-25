package es.upm.dit.adsw.ej1;

/**
 * Clases que ordenan arrays de String.
 */
public class StringSortHelper {

    /**
     * Intercambio.
     * Lo que hay en la posicion i pasa a la posicion j.
     * Lo que hay en la posicion j pasa a la posicion i.
     */
    public static void swap(String[] datos, int i, int j) {
        if (i == j) {
            return;
        }
        String si = datos[i];
        String sj = datos[j];
        datos[i] = sj;
        datos[j] = si;
    }

    /**
     * Predicado.
     *
     * @param datos Strings.
     * @return TRUE si los datos estan ordenados entre [a, z).
     */

    public static boolean isSorted(String[] datos){
        return isSorted(datos,0,datos.length);
    }

    public static boolean isSorted(String[] datos, int a, int z) {
        for (int i = a; i + 1 < z; i++) {
            if (datos[i].compareTo(datos[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}