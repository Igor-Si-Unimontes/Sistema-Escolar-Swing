
package br.unimontes.ccet.dcc.pg1.view.paineis;

import java.awt.Color;

/**
 *
 * @author maylo
 */
public class ProfessorLogado extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorLogado
     */
    public ProfessorLogado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelProfessor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msgbemvindo = new javax.swing.JLabel();
        logoprincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtAluno1 = new javax.swing.JLabel();
        BotaoCadastrarAluno = new javax.swing.JPanel();
        BotaoEntrartxt3 = new javax.swing.JLabel();
        BotaoExcluirAluno = new javax.swing.JPanel();
        BotaoEntrartxt5 = new javax.swing.JLabel();

        PainelProfessor.setBackground(new java.awt.Color(255, 255, 255));
        PainelProfessor.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Professores SENAIgor");
        PainelProfessor.add(jLabel1);
        jLabel1.setBounds(58, 49, 364, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelProfessor.add(jSeparator1);
        jSeparator1.setBounds(58, 95, 337, 10);

        msgbemvindo.setBackground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        msgbemvindo.setForeground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgbemvindo.setText("O que deseja?");
        PainelProfessor.add(msgbemvindo);
        msgbemvindo.setBounds(58, 111, 180, 29);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        PainelProfessor.add(logoprincipal);
        logoprincipal.setBounds(480, 30, 180, 70);

        jPanel3.setBackground(new java.awt.Color(13, 71, 161));

        txtAluno1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno1.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunos.png"))); // NOI18N
        txtAluno1.setText("Alunos");
        txtAluno1.setIconTextGap(20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelProfessor.add(jPanel3);
        jPanel3.setBounds(60, 170, 286, 50);

        BotaoCadastrarAluno.setBackground(new java.awt.Color(1, 181, 214));
        BotaoCadastrarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMouseExited(evt);
            }
        });

        BotaoEntrartxt3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt3.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt3.setText("CADASTRAR ALUNO NA MATERIA");
        BotaoEntrartxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setLayout(BotaoCadastrarAlunoLayout);
        BotaoCadastrarAlunoLayout.setHorizontalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoCadastrarAlunoLayout.setVerticalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelProfessor.add(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setBounds(60, 260, 286, 40);

        BotaoExcluirAluno.setBackground(new java.awt.Color(1, 181, 214));
        BotaoExcluirAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoExcluirAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoExcluirAlunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoExcluirAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoExcluirAlunoMouseExited(evt);
            }
        });

        BotaoEntrartxt5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt5.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt5.setText(" EXCLUIR ALUNO DA MATERIA");
        BotaoEntrartxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoExcluirAlunoLayout = new javax.swing.GroupLayout(BotaoExcluirAluno);
        BotaoExcluirAluno.setLayout(BotaoExcluirAlunoLayout);
        BotaoExcluirAlunoLayout.setHorizontalGroup(
            BotaoExcluirAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoExcluirAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoExcluirAlunoLayout.setVerticalGroup(
            BotaoExcluirAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoExcluirAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelProfessor.add(BotaoExcluirAluno);
        BotaoExcluirAluno.setBounds(60, 320, 286, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMouseClicked
        PainelProfessor.removeAll();
        PainelProfessor.repaint();
        PainelProfessor.revalidate();
        CadastrarAlunoMateria cadastrarr = new CadastrarAlunoMateria();
        cadastrarr.setSize(760, 471);
        PainelProfessor.add(cadastrarr);
        PainelProfessor.repaint();
        PainelProfessor.revalidate();
    }//GEN-LAST:event_BotaoCadastrarAlunoMouseClicked

    private void BotaoCadastrarAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMouseEntered
        BotaoCadastrarAluno.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarAlunoMouseEntered

    private void BotaoCadastrarAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMouseExited
        BotaoCadastrarAluno.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarAlunoMouseExited

    private void BotaoExcluirAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoExcluirAlunoMouseClicked
        PainelProfessor.removeAll();
        PainelProfessor.repaint();
        PainelProfessor.revalidate();
        ExcluirAlunosMaterias excluir = new ExcluirAlunosMaterias();
        excluir.setSize(760, 471);
        PainelProfessor.add(excluir);
        PainelProfessor.repaint();
    }//GEN-LAST:event_BotaoExcluirAlunoMouseClicked

    private void BotaoExcluirAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoExcluirAlunoMouseEntered
        BotaoExcluirAluno.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoExcluirAlunoMouseEntered

    private void BotaoExcluirAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoExcluirAlunoMouseExited
        BotaoExcluirAluno.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoExcluirAlunoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrarAluno;
    private javax.swing.JLabel BotaoEntrartxt3;
    private javax.swing.JLabel BotaoEntrartxt5;
    private javax.swing.JPanel BotaoExcluirAluno;
    private javax.swing.JPanel PainelProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel msgbemvindo;
    private javax.swing.JLabel txtAluno1;
    // End of variables declaration//GEN-END:variables
}