/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronclone;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);
        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();
        if(cuentaClonada!= null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaAhorro == cuentaClonada);
    }
    
}
