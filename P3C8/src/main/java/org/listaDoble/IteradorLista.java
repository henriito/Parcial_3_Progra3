package org.listaDoble;

public class IteradorLista {
    private NodoDoble actual;
    public IteradorLista(ListaDoble ld)
    {
        actual = ld.cabeza;
    }
    public NodoDoble siguiente()
    {
        NodoDoble a;
        a = actual;
        if (actual != null)
        {
            actual = actual.adelante;
        }
        return a;
    }

}
