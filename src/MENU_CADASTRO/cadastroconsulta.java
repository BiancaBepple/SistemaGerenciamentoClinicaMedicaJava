/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CADASTRO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bianc
 */
public class cadastroconsulta extends cadastro {
    private String medico;
    private String data;
    private String horario;
    private String sintomas;
    private String diagnostico;
    
     public void setmedico(String nome) {
        this.medico = nome;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public void sethorario(String hora) {
        this.horario = hora;
    }

    public void setsintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setdiagnostico(String diag) {
        this.diagnostico = diag;
    }

    public String getmedico() {
        return medico;
    }

    public String getdata() {
        return data;
    }

    public String gethorario() {
        return horario;
    }

    public String getsintomas() {
        return sintomas;
    }

    public String getdiagnostico() {
        return diagnostico;
    }
    
    
    
    
     public void incluirconsulta(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO `consulta`( `paciente`, `medico`, `data`, `hora`, `diagnostico`, `sintomas`) VALUES (?, ?, ?, ?, 'Sem diagnostico ainda',?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            //Aqui, substitui a primeira interrogação pelo nome do cliente
            
            stm.setString(1, getnomepaciente());
            stm.setString(2, getmedico());
            stm.setString(3, getdata());
            stm.setString(4, gethorario());
            stm.setString(5, getsintomas());
            // 

            // o comando execute()
            stm.execute();
            JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não deu pra incluir " + JOptionPane.ERROR_MESSAGE);
            System.out.println(getnomepaciente() + getidadepaciente() + getcpfpaciente() + getrgpaciente());

        }

    }


}
