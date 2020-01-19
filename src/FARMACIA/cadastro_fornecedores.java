
package FARMACIA;

import BANCO.conexao;
import FARMACIA.principal_farmacia;
import MENU_CADASTRO.PACIENTE;
import funcionarios.FUNCIONARIOS;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class cadastro_fornecedores extends javax.swing.JFrame {


    public cadastro_fornecedores() {
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
            String sqlConsulta = "Select * from fornecedores order by idfornecedor";
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlConsulta);
            while (rs.next()) {
                String recebecodigo1 = rs.getString("idfornecedor");
                String recebenome1 = rs.getString("nome");
                String recebecidade1 = rs.getString("cidade");
                String recebeestado1 = rs.getString("estado");
                String recebeendereco1 = rs.getString("endereco");
                
                DefaultTableModel grid = (DefaultTableModel) tabela.getModel();
                grid.addRow(new String[]{recebecodigo1, recebenome1, recebecidade1, recebeestado1, recebeendereco1});
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        alterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Estado", "Endereço"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        alterar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/change.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Estado");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        enviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/plus.png"))); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Cidade");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Endereço");

        excluir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/delete.png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/laboratory (1).png"))); // NOI18N
        jLabel2.setText("Cadastro de fornecedores");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        consultar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/document.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cidade)
                                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(enviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviar)
                            .addComponent(alterar)
                            .addComponent(excluir)
                            .addComponent(consultar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1199, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        String recebe_nome = nome.getText();
        String recebe_cidade = cidade.getText();
        String recebe_estado = estado.getText();
        String recebe_endereco = endereco.getText();
  // System.out.println("passou o 0");
        Connection conn = null;
        // obtem conexao com o banco
        // try {
            conexao bd = new conexao();
            conn = bd.getConnection();
            //  conn.setAutoCommit(false);

            fornecedores cad = new fornecedores();
            cad.setnome(recebe_nome);
            cad.setcidade(recebe_cidade);
            cad.setestado(recebe_estado);
            cad.setendereco(recebe_endereco);
           // System.out.println("passou o 1");
            try {
                cad.incluir_fornecedor(conn);
                consulta();
                   //System.out.println("passou o 2");
            } catch (SQLException ex) {
                Logger.getLogger(cadastro_fornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }
             //  System.out.println("passou o 3");
            //conn.commit();
         
    }//GEN-LAST:event_enviarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
             Connection conn = null;
             // obtem conexao com o banco
             //   Cadastro cad;
             conexao bd = new conexao();
             conn = bd.getConnection();
             fornecedores cad = new fornecedores();
             String recebe_nome = nome.getText();
             String recebe_cidade = cidade.getText();
             String recebe_estado = estado.getText();
             String recebe_endereco = endereco.getText();
             cad.setnome(recebe_nome);
             cad.setcidade(recebe_cidade);
             cad.setestado(recebe_estado);
             cad.setendereco(recebe_endereco);
             int var_Lin = 0;
             var_Lin = tabela.getSelectedRow();
             String var_cod = tabela.getValueAt(var_Lin, 0).toString();
             int codid = Integer.parseInt(var_cod);
             System.out.println(codid);
             cad.alterar(conn, codid); // System.out.println("Alteração concluída com sucesso!");
        // consulta();
        consulta();
    }//GEN-LAST:event_alterarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        while (tabela.getModel().getRowCount() > 0) {
            ((DefaultTableModel) tabela.getModel()).removeRow(0);
        }
        try {
            Connection conn = null;
            conexao bd = new conexao();
            conn = bd.getConnection();
            
            Statement stmt = null;
            ResultSet rs = null;
            String sqlConsulta = "Select * from fornecedores order by idfornecedor";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlConsulta);
            while (rs.next()) {
                String recebe_idfornecedor = rs.getString("idfornecedor");
                String recebe_nome = rs.getString("nome");
                String recebe_cidade = rs.getString("cidade");
                 String recebe_estado = rs.getString("estado");
                 String recebe_endereco = rs.getString("endereco");
                
                
                  
               
                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) tabela.getModel();
                grid.addRow(new String[]{recebe_idfornecedor, recebe_nome,  recebe_cidade, recebe_estado, recebe_endereco});
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FUNCIONARIOS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_consultarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
       fornecedores cli = new fornecedores();
        
        JOptionPane.showConfirmDialog (null, "Você confirma a exclusão do registro?","Sistema",dialogButton);
        if (dialogButton == JOptionPane.YES_OPTION) {
            Connection conn = null;
           fornecedores farm = new fornecedores();
        
            conexao bd = new conexao();
            conn = bd.getConnection();
       
            int var_Lin = tabela.getSelectedRow();
            String var_cod = tabela.getValueAt(var_Lin, 0).toString();
            int codid = Integer.parseInt(var_cod);
            System.out.println(codid);
           farm.excluir(conn,codid);
           consulta();
         PreparedStatement stm = null;
         try {
         stm.execute();
         
         } catch (SQLException e) {
                              }  
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void tabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseEntered

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
     String var_cod;
        int var_Lin = 0;
        var_Lin = tabela.getSelectedRow(); //retorna um inteiro
        var_cod = tabela.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        int codid = Integer.parseInt(var_cod);

        String codigo_paciente = (tabela.getValueAt(var_Lin, 0).toString());
        nome.setText(tabela.getValueAt(var_Lin, 1).toString());
        cidade.setText(tabela.getValueAt(var_Lin, 2).toString());
        estado.setText(tabela.getValueAt(var_Lin, 3).toString());
       endereco.setText(tabela.getValueAt(var_Lin, 4).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      consulta();
    }//GEN-LAST:event_formWindowActivated


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cidade;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField estado;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
