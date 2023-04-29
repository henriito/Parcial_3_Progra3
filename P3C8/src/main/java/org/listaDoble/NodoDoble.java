package org.listaDoble;

public class NodoDoble {
    int dato;
    NodoDoble adelante;
    NodoDoble atras;

    public int getDato() {
        return dato;
    }
    public NodoDoble(int entreada) {
        dato = entreada;
        adelante = atras=null;
    }

}
