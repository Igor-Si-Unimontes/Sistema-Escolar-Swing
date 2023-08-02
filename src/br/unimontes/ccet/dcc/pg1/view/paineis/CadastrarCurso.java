/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.CursoController;
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
public class CadastrarCurso extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarCurso
     */
    public CadastrarCurso() {
        initComponents();
    }

    public void LimparTela() {
        CampoID.setText(null);
        CampoNomeCurso.setText(null);
        CampoPeriodo.setText(null);
        CampoCargaHoraria.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoprincipal = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        CampoNomeCurso = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        CampoCargaHoraria = new javax.swing.JTextField();
        usuario5 = new javax.swing.JLabel();
        CampoID = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        CampoPeriodo = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        PainelCadastrar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Curso");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Curso:");

        CampoNomeCurso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeCurso.setForeground(new java.awt.Color(204, 204, 204));
        CampoNomeCurso.setText("Ex: Medicina");
        CampoNomeCurso.setBorder(null);
        CampoNomeCurso.setName("email"); // NOI18N
        CampoNomeCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNomeCursoMousePressed(evt);
            }
        });
        CampoNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeCursoActionPerformed(evt);
            }
        });

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite a Carga Horaria do Curso:");

        CampoCargaHoraria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCargaHoraria.setForeground(new java.awt.Color(204, 204, 204));
        CampoCargaHoraria.setText("Ex: 3600 Horas");
        CampoCargaHoraria.setBorder(null);
        CampoCargaHoraria.setName("email"); // NOI18N
        CampoCargaHoraria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCargaHorariaMousePressed(evt);
            }
        });
        CampoCargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCargaHorariaActionPerformed(evt);
            }
        });

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Numero do ID:");

        CampoID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoID.setForeground(new java.awt.Color(204, 204, 204));
        CampoID.setText("Ex: 10");
        CampoID.setBorder(null);
        CampoID.setName("email"); // NOI18N
        CampoID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoIDMousePressed(evt);
            }
        });
        CampoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIDActionPerformed(evt);
            }
        });

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

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Digite o Numero Total de Periodos:");

        CampoPeriodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoPeriodo.setForeground(new java.awt.Color(204, 204, 204));
        CampoPeriodo.setText("Ex: 2");
        CampoPeriodo.setBorder(null);
        CampoPeriodo.setName("email"); // NOI18N
        CampoPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoPeriodoMousePressed(evt);
            }
        });
        CampoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastrarLayout = new javax.swing.GroupLayout(PainelCadastrar);
        PainelCadastrar.setLayout(PainelCadastrarLayout);
        PainelCadastrarLayout.setHorizontalGroup(
            PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 0, 0)
                .addComponent(usuario5)
                .addGap(3, 3, 3)
                .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario2)
                .addGap(3, 3, 3)
                .addComponent(CampoNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addComponent(usuario3)
                        .addGap(3, 3, 3)
                        .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(usuario4)
                .addGap(3, 3, 3)
                .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
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

    private void CampoNomeCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeCursoMousePressed
        if (CampoNomeCurso.getText().equals("Ex: Medicina")) {
            CampoNomeCurso.setText("");
            CampoNomeCurso.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoNomeCursoMousePressed

    private void CampoNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeCursoActionPerformed

    private void CampoCargaHorariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCargaHorariaMousePressed
        if (CampoCargaHoraria.getText().equals("Ex: 3600 Horas")) {
            CampoCargaHoraria.setText("");
            CampoCargaHoraria.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoCargaHorariaMousePressed

    private void CampoCargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCargaHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCargaHorariaActionPerformed

    private void CampoIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIDMousePressed
        if (CampoID.getText().equals("Ex: 10")) {
            CampoID.setText("");
            CampoID.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoIDMousePressed

    private void CampoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIDActionPerformed

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
       int id = Integer.parseInt(CampoID.getText());
        String nomeCurso = CampoNomeCurso.getText();
        int periodo = Integer.parseInt(CampoPeriodo.getText());
        String carga_horaria = CampoCargaHoraria.getText();

        try {
            CursoController cursoController = new CursoController();
            cursoController.CadastrarCurso(id, nomeCurso, periodo, carga_horaria);
            JOptionPane.showMessageDialog(null, "Cadastrado");
            LimparTela();
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: no botao cadastrar materia " + ex);
            System.exit(0);
        }
    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelCadastrar.removeAll();
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
        AlterarCurso alteracoes = new AlterarCurso();
        alteracoes.setSize(760, 471);
        PainelCadastrar.add(alteracoes);
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited

    private void CampoPeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPeriodoMousePressed
        if (CampoPeriodo.getText().equals("Ex: 2")) {
            CampoPeriodo.setText("");
            CampoPeriodo.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoPeriodoMousePressed

    private void CampoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPeriodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoCargaHoraria;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoNomeCurso;
    private javax.swing.JTextField CampoPeriodo;
    private javax.swing.JPanel PainelCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    // End of variables declaration//GEN-END:variables
}
