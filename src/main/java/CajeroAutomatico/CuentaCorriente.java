/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author USER
 */
public class CuentaCorriente extends CuentaPrincipal{
    
    private String nombre;
    private Integer Edad;

    public CuentaCorriente(String nombre, Integer Edad, String Titular, Integer Id, double Saldo) {
        super(Titular, Id, Saldo);
        this.nombre = nombre;
        this.Edad = Edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
    
    
    
}
