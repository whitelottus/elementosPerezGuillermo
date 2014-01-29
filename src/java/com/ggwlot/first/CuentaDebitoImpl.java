
package com.ggwlot.first;

/**
 *
 * @author Whitelottus
 */
public class CuentaDebitoImpl extends Cuenta implements ServicioCuenta {
    
    @Override
    public String crearCuenta (){
        
        return "Se ha creado con exito una cuenta de Debito";
    }  
    
}
