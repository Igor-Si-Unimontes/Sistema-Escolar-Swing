/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.CursoController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maylo
 */
public class AlterarDadosCurso extends javax.swing.JPanel {

    /**
     * Creates new form AlterarDadosCurso
     */
    public AlterarDadosCurso(Curso curso) {
        initComponents();
         CampoId.setText("" + curso.getId());
        CampoNomeCurso.setText(curso.getNome());
        CampoPeriodo.setText("" + curso.getPeriodos());
        CampoCargaHoraria.setText(curso.getCarga_horaria());
    }

     public void LimparTela() {
        CampoId.setText(null);
        CampoNomeCurso.setText(null);
        CampoPeriodo.setText(null);
        CampoCargaHoraria.setText(null);
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelAlterarMateria = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        logoprincipal2 = new javax.swing.JLabel();
        usuario4 = new javax.swing.JLabel();
        CampoNomeCurso = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JLabel();
        CampoPeriodo = new javax.swing.JTextField();
        usuario6 = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        BotaoAlterar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotaoEntrartxt1 = new javax.swing.JLabel();
        usuario8 = new javax.swing.JLabel();
        CampoCargaHoraria = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        PainelAlterarMateria.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alterar Dados Curso");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        logoprincipal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite o Nome do Curso:");

        CampoNomeCurso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeCurso.setForeground(new java.awt.Color(0, 0, 0));
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

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite Quantos Periodos Tem:");

        CampoPeriodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoPeriodo.setForeground(new java.awt.Color(0, 0, 0));
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

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Numero do ID:");

        CampoId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoId.setForeground(new java.awt.Color(51, 51, 51));
        CampoId.setText("Ex: 10");
        CampoId.setBorder(null);
        CampoId.setEnabled(false);
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

        BotaoAlterar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("ALTERAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoAlterarLayout = new javax.swing.GroupLayout(BotaoAlterar);
        BotaoAlterar.setLayout(BotaoAlterarLayout);
        BotaoAlterarLayout.setHorizontalGroup(
            BotaoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoAlterarLayout.setVerticalGroup(
            BotaoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarLayout.createSequentialGroup()
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

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VOLTAR");

        javax.swing.GroupLayout BotaoVoltarLayout = new javax.swing.GroupLayout(BotaoVoltar);
        BotaoVoltar.setLayout(BotaoVoltarLayout);
        BotaoVoltarLayout.setHorizontalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        BotaoVoltarLayout.setVerticalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoEntrartxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt1.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt1.setText("CADASTRAR");
        BotaoEntrartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usuario8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario8.setForeground(new java.awt.Color(0, 0, 0));
        usuario8.setText("Digite a Carga horaria do curso:");

        CampoCargaHoraria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCargaHoraria.setForeground(new java.awt.Color(0, 0, 0));
        CampoCargaHoraria.setText("Ex: 3600 horas");
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

        javax.swing.GroupLayout PainelAlterarMateriaLayout = new javax.swing.GroupLayout(PainelAlterarMateria);
        PainelAlterarMateria.setLayout(PainelAlterarMateriaLayout);
        PainelAlterarMateriaLayout.setHorizontalGroup(
            PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(logoprincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(CampoNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(usuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelAlterarMateriaLayout.setVerticalGroup(
            PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(usuario6))
                    .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logoprincipal2)))
                .addGap(13, 13, 13)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario4)
                .addGap(3, 3, 3)
                .addComponent(CampoNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(usuario5)
                        .addGap(3, 3, 3)
                        .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario8))
                .addGap(3, 3, 3)
                .addGroup(PainelAlterarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarMateriaLayout.createSequentialGroup()
                        .addComponent(CampoCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlterarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlterarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void CampoPeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPeriodoMousePressed
        if (CampoPeriodo.getText().equals("Ex: 2")) {
            CampoPeriodo.setText("");
            CampoPeriodo.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoPeriodoMousePressed

    private void CampoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPeriodoActionPerformed

    private void CampoIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIdMousePressed
        if (CampoId.getText().equals("Ex: 10")) {
            CampoId.setText("");
            CampoId.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoIdMousePressed

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed

    }//GEN-LAST:event_CampoIdActionPerformed

    private void BotaoAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMouseClicked
        int id =Integer.parseInt(CampoId.getText()) ;
        String nomeCurso = CampoNomeCurso.getText();
        int periodos = Integer.parseInt(CampoPeriodo.getText());
        String carga_horaria = CampoCargaHoraria.getText();
        try {
            CursoController cursoController = new CursoController();
            cursoController.AlterarCurso(id, nomeCurso, periodos, carga_horaria);
            JOptionPane.showMessageDialog(null, "Dados Alterados", "SUCESSO !", 1);
            LimparTela();
        } catch (DAOexception ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAlterarMouseClicked

    private void BotaoAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMouseEntered
        BotaoAlterar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoAlterarMouseEntered

    private void BotaoAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMouseExited
        BotaoAlterar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoAlterarMouseExited

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelAlterarMateria.removeAll();
        PainelAlterarMateria.repaint();
        PainelAlterarMateria.revalidate();
        AlterarCurso alteracoes = new AlterarCurso();
        alteracoes.setSize(760, 471);
        PainelAlterarMateria.add(alteracoes);
        PainelAlterarMateria.repaint();
        PainelAlterarMateria.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited

    private void CampoCargaHorariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCargaHorariaMousePressed
        if (CampoCargaHoraria.getText().equals("Ex: 3600 horas")) {
            CampoCargaHoraria.setText("");
            CampoCargaHoraria.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoCargaHorariaMousePressed

    private void CampoCargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCargaHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCargaHorariaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoAlterar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JLabel BotaoEntrartxt1;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoCargaHoraria;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNomeCurso;
    private javax.swing.JTextField CampoPeriodo;
    private javax.swing.JPanel PainelAlterarMateria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logoprincipal2;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario6;
    private javax.swing.JLabel usuario8;
    // End of variables declaration//GEN-END:variables
}
