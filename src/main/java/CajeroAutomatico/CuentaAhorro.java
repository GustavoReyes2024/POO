/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author USER
 */
public class CuentaAhorro extends CuentaPrincipal {
    private double interes;
    private String Cuenta;

    public CuentaAhorro(double interes, String Cuenta, String Titular, Integer Id, double Saldo) {
        super(Titular, Id, Saldo);
        this.interes = interes;
        this.Cuenta = Cuenta;
    }
    
  
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    
}
