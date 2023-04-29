package org.listaDoble;

public class ListaDoble {
    protected NodoDoble cabeza; // se define el nodo que se llama primero

    public ListaDoble()
    {
        cabeza = null;
    }
    public ListaDoble insertarCabezaLista(int entrada)
    {
        NodoDoble nuevo;
        nuevo = new NodoDoble(entrada);
        nuevo.adelante = cabeza;
        if (cabeza != null )
            cabeza.atras = nuevo;
        cabeza = nuevo;
        return this;
    }



    public ListaDoble insertaDespues(NodoDoble anterior, int entrada)
    {
        NodoDoble nuevo;
        nuevo = new NodoDoble(entrada);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null)
            anterior.adelante.atras = nuevo;
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
        return this;
    }



    public void eliminar (int entrada)
    {
        NodoDoble actual;
        boolean encontrado = false;
        actual = cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado))
        {
            /* la comparación se realiza con el método equals()...,
            depende del tipo Elemento */
            encontrado = (actual.dato == entrada);
            if (!encontrado)
                actual = actual.adelante;
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null)
        {
            //distingue entre nodo cabecera o resto de la lista
            if (actual == cabeza)
            {
                cabeza = actual.adelante;
                if (actual.adelante != null)
                    actual.adelante.atras = null;
            }
            else if (actual.adelante != null) // No es el último nodo
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            }
            else // último nodo
                actual.atras.adelante = null;
            actual = null;
        }
    } // eliminar



    public void visualizar()
    {
        NodoDoble n;
        n = cabeza;
        while (n != null)
        {
            System.out.print(n.dato + "\n");
            n = n.adelante;
        }
    }




}
