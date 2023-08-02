/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author maylo
 */
public class CadastrarNovoAluno extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarNovoAluno
     */
    public CadastrarNovoAluno() {
        initComponents();
    }

    public void LimparTela() {
        CampoMatricula.setText(null);
        CampoNome.setText(null);
        CampoData.setText(null);
        CampoEmail.setText(null);
        CampoTelefone.setText(null);
        CampoEndereço.setText(null);
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
        usuario3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JLabel();
        CampoMatricula = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        usuario6 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        usuario7 = new javax.swing.JLabel();
        CampoEndereço = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        CampoData = new javax.swing.JFormattedTextField();
        CampoTelefone = new javax.swing.JFormattedTextField();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        PainelCadastrar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Aluno");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome da Aluno:");

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

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Digite a Data de Nascimento:");

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite o Email do Aluno:");

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
        usuario5.setText("Digite o Numero de Matricula:");

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

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Telefone do Aluno:");

        usuario7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario7.setForeground(new java.awt.Color(0, 0, 0));
        usuario7.setText("Digite o Endereço do Aluno:");

        CampoEndereço.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoEndereço.setForeground(new java.awt.Color(204, 204, 204));
        CampoEndereço.setText("Ex : Rua Santa Madalena 181");
        CampoEndereço.setBorder(null);
        CampoEndereço.setName("email"); // NOI18N
        CampoEndereço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoEndereçoMousePressed(evt);
            }
        });
        CampoEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEndereçoActionPerformed(evt);
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

        CampoData.setBorder(null);
        CampoData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            CampoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout PainelCadastrarLayout = new javax.swing.GroupLayout(PainelCadastrar);
        PainelCadastrar.setLayout(PainelCadastrarLayout);
        PainelCadastrarLayout.setHorizontalGroup(
            PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PainelCadastrarLayout.setVerticalGroup(
            PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                        .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usuario5)
                                .addGap(3, 3, 3)
                                .addComponent(CampoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usuario2)
                                .addGap(3, 3, 3)
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(logoprincipal)))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(usuario3)
                        .addGap(3, 3, 3)
                        .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                                .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usuario4)
                                .addGap(3, 3, 3)
                                .addGroup(PainelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelCadastrarLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PainelCadastrarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(usuario6)
                        .addGap(3, 3, 3)
                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(usuario7)
                        .addGap(13, 13, 13)
                        .addComponent(CampoEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeMousePressed
        if (CampoNome.getText().equals("Ex: Igor Vitorio de Abreu Fernandes")) {
            CampoNome.setText("");
            CampoNome.setForeground(Color.black);
        }

    }//GEN-LAST:event_CampoNomeMousePressed

    private void CampoEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoEmailMousePressed
        if (CampoEmail.getText().equals("Ex: aluno@gmail.com")) {
            CampoEmail.setText("");
            CampoEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoEmailMousePressed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoMatriculaMousePressed
        if (CampoMatricula.getText().equals("Ex: 100029709")) {
            CampoMatricula.setText("");
            CampoMatricula.setForeground(Color.black);
        }

    }//GEN-LAST:event_CampoMatriculaMousePressed

    private void CampoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMatriculaActionPerformed

    private void CampoEndereçoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoEndereçoMousePressed
        if (CampoEndereço.getText().equals("Ex : Rua Santa Madalena 181")) {
            CampoEndereço.setText("");
            CampoEndereço.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoEndereçoMousePressed

    private void CampoEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEndereçoActionPerformed

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        String matricula = CampoMatricula.getText();
        String nome = CampoNome.getText();
        String dataNascimento = CampoData.getText();
        String email = CampoEmail.getText();
        String telefone = CampoTelefone.getText();
        String endereço = CampoEndereço.getText();

        try {
            AlunoController alunoController = new AlunoController();
            alunoController.save(matricula, nome, dataNascimento, email, telefone, endereço);
            JOptionPane.showMessageDialog(null, "Cadastrado");
            LimparTela();
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }

    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoEndereço;
    private javax.swing.JTextField CampoMatricula;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JPanel PainelCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario6;
    private javax.swing.JLabel usuario7;
    // End of variables declaration//GEN-END:variables
}
