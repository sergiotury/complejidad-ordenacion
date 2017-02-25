package es.upm.dit.adsw.ej1;


public class MergeSort implements Sortable {




    public void sort(String[] datos) {
        datos = mergeSort(datos);
    }

    private String[] mergeSort(String[] datos){
        if(datos.length == 1 || datos.length == 0){
            return datos;
        }

        String[] izquierda = new String[datos.length/2];
        String[] derecha = new String[datos.length-izquierda.length];
        System.arraycopy(datos,0,izquierda,0,izquierda.length);
        System.arraycopy(datos,izquierda.length,derecha,0,derecha.length);

        mergeSort(izquierda);
        mergeSort(derecha);

        merge(izquierda,derecha,datos);
        return datos;
    }

    private void merge(String[] izquierda, String[] derecha, String[] datos) {
        int posIzquierda = 0;
        int posDerecha = 0;

        int j = 0;

        while (posIzquierda < izquierda.length && posDerecha < derecha.length) {
            if (OpMeter.compareTo(izquierda[posIzquierda],(derecha[posDerecha])) <= 0) {
                datos[j] = izquierda[posIzquierda];
                posIzquierda++;
            } else {
                datos[j] = derecha[posDerecha];
                posDerecha++;
            }
            j++;
        }

        System.arraycopy(izquierda, posIzquierda, datos, j, izquierda.length - posIzquierda);
        System.arraycopy(derecha, posDerecha, datos, j, derecha.length - posDerecha);
    }




    public static void main(String args[]){
        MergeSort sorter = new MergeSort();
        String[] lista = {};
        System.out.println(lista.length);
        sorter.sort(lista);
        for(String e : lista){
            System.out.println(e);
        }
    }

}
