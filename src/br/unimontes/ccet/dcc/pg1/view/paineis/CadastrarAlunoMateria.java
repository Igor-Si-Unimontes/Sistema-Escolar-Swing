/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.AlunosMateriasController;
import br.unimontes.ccet.dcc.pg1.controller.MateriaController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CadastrarAlunoMateria extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarAlunoMateria
     */
    public CadastrarAlunoMateria() {
        initComponents();
    }

    public void LimparTela() {
        CampoMatricula.setText(null);
        Camponome.setText(null);
        CampoCarga.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastrarAM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoprincipal = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        CampoCarga = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JLabel();
        CampoMatricula = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usuario8 = new javax.swing.JLabel();
        Camponome = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        campoID = new javax.swing.JComboBox();
        usuario9 = new javax.swing.JLabel();

        PainelCadastrarAM.setBackground(new java.awt.Color(255, 255, 255));
        PainelCadastrarAM.setPreferredSize(new java.awt.Dimension(713, 473));
        PainelCadastrarAM.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Matricular Aluno na Materia");
        PainelCadastrarAM.add(jLabel1);
        jLabel1.setBounds(60, 50, 338, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelCadastrarAM.add(jSeparator1);
        jSeparator1.setBounds(60, 90, 337, 10);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        PainelCadastrarAM.add(logoprincipal);
        logoprincipal.setBounds(482, 30, 180, 70);

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite a Carga Horaria:");
        PainelCadastrarAM.add(usuario2);
        usuario2.setBounds(60, 310, 350, 17);

        CampoCarga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCarga.setForeground(new java.awt.Color(204, 204, 204));
        CampoCarga.setText("Ex: 360 horas");
        CampoCarga.setBorder(null);
        CampoCarga.setName("email"); // NOI18N
        CampoCarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCargaMousePressed(evt);
            }
        });
        CampoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCargaActionPerformed(evt);
            }
        });
        PainelCadastrarAM.add(CampoCarga);
        CampoCarga.setBounds(59, 339, 348, 30);
        PainelCadastrarAM.add(jSeparator5);
        jSeparator5.setBounds(60, 370, 347, 20);
        PainelCadastrarAM.add(jSeparator6);
        jSeparator6.setBounds(62, 271, 347, 0);

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Numero de Matricula do Aluno:");
        PainelCadastrarAM.add(usuario5);
        usuario5.setBounds(60, 120, 350, 17);

        CampoMatricula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoMatricula.setForeground(new java.awt.Color(204, 204, 204));
        CampoMatricula.setText("Ex: 100029709");
        CampoMatricula.setBorder(null);
        CampoMatricula.setName("email"); // NOI18N
        CampoMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoMatriculaMousePressed(evt);
            }
        });
        CampoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMatriculaActionPerformed(evt);
            }
        });
        CampoMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoMatriculaKeyReleased(evt);
            }
        });
        PainelCadastrarAM.add(CampoMatricula);
        CampoMatricula.setBounds(60, 137, 348, 30);
        PainelCadastrarAM.add(jSeparator8);
        jSeparator8.setBounds(60, 167, 347, 10);

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
        BotaoEntrartxt.setText("MATRICULAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarLayout = new javax.swing.GroupLayout(BotaoCadastrar);
        BotaoCadastrar.setLayout(BotaoCadastrarLayout);
        BotaoCadastrarLayout.setHorizontalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarLayout.setVerticalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PainelCadastrarAM.add(BotaoCadastrar);
        BotaoCadastrar.setBounds(72, 407, 180, 50);

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

        PainelCadastrarAM.add(BotaoVoltar);
        BotaoVoltar.setBounds(6, 10, 49, 25);

        usuario8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario8.setForeground(new java.awt.Color(0, 0, 0));
        usuario8.setText("Selecione a Materia:");
        PainelCadastrarAM.add(usuario8);
        usuario8.setBounds(60, 250, 350, 17);

        Camponome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Camponome.setForeground(new java.awt.Color(204, 204, 204));
        Camponome.setText("Ex: joao");
        Camponome.setBorder(null);
        Camponome.setEnabled(false);
        Camponome.setName("email"); // NOI18N
        Camponome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CamponomeFocusGained(evt);
            }
        });
        Camponome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CamponomeMousePressed(evt);
            }
        });
        Camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamponomeActionPerformed(evt);
            }
        });
        PainelCadastrarAM.add(Camponome);
        Camponome.setBounds(60, 200, 348, 30);
        PainelCadastrarAM.add(jSeparator12);
        jSeparator12.setBounds(60, 240, 347, 10);

        campoID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        campoID.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                campoIDAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        PainelCadastrarAM.add(campoID);
        campoID.setBounds(60, 270, 350, 30);

        usuario9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario9.setForeground(new java.awt.Color(0, 0, 0));
        usuario9.setText("Nome do Aluno:");
        PainelCadastrarAM.add(usuario9);
        usuario9.setBounds(60, 180, 350, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrarAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrarAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelCadastrarAM.removeAll();
        PainelCadastrarAM.repaint();
        PainelCadastrarAM.revalidate();
        AreaAlteraçõesSecretaria alteracoes = new AreaAlteraçõesSecretaria();
        alteracoes.setSize(760, 471);
        PainelCadastrarAM.add(alteracoes);
        PainelCadastrarAM.repaint();
        PainelCadastrarAM.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        String matricula = CampoMatricula.getText();
        String id = campoID.getSelectedItem().toString();
        String carga = CampoCarga.getText();

        try {
            AlunosMateriasController aMController = new AlunosMateriasController();
            aMController.save(matricula, id, carga);
            JOptionPane.showMessageDialog(null, "Matriculado");
            LimparTela();
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }
    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void CampoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMatriculaActionPerformed


    }//GEN-LAST:event_CampoMatriculaActionPerformed

    private void CampoMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoMatriculaMousePressed
        if (CampoMatricula.getText().equals("Ex: 100029709")) {
            CampoMatricula.setText("");
            CampoMatricula.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoMatriculaMousePressed

    private void CampoCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCargaActionPerformed

    private void CampoCargaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCargaMousePressed
        if (CampoCarga.getText().equals("Ex: 360 horas")) {
            CampoCarga.setText("");
            CampoCarga.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoCargaMousePressed

    private void CamponomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamponomeMousePressed
        if (Camponome.getText().equals("Ex: joao")) {
            Camponome.setText("");
            Camponome.setForeground(Color.black);
        }
    }//GEN-LAST:event_CamponomeMousePressed

    private void CamponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamponomeActionPerformed

    private void campoIDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_campoIDAncestorAdded
        MateriaController materiaConrtoller = new MateriaController();
        try {
            ArrayList<Materia> materia = materiaConrtoller.findAll();
            campoID.removeAll();
            for (Materia m : materia) {
                campoID.addItem(m);
            }

        } catch (DAOexception ex) {
            Logger.getLogger(CadastrarAlunoMateria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAlunoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoIDAncestorAdded

    private void CamponomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CamponomeFocusGained
        
        AlunoController alunoController = new AlunoController();
        try {
            if (CampoMatricula.getText().isBlank() == false || CampoMatricula.getText().isEmpty() == false || CampoMatricula.getText().compareTo("Ex: 100029709")!= 0 || CampoMatricula != null) {
              
                String alunoInfo = CampoMatricula.getText();
                Aluno aluno = new Aluno();
                aluno = alunoController.buscarAluno(alunoInfo);
                Camponome.setText(aluno.getNome());
            } else {
                JOptionPane.showMessageDialog(null, "Digite a Matricula do Aluno",null,JOptionPane.ERROR_MESSAGE);
                BotaoVoltar.requestFocusInWindow();
            }
           

        } catch (DAOexception ex) {
            Logger.getLogger(CadastrarAlunoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException e){
        JOptionPane.showMessageDialog(null, "Aluno nao encontrado",null,JOptionPane.ERROR_MESSAGE);
            BotaoVoltar.requestFocusInWindow();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAlunoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CamponomeFocusGained

    private void CampoMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoMatriculaKeyReleased
        if(CampoMatricula.getText().length()>=1){
            Camponome.setEnabled(true);
        }
    }//GEN-LAST:event_CampoMatriculaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoCarga;
    private javax.swing.JTextField CampoMatricula;
    private javax.swing.JTextField Camponome;
    private javax.swing.JPanel PainelCadastrarAM;
    private javax.swing.JComboBox campoID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario8;
    private javax.swing.JLabel usuario9;
    // End of variables declaration//GEN-END:variables
}
