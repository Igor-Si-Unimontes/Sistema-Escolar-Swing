
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.ProfessorController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AlterarDadosProfessor extends javax.swing.JPanel {

    
    public AlterarDadosProfessor(Professor professor) {
        initComponents();
        CampoId.setText(professor.getId());
        CampoNome2.setText(professor.getNome());
        CampoEmail.setText(professor.getEmail());
        CampoTelefone.setText(professor.getTelefone());
    }

     public void LimparTela() {
        CampoId.setText(null);
        CampoNome2.setText(null);
        CampoEmail.setText(null);
        CampoTelefone.setText(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelAlterarProfessor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        logoprincipal2 = new javax.swing.JLabel();
        usuario4 = new javax.swing.JLabel();
        CampoNome2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        usuario6 = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        usuario7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        BotaoAlterar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JFormattedTextField();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotaoEntrartxt1 = new javax.swing.JLabel();

        PainelAlterarProfessor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alterar Dados Professor");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        logoprincipal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite o Nome do Professor:");

        CampoNome2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNome2.setForeground(new java.awt.Color(0, 0, 0));
        CampoNome2.setText("Ex: Igor Vitorio de Abreu Fernandes");
        CampoNome2.setBorder(null);
        CampoNome2.setName("email"); // NOI18N
        CampoNome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNome2MousePressed(evt);
            }
        });
        CampoNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNome2ActionPerformed(evt);
            }
        });

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Email do Professor:");

        CampoEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoEmail.setForeground(new java.awt.Color(0, 0, 0));
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

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Numero do ID:");

        CampoId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoId.setForeground(new java.awt.Color(51, 51, 51));
        CampoId.setText("Ex: 100029709");
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

        usuario7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario7.setForeground(new java.awt.Color(0, 0, 0));
        usuario7.setText("Digite o Telefone do Professor:");

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

        javax.swing.GroupLayout PainelAlterarProfessorLayout = new javax.swing.GroupLayout(PainelAlterarProfessor);
        PainelAlterarProfessor.setLayout(PainelAlterarProfessorLayout);
        PainelAlterarProfessorLayout.setHorizontalGroup(
            PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(logoprincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CampoNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelAlterarProfessorLayout.setVerticalGroup(
            PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logoprincipal2)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(usuario6)
                .addGap(13, 13, 13)
                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario4)
                .addGap(3, 3, 3)
                .addComponent(CampoNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usuario5)
                .addGap(3, 3, 3)
                .addGroup(PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarProfessorLayout.createSequentialGroup()
                        .addComponent(usuario7)
                        .addGap(3, 3, 3)
                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlterarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAlterarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNome2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNome2MousePressed
        if (CampoNome2.getText().equals("Ex: Igor Vitorio de Abreu Fernandes")) {
            CampoNome2.setText("");
            CampoNome2.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoNome2MousePressed

    private void CampoNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNome2ActionPerformed

    private void CampoEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoEmailMousePressed
        if (CampoEmail.getText().equals("Ex: aluno@gmail.com")) {
            CampoEmail.setText("");
            CampoEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoEmailMousePressed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIdMousePressed
        if (CampoId.getText().equals("Ex: 100029709")) {
            CampoId.setText("");
            CampoId.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoIdMousePressed

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed

    }//GEN-LAST:event_CampoIdActionPerformed

    private void BotaoAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMouseClicked
        String id = CampoId.getText();
        String nome = CampoNome2.getText();
        String email = CampoEmail.getText();
        String telefone = CampoTelefone.getText();

        try {
            ProfessorController professorController = new ProfessorController();
            professorController.save(id, nome, email, telefone);
            JOptionPane.showMessageDialog(null, "Dados Alterados");
            LimparTela();
        } catch (DAOexception  ex) {
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
        PainelAlterarProfessor.removeAll();
        PainelAlterarProfessor.repaint();
        PainelAlterarProfessor.revalidate();
        AlterarProfessor alteracoes = new AlterarProfessor();
        alteracoes.setSize(760, 471);
       PainelAlterarProfessor.add(alteracoes);
        PainelAlterarProfessor.repaint();
        PainelAlterarProfessor.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoAlterar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JLabel BotaoEntrartxt1;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNome2;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JPanel PainelAlterarProfessor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logoprincipal2;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario6;
    private javax.swing.JLabel usuario7;
    // End of variables declaration//GEN-END:variables
}
