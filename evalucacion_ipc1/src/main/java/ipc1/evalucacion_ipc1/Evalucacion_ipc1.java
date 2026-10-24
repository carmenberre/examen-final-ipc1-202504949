/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ipc1.evalucacion_ipc1;

/**
 *
 * @author berga
 */
public class Evalucacion_ipc1 {
    
    public static void print(Object texto) {
        System.out.println(texto);
    }
    
    public static void main(String[] args) {
        cancion cancion1 = new cancion("Cancion 1", 180, "un artista");
        cancion cancion2 = new cancion("Cancion 2", 210, "otro artista");
        cancion cancion3 = new cancion("Cancion 3", 240, "y otro otro artista");
        
        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();
    }
}
