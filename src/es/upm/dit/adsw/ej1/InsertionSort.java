package es.upm.dit.adsw.ej1;

/**
 * Created by jcala on 14/02/2017.
 */

public class InsertionSort implements Sortable{

    @Override
    public void sort(String[] datos) {
        for(int k = 0; k < datos.length; k++){
            String actual = datos[k];
            int j = k-1;
            while(j >= 0 && OpMeter.compareTo(actual,datos[j]) < 0){
                StringSortHelper.swap(datos,j,j+1);
                j--;
            }
        }
    }

    public static void main(String[] args){
        InsertionSort sorter = new InsertionSort();
        String[] lista = {"Hola","Adios","Malo","llave","nada"};
        sorter.sort(lista);
        for(String e: lista){
            System.out.println(e);
        }
    }
}
