/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CONSULTAR;

import MENU_CADASTRO.cadastroconsulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0171
 */
public class mostraconsulta extends cadastroconsulta{

     private int numero_consulta;
     private String diagnostico;
    public int getNumero_consulta() {
        return numero_consulta;
    }  
    public void setNumero_consulta(int numero_consulta) {
        this.numero_consulta = numero_consulta;
    }
   
    
    public void alterarconsulta(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE consulta SET diagnostico = ? where idconsulta=" + cod;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlAltera);
            stm.setString(1, getdiagnostico());
            stm.execute();
             JOptionPane.showMessageDialog(null, "Consulta finalizada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra alterar " + JOptionPane.ERROR_MESSAGE);
           

        }

    }
    
        public void excluirconsulta(Connection conn, int cod) {
        String sqlExcluir = "delete from consulta WHERE idconsulta=" + cod;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlExcluir);
            stm.execute();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            
} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra excluir " + JOptionPane.ERROR_MESSAGE);
           

        }
    }
        
        public void alteraconsultatoda(Connection conn, int cod){
        String sqlAltera;
        sqlAltera = "UPDATE consulta SET paciente= ?, medico =?, data=?, hora=?, sintomas=?, diagnostico = ? where idconsulta=" + cod;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlAltera);
            stm.setString(1, getnomepaciente());
            stm.setString(2, getmedico());
            stm.setString(3, getdata());
            stm.setString(4, gethorario());
            stm.setString(5, getsintomas());
            stm.setString(6, getdiagnostico());
            stm.execute();
             JOptionPane.showMessageDialog(null, "Consulta Alterada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar consulta!" + JOptionPane.ERROR_MESSAGE);
           

        }
        }
    
}
