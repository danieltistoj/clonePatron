/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronclone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CuentaAHImpl implements ICuenta{
    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        tipo = "AHORRO";
    }
    @Override
    public ICuenta clonar(){
        CuentaAHImpl cuenta = null;
        try {
            cuenta = (CuentaAHImpl) clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CuentaAHImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenta;
    }
    @Override
    public String toString(){
        return "CuentaAHImpl ["+tipo+","+monto+"]";
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
