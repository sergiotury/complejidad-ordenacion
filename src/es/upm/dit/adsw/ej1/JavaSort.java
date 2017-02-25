package es.upm.dit.adsw.ej1;

import java.util.Arrays;

/**
 * Created by jcala on 21/02/2017.
 */
public class JavaSort extends StringSortHelper implements Sortable {


    @Override
    public void sort(String[] datos) {
        Arrays.sort(datos);
    }

}
