/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANCO;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0228
 */
public class Testaconexao {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) throws
SQLException {
 try (Connection connection = new conexao().getConnection()) {
 System.out.println("Conexão aberta!");
 JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso", "Mensagem do Sistema ", JOptionPane.WARNING_MESSAGE );
}
 
 }    
}

    


    

