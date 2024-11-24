/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author USER
 */
public class Transacciones extends CuentaPrincipal {
    private String Destinatario;
    private Integer monto;

    public Transacciones(String Destinatario, Integer monto, String Titular, Integer Id, double Saldo) {
        super(Titular, Id, Saldo);
        this.Destinatario = Destinatario;
        this.monto = monto;
    }
    

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }
    
    
    
}
