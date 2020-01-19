/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANCO;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0228
 */
public class conexao {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 20171inf0228
 */

  
public Connection getConnection(){
try{
 return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");

 }
catch(SQLException e){
 JOptionPane.showMessageDialog(null, "Erro ao Conexão do Banco de Dados" +"\n" + e,"Mensagem do Sistema ",JOptionPane.ERROR_MESSAGE );
 exit(0);
 }
 return null;
 }


}


