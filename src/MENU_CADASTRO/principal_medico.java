/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CADASTRO;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Marina
 */
public class principal_medico {
    
    
    private String recebe_nome;
    private String recebe_especialidade;
    private String recebe_turno;
    
 public String getnome() {
        return recebe_nome;
    }

    public String getespecialidade() {
        return recebe_especialidade;
    }
     public String getturno() {
        return recebe_turno;
    }
    public void setnome(String nome) {
        this.recebe_nome = nome;
    }

    public void setespecialidade(String especialidade) {
        this.recebe_especialidade = especialidade;
    }
     public void setturno(String turno) {
        this.recebe_turno = turno;
    }

    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO medicos (nome, especialidade,turno) VALUES ( ?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getespecialidade());
         stm.setString(3, getturno());
           
      
           
            // o comando execute()
           stm.execute();
         

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Deu erro no incluir, chora: " + JOptionPane.ERROR_MESSAGE);
            exit(0);
        }
    } 


public void consulta(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO medicos (nome, especialidade, turno) VALUES (?, ?,?)"; 
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            System.err.println("passou 5");
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getespecialidade());
             stm.setString(3, getturno());
          
            
         
            System.err.println("passou 6");
            // o comando execute()
          stm.execute();
            System.err.println("deu erro dnv");

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "DEU ERRO no consultar : " + JOptionPane.ERROR_MESSAGE);
            exit(0);
        }
    }
 public void alterar(Connection conn, int cod) throws SQLException {
String sqlAltera;

sqlAltera = "UPDATE medicos SET nome=?, especialidade=?, turno=? WHERE idmedico=" + cod;
 PreparedStatement stm = null;
 try {
 stm = conn.prepareStatement(sqlAltera);

  stm.setString(1, getnome());
  stm.setString(2, getespecialidade());
  stm.setString(3, getturno());
           

 stm.execute();
 //conn.commit();
 System.out.println("Alteração Executada com Sucesso");
 
 }
      catch (SQLException e) 
       {
            JOptionPane.showConfirmDialog(null, "Não funcionou o alterar" + JOptionPane.ERROR_MESSAGE);
            exit(0);
        }
     
     }
   public void excluir(Connection conn, Integer codid) throws SQLException {
        try {
            Statement stmt = conn.createStatement();
            String sqlinsert = "delete from medicos where idmedico =" + codid;
            PreparedStatement stm = null;

            stm = conn.prepareStatement(sqlinsert);
            stm.execute();
        //    conn.commit();
            System.err.println("Excluido");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Deu erro marina vc eh uma pessima programadora, msg do system: " + JOptionPane.ERROR_MESSAGE);
            exit(0);
        }
    }

    public void consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
