/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.evalucacion_ipc1;

/**
 *
 * @author berga
 */
public class NodoDoble {
    //atributus
    private cancion cancion;
    private NodoDoble anterior;
    private NodoDoble siguiente;
    
    //constructor
    public NodoDoble(cancion cancion){
        this.cancion = cancion;
        this.anterior = null;
        this.siguiente = null;
    }
}
