/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *                        
 * @author USER
 */
public class CuentaPrincipal {
    private String Titular; 
    private Integer Id;
    private double Saldo;

    public CuentaPrincipal(String Titular, Integer Id, double Saldo) {
        this.Titular = Titular;
        this.Id = Id;
        this.Saldo = Saldo;
    }
    

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
