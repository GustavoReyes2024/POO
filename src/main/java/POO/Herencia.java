/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author USER
 */
public class Herencia {

    public static void main(String[] args) {
       Animal p = new Perro("color negro", "si", "si", "si", 4);
       p.Sonido();
       
       Animal g = new Gato("Blanco", "si", "si", "si", 4);
       g.Sonido();
       
       
    }
}
