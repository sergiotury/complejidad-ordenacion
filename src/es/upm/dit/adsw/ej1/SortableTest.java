package es.upm.dit.adsw.ej1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created by jcala on 21/02/2017.
 */
public class SortableTest {

    private String[] misDatos = {"Hola","Adios","Reloj","Telefono","//Hola","''","56"};
    private String[] vacio = {};
    private String[] mismo = {"mismo","mismo","mismo","mismo","mismo","mismo","mismo","mismo","aaaa","zzzzz"};
    private Sortable sorter;
    private Random random;

    @Before
    public void setUp(){
        sorter = new MergeSort();
        random = new Random();
    }

    @Test
    public void sortTestNormal() throws Exception {
        //Test Estandard con arrays de diferentes longitudes, con numeros y caracteres especiales
        sorter.sort(misDatos);
        assertTrue(StringSortHelper.isSorted(misDatos));
    }

    @Test
    public void sortTestVacio(){
        //Test del caso limite de usar como parametro un array vacio
        sorter.sort(vacio);
        assertTrue(StringSortHelper.isSorted(vacio));
    }

    @Test
    public void sortTestRepetido(){
        //Caso Limite de un array que contenga repetido un elemento numerosas veces
        sorter.sort(mismo);
        assertTrue(StringSortHelper.isSorted(mismo));
    }

    @Test
    public void testArrayAleatorio() {
        random = new Random();
        String[] datos = load(1000);
        sorter.sort(datos);
        assertTrue(StringSortHelper.isSorted(datos));
    }



    private String[] load(int n){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] data = new String[n];
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j=0; j < 20; j++) {
                int k = random.nextInt(chars.length);
                sb.append(chars[k]);
            }
            data[i] = sb.toString();

        }

        return data;

    }


}