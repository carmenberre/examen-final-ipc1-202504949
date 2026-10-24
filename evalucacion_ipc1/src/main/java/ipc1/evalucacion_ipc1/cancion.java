/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.evalucacion_ipc1;

/**
 *
 * @author berga
 */
public class cancion extends multimedia{
    public static void print(Object texto) {
        System.out.println(texto);
    }
    
    //atributo
    private String artista;
    
    //constructor
    public cancion(String nombre, int duracion, String artista){
        super(nombre,duracion);
        this.artista = artista;
    }
    
    //clsde reproducir
    @Override
    public void reproducir() {
        print("Reproduciendo: " + nombre);
    }
}
