package es.upm.dit.adsw.ej1;

/**
 * Created by adsw
 */
public class BubbleSort implements Sortable {
    @Override
    public void sort(String[] datos) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < datos.length; i++) {
                String temp = "";
                if (OpMeter.compareTo(datos[i - 1], datos[i]) > 0) {
                    temp = datos[i - 1];
                    datos[i - 1] = datos[i];
                    datos[i] = temp;
                    swapped = true;
                }
            }
        }
    }
}