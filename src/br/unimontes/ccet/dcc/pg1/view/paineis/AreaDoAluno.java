package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.AlunosMateriasController;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.DBSingleton;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AreaDoAluno extends javax.swing.JPanel {

    int xMouse, yMouse;
    private AlunoController loginAlunos;

    public AreaDoAluno() {
        initComponents();
        this.loginAlunos = new AlunoController();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLoginAluno = new javax.swing.JPanel();
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

        PainelLoginAluno.setBackground(new java.awt.Color(255, 255, 255));
        PainelLoginAluno.setForeground(new java.awt.Color(255, 255, 255));
        PainelLoginAluno.setPreferredSize(new java.awt.Dimension(754, 471));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(754, 471));
        bg.setPreferredSize(new java.awt.Dimension(754, 471));

        nomeEscola.setBackground(new java.awt.Color(255, 255, 255));
        nomeEscola.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        nomeEscola.setForeground(new java.awt.Color(0, 0, 0));
        nomeEscola.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeEscola.setText("E.E.SENAIGOR");

        logodireita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logodireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngwing.com (1).png"))); // NOI18N

        imagemfundo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imagemfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marcel-strauss-2GfU3qlLe2M-unsplash.png"))); // NOI18N
        imagemfundo.setMaximumSize(new java.awt.Dimension(33400, 50000));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ÁREA DO ALUNO");

        usuario1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(0, 0, 0));
        usuario1.setText("Usuário:");

        CampoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CampoUsuario.setText("Digite seu Email");
        CampoUsuario.setBorder(null);
        CampoUsuario.setName("email"); // NOI18N
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha:");

        CampoSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoSenha.setForeground(new java.awt.Color(204, 204, 204));
        CampoSenha.setText("********");
        CampoSenha.setBorder(null);
        CampoSenha.setName("senha"); // NOI18N
        CampoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoSenhaMousePressed(evt);
            }
        });

        BotaoEntrar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        BotaoEntrarLayout.setVerticalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(659, 659, 659))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(524, 524, 524))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(424, 424, 424))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(nomeEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logodireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110))
            .addComponent(imagemfundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(650, 650, 650))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(573, 573, 573))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(CampoSenha)
                .addGap(90, 90, 90))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(133, 133, 133))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(logoprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(350, 350, 350))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jSeparator4)
                .addGap(178, 178, 178))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(CampoUsuario)
                .addGap(190, 190, 190))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(277, 277, 277))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(nomeEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jSeparator1)
                .addGap(78, 78, 78))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logodireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(230, 230, 230))
            .addComponent(imagemfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(233, 233, 233))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(BotaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PainelLoginAlunoLayout = new javax.swing.GroupLayout(PainelLoginAluno);
        PainelLoginAluno.setLayout(PainelLoginAlunoLayout);
        PainelLoginAlunoLayout.setHorizontalGroup(
            PainelLoginAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginAlunoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelLoginAlunoLayout.setVerticalGroup(
            PainelLoginAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void BotaoEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseClicked

        
         String email = CampoUsuario.getText();
        String senha = CampoSenha.getText();
        try{
            AlunoController painelLoginAluno = new AlunoController();
            if(painelLoginAluno.verificaloginAluno(email, senha) == true){
              
                PainelLoginAluno.removeAll();
          PainelLoginAluno.repaint();
          PainelLoginAluno.revalidate();
          AlunoLogado alteracoes = new AlunoLogado(senha);
          alteracoes.setSize(760, 471);
          PainelLoginAluno.add(alteracoes);
          PainelLoginAluno.repaint();
          PainelLoginAluno.revalidate();
            }
           else{JOptionPane.showMessageDialog(null, "Email ou Senha errada","Erro",JOptionPane.ERROR_MESSAGE);}
         }catch(SQLException | DAOexception ex ){
            System.out.println("Erro criacao statement: " + ex);
                System.exit(0);
            }
    
 

    }//GEN-LAST:event_BotaoEntrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoEntrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel PainelLoginAluno;
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

    public JPasswordField getCampoSenha() {
        return CampoSenha;
    }

    public void setCampoSenha(JPasswordField CampoSenha) {
        this.CampoSenha = CampoSenha;
    }

    public JTextField getCampoUsuario() {
        return CampoUsuario;
    }

    public void setCampoUsuario(JTextField CampoUsuario) {
        this.CampoUsuario = CampoUsuario;
    }

}
