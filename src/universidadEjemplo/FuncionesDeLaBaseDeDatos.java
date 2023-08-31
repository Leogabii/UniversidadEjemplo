/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadEjemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/**
 *
 * @author equipo
 */
public class FuncionesDeLaBaseDeDatos {

    private Connection con=null;
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    private final String ROOT="root";
    private final String PASSWORD="";
    private final String URL ="jdbc:mysql://localhost:3306/universidadulp";
    
    
     // -------- metodo conectar ------------------
    public void conectar_a_BD_insumosInformaticos() throws ClassNotFoundException, SQLException{
    try{
        Class.forName(DRIVER);
        con=DriverManager.getConnection(URL,ROOT,PASSWORD);
        if (con!=null){
            JOptionPane.showMessageDialog(null,"CONECCION EXITOSA!!");
           
        }
      //System.out.println("Conecion Exitosa!!!!");
    }catch (ClassNotFoundException | SQLException cl){
        System.out.println("Error que salto:" + cl.getMessage());
    }
  }
 
    
    
   // --------------- metodo desconectar ----------------------
    
public void desconecta() throws SQLException {
try{
/* todavia no porque solo estoy conectando o desconectando
    
if(resultado!=null){
resultado.close();
    System.out.println("vaciado la variable resultado");
}

if(sentencia!=null){
sentencia.close();
    System.out.println("cerrada variable sentencia");

}
*/
if(con!=null){
con.close();
    JOptionPane.showMessageDialog(null,"base de datos cerrada");
    //System.out.println("base de datos cerrado");
}
}catch(SQLException sqlex){
    throw sqlex;
}


}


    
} //end class 
