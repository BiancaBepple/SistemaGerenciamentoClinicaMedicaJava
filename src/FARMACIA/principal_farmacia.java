/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FARMACIA;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0228
 */
public class principal_farmacia {
      private String recebe_nome;
    private String recebe_laboratorio;
    private String recebe_quantidade;
      private String recebe_validade;

      public String getnome() {
        return recebe_nome;
    }

    public String getlaboratorio() {
        return recebe_laboratorio;
    }

    public String getquantidade() {
        return recebe_quantidade;
    }

     public String getvalidade() {
        return recebe_validade;
    }

     public void setnome(String nome) {
        this.recebe_nome = nome;
    }

    public void setlaboratorio(String laboratorio) {
        this.recebe_laboratorio = laboratorio;
    }

    public void setquantidade(String quantidade) {
        this.recebe_quantidade = quantidade;
    }

 public void setvalidade(String validade) {
        this.recebe_validade = validade;
    }
  public void incluir(Connection conn) throws SQLException {
      // problema com o prazo de validade or causa do formato
    
        String sqlInsert = "INSERT INTO medicamentos (nome, laboratorio, quantidade, validade) VALUES ( ?,?,?,?)";
        PreparedStatement stm = null;
       
        try {
            stm = conn.prepareStatement(sqlInsert);
            
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getlaboratorio());
            stm.setString(3, getquantidade());
             stm.setString(4, getvalidade());
             
             
           
      
           
            // o comando execute()
           stm.execute();
         

        } catch (SQLException e) {
            //System.out.println("Insira uma data válida");
        
        }
        
        
        
        
        
    }
    
  
  public void consulta(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO medicamentos (nome, laboratorio,quantidade, validade) VALUES (?, ?,?,?)"; 
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
       //     System.err.println("passou 5");
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getlaboratorio());
             stm.setString(3, getquantidade());
                 stm.setString(4, getvalidade());
          
            
         
          //  System.err.println("passou 6");
            // o comando execute()
          stm.execute();
         //   System.err.println("deu erro dnv");

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "DEU ERRO no consultar : " + JOptionPane.ERROR_MESSAGE);
            
        }
        
       
        
    }
  
  public void alterar(Connection conn, int cod) throws SQLException {
String sqlAltera;

sqlAltera = "UPDATE medicamentos SET nome=?, laboratorio=?, quantidade=?,validade=? WHERE idmedicamentos=" + cod;
 PreparedStatement stm = null;
 try {
 stm = conn.prepareStatement(sqlAltera);

  stm.setString(1, getnome());
  stm.setString(2, getlaboratorio());
  stm.setString(3, getquantidade());
  stm.setString(4, getvalidade());
           

 stm.execute();
 //conn.commit();
// System.out.println("Alteração Executada com Sucesso");
 
 }
      catch (SQLException e) 
       {
            JOptionPane.showMessageDialog(null, "Erro na alteração, insira uma data válida!" );
          
        }
     
     }
  
  
  public void excluir(Connection conn, int codid) throws SQLException {
        try {
            Statement stmt = conn.createStatement();
            String sqlinsert = "delete from medicamentos where idmedicamentos =" + codid;
            PreparedStatement stm = null;

            stm = conn.prepareStatement(sqlinsert);
            stm.execute();
        //    conn.commit();
         //   System.err.println("Excluido");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão!" );
         
        }
    }

    
    public void atualizar(Connection conn) throws SQLException {
        try {
            Statement stmt = conn.createStatement();
            String sqlinsert = "delete from medicamentos WHERE validade<=curdate()";
            PreparedStatement stm = null;

            stm = conn.prepareStatement(sqlinsert);
            stm.execute();
        //    conn.commit();
          // System.err.println("Excluido");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Insira uma data válida!" );
           
        }
    }

    public void consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
      public void diminuirestoque(Connection conn, int cod, int quantidade) throws SQLException {
String sqlAltera;

sqlAltera = "UPDATE medicamentos SET quantidade = quantidade-"+ quantidade +" WHERE idmedicamentos =" + cod;
 PreparedStatement stm = null;
 try {
 stm = conn.prepareStatement(sqlAltera);
 stm.execute();
 //conn.commit();
// System.out.println("Alteração Executada com Sucesso");
 
 }
      catch (SQLException e) 
       {
            JOptionPane.showMessageDialog(null, "Erro na alteração do estoque." );
          
        }
     
     }
    
}

  
  

