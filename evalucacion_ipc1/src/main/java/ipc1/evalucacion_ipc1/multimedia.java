/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.evalucacion_ipc1;

/**
 *
 * @author berga
 */
abstract class multimedia {
    //atributos
    public String nombre;
    private int duracion;
    
    //constructor
    public multimedia(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    //clase reproducir
    public abstract void reproducir();
}
