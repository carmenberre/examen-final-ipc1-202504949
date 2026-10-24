/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.evalucacion_ipc1;

/**
 *
 * @author berga
 */
public class Playlist {
    //atributos
    NodoDoble cabeza;
    NodoDoble cola;
    NodoDoble actual;
    int tamano;
    
    //constructor
    public Playlist(){
        cabeza = null;
        cola = null;
        actual = null;
        tamano = 0;
    }
    
    public void AgregarCancion(cancion c){
        NodoDoble nueva = new NodoDoble(c);
        
        if(cabeza == null){
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        }else{
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
        tamano++;
    }
    
    public void mostrarPlaylist(){
        
        NodoDoble repro = cabeza;
        
        if(repro == null){
            System.out.println("Playlist vacía");
        }
        
        int orden = 1;
        while(repro != null){
            System.out.println("Cancion "+ orden +": " + repro.cancion.getNombre());
            repro = repro.siguiente;
            orden++;
        }
    }
    
    //para pasar siguiente a actual
    public NodoDoble siguiente(){
        if(actual == null || actual.siguiente == null){
            return null;
        }
        actual = actual.siguiente;
        actual.cancion.reproducir();
        return actual;
    }
    
    //para pasar siguiente a actual
    public NodoDoble anterior(){
        if(actual == null || actual.anterior == null){
            return null;
        }
        actual = actual.anterior;
        actual.cancion.reproducir();
        return actual;
    }
    
    public void eliminarActual(){
        if(actual == null){
            return;
        }
        NodoDoble eliminar = actual;
        if (cabeza == cola){
            cabeza = null;
            cola = null;
            actual = null;
        }else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        } else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
            actual = actual.siguiente;
        }
        eliminar.anterior = null;
        eliminar.siguiente = null;
        tamano--;
    }
}
