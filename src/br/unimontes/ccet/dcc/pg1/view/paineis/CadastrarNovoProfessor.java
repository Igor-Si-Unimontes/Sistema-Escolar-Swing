/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.ProfessorController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maylo
 */
public class CadastrarNovoProfessor extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarNovoProfessor
     */
    public CadastrarNovoProfessor() {
        initComponents();
    }

    public void LimparTela() {
        CampoId.setText(null);
        CampoNome.setText(null);
        CampoEmail.setText(null);
        CampoTelefone.setText(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoprincipal = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        usuario5 = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        usuario6 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JFormattedTextField();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoEntrartxt1 = new javax.swing.JLabel();

        PainelCadastrar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Professor");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Professor:");

        CampoNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNome.setForeground(new java.awt.Color(204, 204, 204));
        CampoNome.setText("Ex: Igor Vitorio de Abreu Fernandes");
        CampoNome.setBorder(null);
        CampoNome.setName("email"); // NOI18N
        CampoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNomeMousePressed(evt);
            }
        });
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite o Email do Professor:");

        CampoEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoEmail.setForeground(new java.awt.Color(204, 204, 204));
        CampoEmail.setText("Ex: aluno@gmail.com");
        CampoEmail.setBorder(null);
        CampoEmail.setName("email"); // NOI18N
        CampoEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoEmailMousePressed(evt);
            }
        });
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Numero do ID:");

        CampoId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoId.setForeground(new java.awt.Color(204, 204, 204));
        CampoId.setText("Ex: 100029709");
        CampoId.setBorder(null);
        CampoId.setName("email"); // NOI18N
        CampoId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoIdMousePressed(evt);
            }
        });
        CampoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdActionPerformed(evt);
            }
        });

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Telefone do Professor:");

        BotaoCadastrar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("CADASTRAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarLayout = new javax.swing.GroupLayout(BotaoCadastrar);
        BotaoCadastrar.setLayout(BotaoCadastrarLayout);
        BotaoCadastrarLayout.setHorizontalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoCadastrarLayout.setVerticalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CampoTelefone.setBorder(null);
        CampoTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            CampoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BotaoVoltar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VOLTAR");

        javax.swing.GroupLayout BotaoVoltarLayout = new javax.swing.GroupLayout(BotaoVoltar);
        BotaoVoltar.setLayout(BotaoVoltarLayout);
        BotaoVoltarLayout.setHorizontalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        BotaoVoltarLayout.setVerticalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoEntrartxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt1.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt1.setText("CADASTRAR");
        BotaoEntrartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PainelCadastrarLayout = new javax.swing.GroupLayout(PainelCadastrar);
        PainelCadastrar.setLayout(PainelCadastrarLayout);
        PainelCadastrarLayout.setHorizontalGroup(
            PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelCadastrarLayout.setVerticalGroup(
            PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logoprincipal)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(usuario5)
                .addGap(13, 13, 13)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario2)
                .addGap(3, 3, 3)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario4)
                .addGap(3, 3, 3)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addComponent(usuario6)
                        .addGap(3, 3, 3)
                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelCadastrar.removeAll();
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
        AreaAlteraçõesSecretaria alteracoes = new AreaAlteraçõesSecretaria();
        alteracoes.setSize(760, 471);
        PainelCadastrar.add(alteracoes);
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        String id = CampoId.getText();
        String nome = CampoNome.getText();
        String email = CampoEmail.getText();
        String telefone = CampoTelefone.getText();

        try {
            ProfessorController professorController = new ProfessorController();
            professorController.save(id, nome, email, telefone);
            JOptionPane.showMessageDialog(null, "Cadastrado");
            LimparTela();
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }
    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed
        
    }//GEN-LAST:event_CampoIdActionPerformed

    private void CampoIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIdMousePressed
        if (CampoId.getText().equals("Ex: 100029709")) {
            CampoId.setText("");
            CampoId.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoIdMousePressed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoEmailMousePressed
        if (CampoEmail.getText().equals("Ex: aluno@gmail.com")) {
            CampoEmail.setText("");
            CampoEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoEmailMousePressed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeMousePressed
        if (CampoNome.getText().equals("Ex: Igor Vitorio de Abreu Fernandes")) {
            CampoNome.setText("");
            CampoNome.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoNomeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JLabel BotaoEntrartxt1;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JPanel PainelCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario6;
    // End of variables declaration//GEN-END:variables
}
