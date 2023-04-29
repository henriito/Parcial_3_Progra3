/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.reproductor;

import org.reproductor.Cancion;
import org.reproductor.ListaCancion;

/**
 *
 * @author Windows 10
 */
public class ColaLineal extends ListaCancion{

    protected int fin;

    private static int MAXTAMQ = 39;

    protected int frente;

    protected Object[] listaCola;

    public ColaLineal(){
        super();
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }
    public boolean colaLlena(){
        return  fin == MAXTAMQ - 1;
    }

    public boolean colaVacia(){
        return  frente > fin;
    }

    public ColaLineal insertar(Cancion x) throws Exception{
        if (!colaLlena()){
            listaCola[++fin] = x;
        }else {
            throw new Exception("La cola esta llena ");
        }
    return this; 
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

    public void borrarCola() {
        frente = 0;
        fin = -1;
    }

    public Object frenteCola() throws Exception{
        if (!colaVacia()){
            return listaCola[frente];
        }else{
            throw new Exception("cola empty");
        }
    }

    public Object Quita() throws Exception{
        if (!colaVacia()){
            return listaCola[frente++];
        }else{
            throw new Exception("cola empty");
        }    }
}
