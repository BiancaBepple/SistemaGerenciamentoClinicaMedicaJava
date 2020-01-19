/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CADASTRO;

import BANCO.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20171inf0171
 */
public class MEDICO extends javax.swing.JFrame {

    /**
     * Creates new form MEDICO
     */
    public MEDICO() {
        initComponents();
    }

    public void consulta() {
        while (tabela.getModel().getRowCount() > 0) {
            ((DefaultTableModel) tabela.getModel()).removeRow(0);
        }
        try {
            Connection conn = null;
            conexao bd = new conexao();
            conn = bd.getConnection();

            Statement stmt = null;
            ResultSet rs = null;
            String sqlConsulta = "Select * from medicos order by idmedico";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlConsulta);
            while (rs.next()) {
                String recebe_id = rs.getString("idmedico");
                String recebe_nome = rs.getString("nome");
                String recebe_especialidade = rs.getString("especialidade");
                String recebe_turno = rs.getString("turno");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) tabela.getModel();
                grid.addRow(new String[]{recebe_id, recebe_nome, recebe_especialidade, recebe_turno});

            }
        } catch (SQLException ex) {
            Logger.getLogger(MEDICO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        turno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        especialidade = new javax.swing.JComboBox<>();
        enviar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        pesquisamedico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/doctor (1).png"))); // NOI18N
        jLabel1.setText("CADASTRO DE MÉDICOS");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Especialidade", "Turno"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setText("Turno");

        jLabel2.setText("Nome");

        turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));

        jLabel3.setText("Especialidade");

        especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ginecologista", "Cirurgião", "Cardiologista", "Endocrinologista", "Pediatra", "Pneumologista", "Psicólogo", " " }));

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/plus.png"))); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/document.png"))); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/change.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/delete.png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enviar)
                        .addGap(18, 18, 18)
                        .addComponent(Consultar)
                        .addGap(18, 18, 18)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar)
                    .addComponent(Consultar)
                    .addComponent(alterar)
                    .addComponent(excluir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/search.png"))); // NOI18N
        jButton1.setText("Pesquisar por nome");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(pesquisamedico, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1031, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        String recebe_nome = nome.getText();
        String recebe_especialidade = (String) (especialidade.getSelectedItem());
        String recebe_turno = (String) (turno.getSelectedItem());
        Connection conn = null;
        // obtem conexao com o banco
        // try {
        conexao bd = new conexao();
        conn = bd.getConnection();
        System.err.println("passou 3");
        principal_medico cad = new principal_medico();
        cad.setnome(recebe_nome);
        cad.setespecialidade(recebe_especialidade);
        cad.setturno(recebe_turno);
        try {
            cad.incluir(conn);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(MEDICO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        consulta();
    }//GEN-LAST:event_ConsultarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        Connection conn = null;
        try {
            conexao bd = new conexao();
            conn = bd.getConnection(); // Altera dados do Aluno
            principal_medico cad = new principal_medico();

            String recebe_nome = nome.getText();
            String recebe_especialidade = (String) (especialidade.getSelectedItem());
            String recebe_turno = (String) (turno.getSelectedItem());

            cad.setnome(recebe_nome);
            cad.setespecialidade(recebe_especialidade);
            cad.setturno(recebe_turno);

            String var_cod;
            int var_Lin = 0;
            var_Lin = tabela.getSelectedRow(); //retorna um inteiro
            var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
            int codid = Integer.parseInt(var_cod);

            cad.alterar(conn, codid);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(MEDICO.class.getName()).log(Level.SEVERE, null, ex);
        }

        // efetiva Alteração
// conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        // TODO add your handling code here:
    }//GEN-LAST:event_alterarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        String var_cod;

        int var_Lin = 0;
        var_Lin = tabela.getSelectedRow(); //retorna um inteiro
        var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        int codid = Integer.parseInt(var_cod);

        nome.setText(tabela.getValueAt(var_Lin, 1).toString());
        especialidade.setSelectedItem(tabela.getValueAt(var_Lin, 2).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        Connection conn = null;

        principal_medico cad = new principal_medico();
        conexao bd = new conexao();
        conn = bd.getConnection();
        int var_Lin = tabela.getSelectedRow();
        String var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        int codid = Integer.parseInt(var_cod);
        try {
            cad.excluir(conn, codid);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(MEDICO.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
        //consultapaciente();
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try {
            //CONSULTAR medicos CADASTRADOS
            DefaultTableModel grid0 = (DefaultTableModel) tabela.getModel();
            grid0.setNumRows(0);
            Connection conn = null;
            conexao bd = new conexao();
            conn = bd.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String sqlConsulta = "select idmedico, nome, especialidade, turno from medicos where nome like '%" + pesquisamedico.getText()+"%' order by idmedico" ;
            stmt = conn.createStatement();
            PreparedStatement stm = null;
            rs = stmt.executeQuery(sqlConsulta);
            while (rs.next()) {
                String recebe_cod = Integer.toString(rs.getInt("idmedico"));
                String recebe_nome = rs.getString("nome");
                String recebe_especialidade = (rs.getString("especialidade"));
                String recebe_turno = rs.getString("turno");
                // int recebe_rg = rs.getInt("rg");
                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) tabela.getModel();
                grid.addRow(new String[]{recebe_cod, recebe_nome, recebe_especialidade,  recebe_turno});

            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(PACIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEDICO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton alterar;
    private javax.swing.JButton enviar;
    private javax.swing.JComboBox<String> especialidade;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisamedico;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> turno;
    // End of variables declaration//GEN-END:variables
}