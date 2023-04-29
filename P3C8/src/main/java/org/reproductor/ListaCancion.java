package org.reproductor;

import org.listas.Lista;
import org.listas.Nodo;


import java.util.Scanner;

public class ListaCancion {
    public NodoMusic primero;
    public ListaCancion(){
        primero = null;
    }

    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public void visualizar(){
        NodoMusic n;
        int k =0;
        n = primero;
        while (n!= null){
            System.out.println(n.dato.getNombre()+" ");
            n = n.enlace; //esto a la cola
            k++;
            System.out.print( (k%15 !=0 ? " " : "\n")  );
        }
    }

    private Cancion leerCancion(){
        Cancion c = new Cancion();
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese ubicacion");
        c.setUbicacion(s.nextLine()) ;
        System.out.println("ingrese nombre cancion -1 para terminar");
        c.setNombre(s.nextLine()) ;
        return c;
    }

    public ListaCancion crearLista(){
        Cancion x = new Cancion();
        x.setNombre("un ladrillo mas en la pared");
        x.setUbicacion("C:\\Users\\ruldin\\Desktop\\un ladrillo mas en la pared.mp3");
        NodoMusic nc = new NodoMusic(x);
        primero = null;
        do {
            x=leerCancion();
            if (!x.getNombre().equals("-1")){
                primero = new NodoMusic(x,primero);
            }
        } while (!x.getNombre().equals("-1"));
        return this;
    }


}
