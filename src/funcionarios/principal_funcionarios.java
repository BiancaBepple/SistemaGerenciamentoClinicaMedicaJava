/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

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
public class principal_funcionarios {
    private String recebe_nome;
    private String recebe_idade;
      private String recebe_rg;
      private String recebe_login;
      private String recebe_senha;

      public String getnome() {
        return recebe_nome;
    }

    public String getidade() {
        return recebe_idade;
    }

   
     public String getrg() {
        return recebe_rg;
    }
public String getlogin() {
        return recebe_login;
    }
public String getsenha() {
        return recebe_senha;
    }
     public void setnome(String nome) {
        this.recebe_nome = nome;
    }

    public void setidade(String idade) {
        this.recebe_idade = idade;
    }
public void setrg(String rg) {
        this.recebe_rg = rg;
    }
    

 public void setlogin(String login) {
        this.recebe_login = login;
    }
 public void setsenha(String senha) {
        this.recebe_senha = senha;
    }
 
   public void incluir(Connection conn) throws SQLException {
      // problema com o prazo de validade or causa do formato
        String sqlInsert = "INSERT INTO funcionarios (nome, idade, rg, login, senha) VALUES ( ?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getidade());
             stm.setString(3, getrg());
              stm.setString(4, getlogin());
               stm.setString(5, getsenha());
             
             
           
      
           
            // o comando execute()
           stm.execute();
         

        } catch (SQLException e) {
           System.out.println("Insira um valor válido");
          
        }
    }
 public void consulta(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO funcionarios (nome, idade,rg,login) VALUES (?,?, ?,?)"; 
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            System.err.println("passou 5");
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getidade());
             stm.setString(3, getrg());
             stm.setString(4, getlogin());
             stm.setString(5, getsenha());   
          
            
         
          //  System.err.println("passou 6");
            // o comando execute()
          stm.execute();
           // System.err.println("deu erro dnv");

        } catch (SQLException e) {
          //  System.out.println("Erro na consulta");
       
        }
    }
 public void alterar(Connection conn, int cod) throws SQLException {
String sqlAltera;

sqlAltera = "UPDATE funcionarios SET nome=?, idade=?, rg=?, login=?  WHERE idfuncionarios=" + cod;
 PreparedStatement stm = null;
 try {
 stm = conn.prepareStatement(sqlAltera);

  stm.setString(1, getnome());
  stm.setString(2, getidade());
  stm.setString(3, getrg());
    stm.setString(4, getlogin());       

 stm.execute();
 //conn.commit();
// System.out.println("Alteração Executada com Sucesso");
 
 }
      catch (SQLException e) 
       {
            JOptionPane.showConfirmDialog(null, "Não funcionou o alterar" + JOptionPane.ERROR_MESSAGE);
           
        }
     
     }
  public void excluir(Connection conn, Integer codid) throws SQLException {
        try {
            Statement stmt = conn.createStatement();
            String sqlinsert = "delete from funcionarios where idfuncionarios =" + codid;
            PreparedStatement stm = null;

            stm = conn.prepareStatement(sqlinsert);
            stm.execute();
        //    conn.commit();
         //   System.err.println("Excluido");
        } catch (SQLException e) {
           // System.out.println("Erro na exclusão");
           
        }
    }

 
 
}
