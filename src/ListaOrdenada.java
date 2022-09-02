/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class ListaOrdenada<T> extends Lista<T> {

    private Nodo<T> primero;
    private int longitud;

    public ListaOrdenada() {
        primero = null;
        longitud = 0;
    }

    public void insertarOrdenado(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
            primero.setSiguiente(null);
            longitud++;
        } else {
            Nodo<T> nodoActual = primero;
            while (nodoActual.getSiguiente() != null) {
                int comparacion = nodoActual.getEtiqueta().compareTo(nodo.getEtiqueta());
                if (comparacion > 0) {
                    nodo.setSiguiente(nodoActual.getSiguiente());
                    nodoActual.setSiguiente(nodo);
                    longitud++;
                }
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }
   
}
