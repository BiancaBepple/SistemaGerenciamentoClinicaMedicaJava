/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CADASTRO;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171inf0171
 */
public class cadastro {

    private String nome_paciente;
    private int idade_paciente;
    private String cpf_paciente;
    private int rg_paciente;
    private String ps_paciente;
    private String pesquisapaciente;
   

    public void setnomepaciente(String nome) {
        this.nome_paciente = nome;
    }

    public void setidadepaciente(int idade) {
        this.idade_paciente = idade;
    }

    public void setcpfpaciente(String cpf) {
        this.cpf_paciente = cpf;
    }

    public void setrgpaciente(int rg) {
        this.rg_paciente = rg;
    }

    public void setpspaciente(String ps) {
        this.ps_paciente = ps;
    }

    public String getnomepaciente() {
        return nome_paciente;
    }

    public int getidadepaciente() {
        return idade_paciente;
    }

    public String getcpfpaciente() {
        return cpf_paciente;
    }

    public int getrgpaciente() {
        return rg_paciente;
    }

    public String getpspaciente() {
        return ps_paciente;
    }

    //FALTA FAZER DAQUI PRA BAIXO
    public void incluirpaciente(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO clientes (nome, idade, cpf, plano_saude, rg) VALUES ( ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            /*
            stm.setString(1, getnomepaciente());
            stm.setInt(2, getidadepaciente());
            stm.setString(3, getcpfpaciente());
            stm.setString(4, getpspaciente());
            stm.setInt(5, getrgpaciente());
*/
            
            stm.setString(1, getnomepaciente());
            stm.setInt(2, getidadepaciente());
            stm.setString(3, getcpfpaciente());
            stm.setString(4, getpspaciente());
            stm.setInt(5, getrgpaciente());
            // 

            // o comando execute()
            stm.execute();
          
            JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra incluir " + JOptionPane.ERROR_MESSAGE);


        }

    }

    public void alterarpaciente(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE clientes SET nome = ?, idade=?, cpf=?, plano_saude=? WHERE idclientes=" + cod;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlAltera);
            stm.setString(1, getnomepaciente());
            stm.setInt(2, getidadepaciente());
            stm.setString(3, getcpfpaciente());
            stm.setString(4, getpspaciente());
            stm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra alterar " + JOptionPane.ERROR_MESSAGE);
            

        }

    }
    

    public void excluirpaciente(Connection conn, int cod) {
        String sqlExcluir = "delete from clientes WHERE idclientes=" + cod;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlExcluir);
            stm.execute();
           
            
} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra excluir " + JOptionPane.ERROR_MESSAGE);
           

        }
    }


}