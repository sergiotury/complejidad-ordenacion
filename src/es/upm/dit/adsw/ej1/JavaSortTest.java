package es.upm.dit.adsw.ej1;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jcala on 21/02/2017.
 */
public class JavaSortTest {

    private String[] misDatos = {"Hola","Adios","Reloj","Telefono","//Hola","''","56"};
    private String[] vacio = {};
    private String[] mismo = {"mismo","mismo","mismo","mismo","mismo","mismo","mismo","mismo"};
    private JavaSort sorter;

    @Before
    public void setUp(){
        sorter = new JavaSort();
    }
    @Test
    public void sort() throws Exception {
        sorter.sort(misDatos);
        sorter.sort(vacio);
        sorter.sort(mismo);
        assertTrue(sorter.isSorted(misDatos,0,misDatos.length));
        assertTrue(sorter.isSorted(vacio,0,vacio.length));
        assertTrue(sorter.isSorted(mismo,0,mismo.length));

    }

}