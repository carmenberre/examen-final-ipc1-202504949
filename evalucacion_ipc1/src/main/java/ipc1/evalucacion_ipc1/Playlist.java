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
}
