package br.unimontes.ccet.dcc.pg1.view.paineis;

import java.awt.Color;

public class AreaAlteraçõesSecretaria extends javax.swing.JPanel {

    public AreaAlteraçõesSecretaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelSecretaria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msgbemvindo = new javax.swing.JLabel();
        BotaoAlterarProfessor = new javax.swing.JPanel();
        BotaoEntrartxt1 = new javax.swing.JLabel();
        logoprincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAluno = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtAluno1 = new javax.swing.JLabel();
        BotaoAlterarAluno = new javax.swing.JPanel();
        BotaoEntrartxt4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtAluno3 = new javax.swing.JLabel();
        BotaoAlterarCurso = new javax.swing.JPanel();
        BotaoEntrartxt6 = new javax.swing.JLabel();
        BotaoDesmatricular = new javax.swing.JPanel();
        BotaoEntrartxt7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtAluno4 = new javax.swing.JLabel();
        BotaoAlterarMateria1 = new javax.swing.JPanel();
        BotaoEntrartxt8 = new javax.swing.JLabel();
        BotaoCadastrarAlunoMateria = new javax.swing.JPanel();
        BotaoEntrartxt9 = new javax.swing.JLabel();

        PainelSecretaria.setBackground(new java.awt.Color(255, 255, 255));
        PainelSecretaria.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Secretaria SENAIgor");
        PainelSecretaria.add(jLabel1);
        jLabel1.setBounds(60, 20, 337, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelSecretaria.add(jSeparator1);
        jSeparator1.setBounds(70, 70, 337, 10);

        msgbemvindo.setBackground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        msgbemvindo.setForeground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgbemvindo.setText("O que deseja?");
        PainelSecretaria.add(msgbemvindo);
        msgbemvindo.setBounds(70, 90, 190, 29);

        BotaoAlterarProfessor.setBackground(new java.awt.Color(1, 181, 214));
        BotaoAlterarProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoAlterarProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarProfessorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlterarProfessorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarProfessorMouseExited(evt);
            }
        });

        BotaoEntrartxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt1.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt1.setText(" DADOS DOS PROFESSORES");
        BotaoEntrartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoAlterarProfessorLayout = new javax.swing.GroupLayout(BotaoAlterarProfessor);
        BotaoAlterarProfessor.setLayout(BotaoAlterarProfessorLayout);
        BotaoAlterarProfessorLayout.setHorizontalGroup(
            BotaoAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoAlterarProfessorLayout.setVerticalGroup(
            BotaoAlterarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoAlterarProfessor);
        BotaoAlterarProfessor.setBounds(430, 190, 240, 40);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        PainelSecretaria.add(logoprincipal);
        logoprincipal.setBounds(480, 30, 180, 70);

        jPanel2.setBackground(new java.awt.Color(13, 71, 161));

        txtAluno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo Projeto (8).png"))); // NOI18N
        txtAluno.setText("Professores");
        txtAluno.setIconTextGap(20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelSecretaria.add(jPanel2);
        jPanel2.setBounds(430, 130, 240, 50);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PainelSecretaria.add(jSeparator2);
        jSeparator2.setBounds(360, 130, 10, 330);

        jPanel3.setBackground(new java.awt.Color(13, 71, 161));

        txtAluno1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno1.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Escola.png"))); // NOI18N
        txtAluno1.setText("CURSOS");
        txtAluno1.setIconTextGap(20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelSecretaria.add(jPanel3);
        jPanel3.setBounds(430, 240, 240, 50);

        BotaoAlterarAluno.setBackground(new java.awt.Color(1, 181, 214));
        BotaoAlterarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoAlterarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarAlunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlterarAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarAlunoMouseExited(evt);
            }
        });

        BotaoEntrartxt4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt4.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt4.setText("DADOS DOS ALUNOS");
        BotaoEntrartxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoAlterarAlunoLayout = new javax.swing.GroupLayout(BotaoAlterarAluno);
        BotaoAlterarAluno.setLayout(BotaoAlterarAlunoLayout);
        BotaoAlterarAlunoLayout.setHorizontalGroup(
            BotaoAlterarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoAlterarAlunoLayout.setVerticalGroup(
            BotaoAlterarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoAlterarAluno);
        BotaoAlterarAluno.setBounds(60, 190, 240, 40);

        jPanel4.setBackground(new java.awt.Color(13, 71, 161));

        txtAluno3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno3.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAluno3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunos.png"))); // NOI18N
        txtAluno3.setText("Alunos");
        txtAluno3.setIconTextGap(20);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelSecretaria.add(jPanel4);
        jPanel4.setBounds(60, 130, 240, 50);

        BotaoAlterarCurso.setBackground(new java.awt.Color(1, 181, 214));
        BotaoAlterarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoAlterarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarCursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlterarCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarCursoMouseExited(evt);
            }
        });

        BotaoEntrartxt6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt6.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt6.setText("DADOS DOS CURSOS");
        BotaoEntrartxt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoAlterarCursoLayout = new javax.swing.GroupLayout(BotaoAlterarCurso);
        BotaoAlterarCurso.setLayout(BotaoAlterarCursoLayout);
        BotaoAlterarCursoLayout.setHorizontalGroup(
            BotaoAlterarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarCursoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoAlterarCursoLayout.setVerticalGroup(
            BotaoAlterarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarCursoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoAlterarCurso);
        BotaoAlterarCurso.setBounds(430, 300, 240, 40);

        BotaoDesmatricular.setBackground(new java.awt.Color(1, 181, 214));
        BotaoDesmatricular.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoDesmatricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDesmatricularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoDesmatricularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoDesmatricularMouseExited(evt);
            }
        });

        BotaoEntrartxt7.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        BotaoEntrartxt7.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt7.setText("DESMATRICULAR ALUNO DA MATÉRIA");
        BotaoEntrartxt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoDesmatricularLayout = new javax.swing.GroupLayout(BotaoDesmatricular);
        BotaoDesmatricular.setLayout(BotaoDesmatricularLayout);
        BotaoDesmatricularLayout.setHorizontalGroup(
            BotaoDesmatricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoDesmatricularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoDesmatricularLayout.setVerticalGroup(
            BotaoDesmatricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoDesmatricularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoDesmatricular);
        BotaoDesmatricular.setBounds(60, 400, 240, 40);

        jPanel6.setBackground(new java.awt.Color(13, 71, 161));

        txtAluno4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno4.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAluno4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Livro.png"))); // NOI18N
        txtAluno4.setText("MATÉRIAS");
        txtAluno4.setIconTextGap(20);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAluno4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelSecretaria.add(jPanel6);
        jPanel6.setBounds(60, 240, 240, 50);

        BotaoAlterarMateria1.setBackground(new java.awt.Color(1, 181, 214));
        BotaoAlterarMateria1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoAlterarMateria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarMateria1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlterarMateria1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarMateria1MouseExited(evt);
            }
        });

        BotaoEntrartxt8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt8.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt8.setText("DADOS DAS MATÉRIAS");
        BotaoEntrartxt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoAlterarMateria1Layout = new javax.swing.GroupLayout(BotaoAlterarMateria1);
        BotaoAlterarMateria1.setLayout(BotaoAlterarMateria1Layout);
        BotaoAlterarMateria1Layout.setHorizontalGroup(
            BotaoAlterarMateria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarMateria1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoAlterarMateria1Layout.setVerticalGroup(
            BotaoAlterarMateria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoAlterarMateria1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoAlterarMateria1);
        BotaoAlterarMateria1.setBounds(60, 300, 240, 40);

        BotaoCadastrarAlunoMateria.setBackground(new java.awt.Color(1, 181, 214));
        BotaoCadastrarAlunoMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoCadastrarAlunoMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAlunoMateriaMouseExited(evt);
            }
        });

        BotaoEntrartxt9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt9.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt9.setText("MATRICULAR ALUNO NA MATÉRIA");
        BotaoEntrartxt9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarAlunoMateriaLayout = new javax.swing.GroupLayout(BotaoCadastrarAlunoMateria);
        BotaoCadastrarAlunoMateria.setLayout(BotaoCadastrarAlunoMateriaLayout);
        BotaoCadastrarAlunoMateriaLayout.setHorizontalGroup(
            BotaoCadastrarAlunoMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoMateriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoCadastrarAlunoMateriaLayout.setVerticalGroup(
            BotaoCadastrarAlunoMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoMateriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSecretaria.add(BotaoCadastrarAlunoMateria);
        BotaoCadastrarAlunoMateria.setBounds(60, 350, 240, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAlterarProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarProfessorMouseEntered
        BotaoAlterarProfessor.setBackground(new Color(170, 208, 215));

    }//GEN-LAST:event_BotaoAlterarProfessorMouseEntered

    private void BotaoAlterarProfessorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarProfessorMouseExited
        BotaoAlterarProfessor.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoAlterarProfessorMouseExited

    private void BotaoAlterarAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAlunoMouseEntered
        BotaoAlterarAluno.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoAlterarAlunoMouseEntered

    private void BotaoAlterarAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAlunoMouseExited
        BotaoAlterarAluno.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoAlterarAlunoMouseExited

    private void BotaoAlterarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAlunoMouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        AlterarAluno alterar = new AlterarAluno();

        alterar.setSize(760, 471);
        PainelSecretaria.add(alterar);
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
    }//GEN-LAST:event_BotaoAlterarAlunoMouseClicked

    private void BotaoAlterarProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarProfessorMouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        AlterarProfessor alterar = new AlterarProfessor();
        alterar.setSize(760, 471);
        PainelSecretaria.add(alterar);
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
    }//GEN-LAST:event_BotaoAlterarProfessorMouseClicked

    private void BotaoAlterarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarCursoMouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        AlterarCurso alterar = new AlterarCurso();
        alterar.setSize(760, 471);
        PainelSecretaria.add(alterar);
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();    }//GEN-LAST:event_BotaoAlterarCursoMouseClicked

    private void BotaoAlterarCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarCursoMouseEntered
        BotaoAlterarCurso.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoAlterarCursoMouseEntered

    private void BotaoAlterarCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarCursoMouseExited
        BotaoAlterarCurso.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoAlterarCursoMouseExited

    private void BotaoDesmatricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDesmatricularMouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        ExcluirAlunosMaterias excluir = new ExcluirAlunosMaterias();
        excluir.setSize(760, 471);
        PainelSecretaria.add(excluir);
        PainelSecretaria.repaint();    }//GEN-LAST:event_BotaoDesmatricularMouseClicked

    private void BotaoDesmatricularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDesmatricularMouseEntered
        BotaoDesmatricular.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoDesmatricularMouseEntered

    private void BotaoDesmatricularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDesmatricularMouseExited
        BotaoDesmatricular.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoDesmatricularMouseExited

    private void BotaoAlterarMateria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMateria1MouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        AlterarMateria cadastrarr = new AlterarMateria();
        cadastrarr.setSize(760, 471);
        PainelSecretaria.add(cadastrarr);
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
    }//GEN-LAST:event_BotaoAlterarMateria1MouseClicked

    private void BotaoAlterarMateria1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMateria1MouseEntered
        BotaoAlterarMateria1.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoAlterarMateria1MouseEntered

    private void BotaoAlterarMateria1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarMateria1MouseExited
        BotaoAlterarMateria1.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoAlterarMateria1MouseExited

    private void BotaoCadastrarAlunoMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMateriaMouseClicked
        PainelSecretaria.removeAll();
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();
        CadastrarAlunoMateria cadastrarr = new CadastrarAlunoMateria();
        cadastrarr.setSize(760, 471);
        PainelSecretaria.add(cadastrarr);
        PainelSecretaria.repaint();
        PainelSecretaria.revalidate();    }//GEN-LAST:event_BotaoCadastrarAlunoMateriaMouseClicked

    private void BotaoCadastrarAlunoMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMateriaMouseEntered
        BotaoCadastrarAlunoMateria.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarAlunoMateriaMouseEntered

    private void BotaoCadastrarAlunoMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAlunoMateriaMouseExited
        BotaoCadastrarAlunoMateria.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarAlunoMateriaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoAlterarAluno;
    private javax.swing.JPanel BotaoAlterarCurso;
    private javax.swing.JPanel BotaoAlterarMateria1;
    private javax.swing.JPanel BotaoAlterarProfessor;
    private javax.swing.JPanel BotaoCadastrarAlunoMateria;
    private javax.swing.JPanel BotaoDesmatricular;
    private javax.swing.JLabel BotaoEntrartxt1;
    private javax.swing.JLabel BotaoEntrartxt4;
    private javax.swing.JLabel BotaoEntrartxt6;
    private javax.swing.JLabel BotaoEntrartxt7;
    private javax.swing.JLabel BotaoEntrartxt8;
    private javax.swing.JLabel BotaoEntrartxt9;
    private javax.swing.JPanel PainelSecretaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel msgbemvindo;
    private javax.swing.JLabel txtAluno;
    private javax.swing.JLabel txtAluno1;
    private javax.swing.JLabel txtAluno3;
    private javax.swing.JLabel txtAluno4;
    // End of variables declaration//GEN-END:variables
}
