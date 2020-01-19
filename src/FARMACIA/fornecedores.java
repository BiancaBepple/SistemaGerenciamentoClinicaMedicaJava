
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0228
 */
public class fornecedores {
    private String recebe_idfornecedor;
    private String recebe_nome;
    private String recebe_laboratorio;
    private String recebe_cidade;
    private String recebe_quantidade;
    private String recebe_estado;
    private String recebe_endereco;
    private String recebe_validade;

      public String getnome() {
        return recebe_nome;
    }
      
       public String getidfornecedor() {
        return recebe_idfornecedor;
    }

    public String getlaboratorio() {
        return recebe_laboratorio;
    }
    
       public String getcidade() {
        return recebe_cidade;
    }

    public String getendereco() {
        return recebe_endereco;
    }
              
    public String getquantidade() {
        return recebe_quantidade;
    }
    
    public String getestado() {
        return recebe_estado;
    }

     public String getvalidade() {
        return recebe_validade;
    }

     public void setnome(String nome) {
        this.recebe_nome = nome;
    }

    public void setidfornecedor(String idfornecedor) {
        this.recebe_idfornecedor = idfornecedor;
    }
          
    public void setlaboratorio(String laboratorio) {
        this.recebe_laboratorio = laboratorio;
    }
    
    public void setcidade(String cidade) {
        this.recebe_cidade = cidade;
    }

    public void setquantidade(String quantidade) {
        this.recebe_quantidade = quantidade;
    }
    
    public void setestado(String estado) {
        this.recebe_estado = estado;
    }
    
    public void setendereco(String endereco) {
        this.recebe_endereco = endereco;
    }

 public void setvalidade(String validade) {
        this.recebe_validade = validade;
    }
  
    public void incluir_fornecedor(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO fornecedores (nome, cidade, estado, endereco) VALUES ( ?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getcidade());
            stm.setString(3, getestado());
            stm.setString(4, getendereco());
            
            // o comando execute()
           stm.execute();
         

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Inclusão não realizada, verifique os valores inseridos." + JOptionPane.ERROR_MESSAGE);
           
        }
    }
    public void consultar(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO fornecedores (nome, cidade,estado,endereco) VALUES (?,?, ?,?)"; 
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            System.err.println("passou 5");
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            stm.setString(1, getnome());
            stm.setString(2, getcidade());
             stm.setString(3, getestado());
             stm.setString(4, getendereco());
            
          
            
         
         
            // o comando execute()
          stm.execute();
            System.err.println("deu erro dnv");

        } catch (SQLException e) {
            System.out.println("Erro na consulta");
            exit(0);
        }
    }
      public void alterar(Connection conn, int cod) {
        String sqlAltera;
        sqlAltera = "UPDATE fornecedores SET nome = ?, cidade = ?, estado=?, endereco=? WHERE idfornecedor=" + cod;
        PreparedStatement stm = null;
        try {

            stm = conn.prepareStatement(sqlAltera);
            stm.setString(1, getnome());
            stm.setString(2, getcidade());
            stm.setString(3, getestado());
            stm.setString(4, getendereco());
            stm.execute();
            // conn.commit();
          //  System.out.println("Alteração realizada com Sucesso" + sqlAltera);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar" + JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluir(Connection conn, int cod) {
                    
    String sqlExcluir = "delete from fornecedores WHERE idfornecedor=" + cod;
    PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlExcluir);
            stm.execute();
         
           // System.out.println("Exclusão Executada com Sucesso");
  
        } catch (SQLException ex) {
            Logger.getLogger(fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    
}
