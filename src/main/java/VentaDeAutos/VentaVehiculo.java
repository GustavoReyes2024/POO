/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaDeAutos;

/**
 *
 * @author USER
 */
public class VentaVehiculo {
    private String Motor;
    private String Color;
    private String Llantas;

    public VentaVehiculo(String Motor, String Color, String Llantas) {
        this.Motor = Motor;
        this.Color = Color;
        this.Llantas = Llantas;
    }
    
   
    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getLlantas() {
        return Llantas;
    }

    public void setLlantas(String Llantas) {
        this.Llantas = Llantas;
    }
    
    
}
