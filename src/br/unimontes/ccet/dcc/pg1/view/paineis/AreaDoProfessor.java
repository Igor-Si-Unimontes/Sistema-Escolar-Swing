package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.ProfessorController;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.ProfessorDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;

public class AreaDoProfessor extends javax.swing.JPanel {

    int xMouse, yMouse;

    public AreaDoProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLoginProfessor = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        nomeEscola = new javax.swing.JLabel();
        logodireita = new javax.swing.JLabel();
        imagemfundo = new javax.swing.JLabel();
        logoprincipal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        senha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        BotaoEntrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(754, 471));
        setPreferredSize(new java.awt.Dimension(754, 471));

        PainelLoginProfessor.setBackground(new java.awt.Color(255, 255, 255));
        PainelLoginProfessor.setForeground(new java.awt.Color(255, 255, 255));
        PainelLoginProfessor.setMinimumSize(new java.awt.Dimension(775, 478));
        PainelLoginProfessor.setPreferredSize(new java.awt.Dimension(754, 471));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(754, 471));
        bg.setPreferredSize(new java.awt.Dimension(754, 471));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeEscola.setBackground(new java.awt.Color(255, 255, 255));
        nomeEscola.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        nomeEscola.setForeground(new java.awt.Color(0, 0, 0));
        nomeEscola.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeEscola.setText("E.E.SENAIGOR");
        bg.add(nomeEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 659, -1));

        logodireita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logodireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngwing.com (1).png"))); // NOI18N
        bg.add(logodireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 639, -1));

        imagemfundo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imagemfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marcel-strauss-2GfU3qlLe2M-unsplash.png"))); // NOI18N
        imagemfundo.setMaximumSize(new java.awt.Dimension(33400, 50000));
        bg.add(imagemfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 0, 500, 480));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        bg.add(logoprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 195, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ÁREA DO PROFESSOR");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 370, -1));

        usuario1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(0, 0, 0));
        usuario1.setText("Usuário:");
        bg.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 69, -1));

        CampoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CampoUsuario.setText("Digite seu Email");
        CampoUsuario.setBorder(null);
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        bg.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 348, 30));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 292, 347, 10));

        senha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha:");
        bg.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 60, -1));

        CampoSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoSenha.setForeground(new java.awt.Color(204, 204, 204));
        CampoSenha.setText("********");
        CampoSenha.setBorder(null);
        CampoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoSenhaMousePressed(evt);
            }
        });
        bg.add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 350, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 392, 349, 10));

        BotaoEntrar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("ENTRAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoEntrarLayout = new javax.swing.GroupLayout(BotaoEntrar);
        BotaoEntrar.setLayout(BotaoEntrarLayout);
        BotaoEntrarLayout.setHorizontalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotaoEntrarLayout.setVerticalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 120, 38));

        javax.swing.GroupLayout PainelLoginProfessorLayout = new javax.swing.GroupLayout(PainelLoginProfessor);
        PainelLoginProfessor.setLayout(PainelLoginProfessorLayout);
        PainelLoginProfessorLayout.setHorizontalGroup(
            PainelLoginProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        PainelLoginProfessorLayout.setVerticalGroup(
            PainelLoginProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginProfessorLayout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        if (CampoUsuario.getText().equals("Digite seu Email")) {
            CampoUsuario.setText("");
            CampoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(CampoSenha.getPassword()).isEmpty()) {
            CampoSenha.setText("********");
            CampoSenha.setForeground(Color.gray);
        }

    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoSenhaMousePressed
        if (String.valueOf(CampoSenha.getPassword()).equals("********")) {
            CampoSenha.setText("");
            CampoSenha.setForeground(Color.black);
        }
        if (CampoUsuario.getText().isEmpty()) {
            CampoUsuario.setText("Digite seu Email");
            CampoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CampoSenhaMousePressed

    private void BotaoEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseEntered
        BotaoEntrar.setBackground(new Color(170, 208, 215));

    }//GEN-LAST:event_BotaoEntrarMouseEntered

    private void BotaoEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseExited
        BotaoEntrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoEntrarMouseExited

    private void BotaoEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseClicked

        String email = CampoUsuario.getText();
        String senha = CampoSenha.getText();

        try {
            ProfessorController professorController = new ProfessorController();
            if (professorController.verificaLoginProfessor(email, senha) == true) {
                PainelLoginProfessor.removeAll();
          PainelLoginProfessor.repaint();
          PainelLoginProfessor.revalidate();
          ProfessorLogado alteracoes = new ProfessorLogado(); 
          alteracoes.setSize(760, 471);
          PainelLoginProfessor.add(alteracoes);
          PainelLoginProfessor.repaint();
          PainelLoginProfessor.revalidate();
            } else {
                JOptionPane.showMessageDialog(null, "Email ou Senha errada","Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | DAOexception ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }

    }//GEN-LAST:event_BotaoEntrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoEntrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel PainelLoginProfessor;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel imagemfundo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logodireita;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel nomeEscola;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
