/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

import BANCO.conexao;
import FARMACIA.cadastro_medicamentos;
import FARMACIA.principal_farmacia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20171inf0228
 */
public class FUNCIONARIOS extends javax.swing.JFrame {

    /**
     * Creates new form FUNCIONARIOS
     */
    public FUNCIONARIOS() {
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
            String sqlConsulta = "Select * from funcionarios order by idfuncionarios";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlConsulta);
            while (rs.next()) {
                String recebe_id = rs.getString("idfuncionarios");
                String recebe_nome = rs.getString("nome");
                String recebe_idade = rs.getString("idade");
                String recebe_rg = rs.getString("rg");
                String recebe_login = rs.getString("login");
                String recebe_senha = rs.getString("senha");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) tabela.getModel();
                grid.addRow(new String[]{recebe_id, recebe_nome, recebe_idade, recebe_rg, recebe_login, recebe_senha});

            }
        } catch (SQLException ex) {
            Logger.getLogger(FUNCIONARIOS.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        rg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Idade", "RG", "Login"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setText("Nome");

        jLabel2.setText("Idade");

        jLabel4.setText("RG");

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/document.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/delete.png"))); // NOI18N
        remover.setText("Excluir");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/change.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/plus.png"))); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Login");

        jLabel6.setText("Senha");

        senha.setSelectionColor(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rg)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(enviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alterar)
                                .addGap(10, 10, 10)
                                .addComponent(remover))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar)
                    .addComponent(alterar)
                    .addComponent(remover)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/employee.png"))); // NOI18N
        jLabel3.setText("Cadastro de Funcionários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(951, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        try {
        String recebe_nome = nome.getText();
        String recebe_idade = idade.getText();
        String recebe_rg = rg.getText();
        String recebe_login = login.getText();
        String recebe_senha = senha.getText();
        // System.err.println("passou 3");
        principal_funcionarios cad = new principal_funcionarios();
        cad.setnome(recebe_nome);
        cad.setidade(recebe_idade);
        cad.setrg(recebe_rg);
        cad.setlogin(recebe_login);
        cad.setsenha(recebe_senha);
        Connection conn = null;
        // obtem conexao com o banco
        // try {
        conexao bd = new conexao();
        conn = bd.getConnection();
        //  conn.setAutoCommit(false);
        
            cad.incluir(conn);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(FUNCIONARIOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        //conn.commit();


    }//GEN-LAST:event_enviarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        consulta();
    }//GEN-LAST:event_consultarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        String var_cod;

        int var_Lin = 0;
        var_Lin = tabela.getSelectedRow(); //retorna um inteiro
        var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        int codid = Integer.parseInt(var_cod);

        nome.setText(tabela.getValueAt(var_Lin, 1).toString());
        idade.setText(tabela.getValueAt(var_Lin, 2).toString());
        rg.setText(tabela.getValueAt(var_Lin, 3).toString());
        login.setText(tabela.getValueAt(var_Lin, 4).toString());
        senha.setText(tabela.getValueAt(var_Lin, 5).toString());

    }//GEN-LAST:event_tabelaMouseClicked

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        Connection conn = null;

        principal_funcionarios cad = new principal_funcionarios();
        conexao bd = new conexao();
        conn = bd.getConnection();
        int var_Lin = tabela.getSelectedRow();
        String var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        int codid = Integer.parseInt(var_cod);

        try {
            cad.excluir(conn, codid);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(FUNCIONARIOS.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
        //consultapaciente();

        // TODO add your handling code here:
    }//GEN-LAST:event_removerActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        Connection conn = null;

        conexao bd = new conexao();
        conn = bd.getConnection(); // Altera dados do Aluno
        principal_funcionarios cad = new principal_funcionarios();
        try {
            String recebe_nome = nome.getText();
            String recebe_idade = idade.getText();
            String recebe_rg = rg.getText();
            String recebe_login = login.getText();
            //  String recebe_senha = senha.getText();

            cad.setnome(recebe_nome);
            cad.setidade(recebe_idade);
            cad.setrg(recebe_rg);
            cad.setlogin(recebe_login);
// cad.setsenha(recebe_senha);

            String var_cod;
            int var_Lin = 0;
            var_Lin = tabela.getSelectedRow(); //retorna um inteiro
            var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
            int codid = Integer.parseInt(var_cod);

            cad.alterar(conn, codid);
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(FUNCIONARIOS.class.getName()).log(Level.SEVERE, null, ex);
        }

        // efetiva Alteração
// conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

// TODO add your handling code here:
    }//GEN-LAST:event_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(FUNCIONARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUNCIONARIOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome;
    private javax.swing.JButton remover;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
