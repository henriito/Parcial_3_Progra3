 package org.listaDoble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ejecutable {



    public static void main(String[] args) throws IOException {
        Random r;
        int d, x1, x2;
        final int M = 29; // número de elementos de la lista
        final int MX = 999; // MAXIMO NUMERO
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        ListaDoble listaDb;
        r = new Random();
        listaDb = new ListaDoble();
        for (int j = 1; j <= M; j++) {
            d = r.nextInt(MX) + 1;
            listaDb.insertarCabezaLista(d);
        }
        System.out.println("Elementos de la lista original");
        listaDb.visualizar();
// rango de valores
        System.out.println("\nIngrese rango inicial");
        x1 = Integer.parseInt(entrada.readLine());
        System.out.println("\nIngrese rango final");
        x2 = Integer.parseInt(entrada.readLine());
// crea iterador asociado a la lista
        IteradorLista iterador = new IteradorLista(listaDb);
        NodoDoble a;
// recorre la lista con el iterador
        a = iterador.siguiente();
        while (a != null) {
            int w;
            w = a.getDato();
            if (!(w >= x1 && w <= x2)) // fuera de rango
            {
                listaDb.eliminar(w);
            }
            a = iterador.siguiente();
        }
        System.out.println("Elementos actuales de la lista");
        listaDb.visualizar();
    }

}
