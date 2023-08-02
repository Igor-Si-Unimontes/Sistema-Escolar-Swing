
package br.unimontes.ccet.dcc.pg1.view.paineis;

import java.awt.Color;


public class TelaLogin extends javax.swing.JFrame {

    int xMouse,yMouse;
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        header = new javax.swing.JPanel();
        BotaoFechar = new javax.swing.JPanel();
        txtFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeEscola.setBackground(new java.awt.Color(255, 255, 255));
        nomeEscola.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        nomeEscola.setForeground(new java.awt.Color(0, 0, 0));
        nomeEscola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeEscola.setText("E.E.SENAIGOR");
        bg.add(nomeEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 190, -1));

        logodireita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logodireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngwing.com (1).png"))); // NOI18N
        logodireita.setLabelFor(logodireita);
        bg.add(logodireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 190, -1));

        imagemfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marcel-strauss-2GfU3qlLe2M-unsplash.png"))); // NOI18N
        imagemfundo.setText("jLabel1");
        bg.add(imagemfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -10, 240, 510));

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        bg.add(logoprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INICIAR SESSÃO");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        usuario1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(0, 0, 0));
        usuario1.setText("Usuário:");
        bg.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        CampoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CampoUsuario.setText("Digite seu Usuário");
        CampoUsuario.setBorder(null);
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        bg.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 430, 30));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 282, 430, 10));

        senha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha:");
        bg.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        CampoSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoSenha.setForeground(new java.awt.Color(204, 204, 204));
        CampoSenha.setText("********");
        CampoSenha.setBorder(null);
        CampoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoSenhaMousePressed(evt);
            }
        });
        bg.add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 430, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 382, 430, 10));

        BotaoEntrar.setBackground(new java.awt.Color(1, 181, 214));
        BotaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
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
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        BotaoEntrarLayout.setVerticalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        BotaoFechar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoFecharMouseExited(evt);
            }
        });

        txtFechar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtFechar.setForeground(new java.awt.Color(0, 0, 0));
        txtFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechar.setText("X");

        javax.swing.GroupLayout BotaoFecharLayout = new javax.swing.GroupLayout(BotaoFechar);
        BotaoFechar.setLayout(BotaoFecharLayout);
        BotaoFecharLayout.setHorizontalGroup(
            BotaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoFecharLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoFecharLayout.setVerticalGroup(
            BotaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoFecharLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(762, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
     
    }//GEN-LAST:event_headerMouseDragged

    private void BotaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotaoFecharMouseClicked

    private void BotaoFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFecharMouseEntered
        BotaoFechar.setBackground(Color.red);
        txtFechar.setForeground(Color.white);
    }//GEN-LAST:event_BotaoFecharMouseEntered

    private void BotaoFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFecharMouseExited
        BotaoFechar.setBackground(Color.white);
        txtFechar.setForeground(Color.black);

    }//GEN-LAST:event_BotaoFecharMouseExited

    private void BotaoEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseEntered
        BotaoEntrar.setBackground(new Color(170,208,215));
        
        
    }//GEN-LAST:event_BotaoEntrarMouseEntered

    private void BotaoEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseExited
        BotaoEntrar.setBackground(new Color(1,181,214));

    }//GEN-LAST:event_BotaoEntrarMouseExited

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        if(CampoUsuario.getText().equals("Digite seu Usuário")){
        CampoUsuario.setText("");
        CampoUsuario.setForeground(Color.black);
        }
        if(String.valueOf(CampoSenha.getPassword()).isEmpty()){
            CampoSenha.setText("********");
            CampoSenha.setForeground(Color.gray);
        }
        
        
        
    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoSenhaMousePressed
        if(String.valueOf(CampoSenha.getPassword()).equals("********")){
            CampoSenha.setText("");
        CampoSenha.setForeground(Color.black);
        }
        if(CampoUsuario.getText().isEmpty()){
            CampoUsuario.setText("Digite seu Usuário");
            CampoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CampoSenhaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoEntrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoFechar;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imagemfundo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logodireita;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel nomeEscola;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel txtFechar;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
