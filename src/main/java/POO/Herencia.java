/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Herencia {

    
    
    public static void main(String[] args) {
       Animal p = new Perro("color negro", "si", "si", "si", 4);
       //p.Sonido();
       
       Animal g = new Gato("Blanco", "si", "si", "si", 4);
       //g.Sonido();
       
       List<Animal> lista = new ArrayList<>();
       lista.add(p);
       lista.add(g);
       lista.add(new Quequo("no","si", "si", "si", 4));
       
       for(Animal item : lista){
           item.Sonido();
       }
    }
}
