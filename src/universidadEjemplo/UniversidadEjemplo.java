/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadEjemplo;

import java.sql.SQLException;

/**
 *
 * @author equipo
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        FuncionesDeLaBaseDeDatos funcion = new FuncionesDeLaBaseDeDatos();
        funcion.conectar_a_BD_insumosInformaticos();
        funcion.desconecta();
                
        
        
    }// end main
    
} // end class
