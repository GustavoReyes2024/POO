/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaDeAutos;

/**
 *
 * @author USER
 */
public class Motos extends VentaVehiculo{
    private String Marca;
    private Integer Retrovisores;

    public Motos(String Marca, Integer Retrovisores, String Motor, String Color, String Llantas) {
        super(Motor, Color, Llantas);
        this.Marca = Marca;
        this.Retrovisores = Retrovisores;
    }
   

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Integer getRetrovisores() {
        return Retrovisores;
    }

    public void setRetrovisores(Integer Retrovisores) {
        this.Retrovisores = Retrovisores;
    }
    
    
    
    
    
    
}
