package org.example;

import java.io.File;
import org.listas.Lista;
import org.reproductor.Cancion;
import org.reproductor.ListaCancion;
import org.reproductor.ListaCancionOrdenada;
import org.reproductor.ColaLineal;

public class Main {
    public static void main(String[] args) {

//       Lista l = new Lista();
//       var respuesta = l.crearLista();
//       // System.out.println(respuesta);
//        respuesta.visualizar();


        //lista simple
//        ListaCancion lc = new ListaCancion();
//        lc.crearLista();
//        lc.visualizar();

        //lista ordenada
//        ListaCancionOrdenada lco = new ListaCancionOrdenada();
//        
//        File capeta = new File("C:\\Users\\Windows 10\\Music\\Musica\\");
//        File[] achios = capeta.listFiles();
//        
//        for(File achio : achios){
//            if(achio.isFile()){
//                Cancion c = new Cancion();
//                c.setNombre(achio.getName());
//                c.setUbicacion("");
//            }
//        }
//        
//        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","zzz.mp3"));
//        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","aaa.mp3"));
//        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","001.mp3"));
//        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","zaz.mp3"));
//        lco.visualizar();
//
//        System.out.println("fin");
        ColaLineal cl = new ColaLineal();
 File capeta = new File("C:\\Users\\Windows 10\\Music\\Musica\\");
        File[] achios = capeta.listFiles();
        
        for(File achio : achios){
            if(achio.isFile()){
                Cancion c = new Cancion();
                c.setNombre(achio.getName());
                c.setUbicacion("");
            }
        }
        try {
            cl.insertar(new Cancion("C:\\Users\\Windows 10\\Music\\Musica\\Hidden Agenda.mp3","Happy Boy End Theme.mp3"));
            cl.insertar(new Cancion("C:\\Users\\Windows 10\\Music\\Musica\\Radio Martini.mp3","Doh De Oh.mp3"));
//            cl.insertar(new Cancion("C:\\Users\\Windows 10\\Music\\Musica\\Un Verano Sin Ti.mp3","La Corriente.mp3"));
//            cl.insertar(new Cancion("C:\\Users\\Windows 10\\Music\\Musica\\Un Verano Sin Ti.mp3","Callaita.mp3"));
//            cl.insertar(new Cancion("C:\\Users\\Windows 10\\Music\\Musica\\Un Verano Sin Ti.mp3","El Apagon.mp3"));

            while (!cl.colaVacia()){
                cl.visualizar();
            }
        }catch (Exception ex){
            System.out.println("Hay molestias: "+ex.getMessage());
        }
//        cl.borrarCola();
//        System.out.println("Nueva Cola: ");
//        try {
//            cl.insertar("Henry");
//            cl.insertar(100);
//            cl.insertar("abuelo.mp3");
//
//            while (!cl.colaVacia()){
//                System.out.println(cl.Quita());
//            }
//        }catch (Exception ex){
//            System.out.println("Hay molestias: "+ex.getMessage());
//        }
        System.out.println("End");
    }

    }