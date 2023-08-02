package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.SecretariaController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.Color;
import br.unimontes.ccet.dcc.pg1.view.paineis.AreaDoAluno;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        NOMEMENU = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotaoCursos = new javax.swing.JPanel();
        txtCursos = new javax.swing.JLabel();
        BotaoAluno = new javax.swing.JPanel();
        txtAluno = new javax.swing.JLabel();
        BotaoProfessor = new javax.swing.JPanel();
        txtareaProfessor = new javax.swing.JLabel();
        BotaoMaterias = new javax.swing.JPanel();
        txtMaterias = new javax.swing.JLabel();
        Versão = new javax.swing.JLabel();
        BotaoSecretaria = new javax.swing.JPanel();
        txtAluno1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        nomeEscola = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        topo = new javax.swing.JPanel();
        msgbemvindo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        botaoFechar = new javax.swing.JPanel();
        txtFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 71, 161));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        NOMEMENU.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        NOMEMENU.setForeground(new java.awt.Color(255, 255, 255));
        NOMEMENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOMEMENU.setText("SENAIGOR");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        BotaoCursos.setBackground(new java.awt.Color(13, 71, 161));
        BotaoCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCursosMouseExited(evt);
            }
        });

        txtCursos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCursos.setForeground(new java.awt.Color(255, 255, 255));
        txtCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo Projeto (11).png"))); // NOI18N
        txtCursos.setText("Ver Cursos");
        txtCursos.setIconTextGap(20);

        javax.swing.GroupLayout BotaoCursosLayout = new javax.swing.GroupLayout(BotaoCursos);
        BotaoCursos.setLayout(BotaoCursosLayout);
        BotaoCursosLayout.setHorizontalGroup(
            BotaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoCursosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtCursos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoCursosLayout.setVerticalGroup(
            BotaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCursos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoAluno.setBackground(new java.awt.Color(13, 71, 161));
        BotaoAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlunoMouseExited(evt);
            }
        });

        txtAluno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunos.png"))); // NOI18N
        txtAluno.setText("Área do Aluno");
        txtAluno.setIconTextGap(20);

        javax.swing.GroupLayout BotaoAlunoLayout = new javax.swing.GroupLayout(BotaoAluno);
        BotaoAluno.setLayout(BotaoAlunoLayout);
        BotaoAlunoLayout.setHorizontalGroup(
            BotaoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlunoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        BotaoAlunoLayout.setVerticalGroup(
            BotaoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoProfessor.setBackground(new java.awt.Color(13, 71, 161));
        BotaoProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoProfessorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoProfessorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoProfessorMouseExited(evt);
            }
        });

        txtareaProfessor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtareaProfessor.setForeground(new java.awt.Color(255, 255, 255));
        txtareaProfessor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtareaProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo Projeto (8).png"))); // NOI18N
        txtareaProfessor.setText("Área do Professor");
        txtareaProfessor.setIconTextGap(20);

        javax.swing.GroupLayout BotaoProfessorLayout = new javax.swing.GroupLayout(BotaoProfessor);
        BotaoProfessor.setLayout(BotaoProfessorLayout);
        BotaoProfessorLayout.setHorizontalGroup(
            BotaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoProfessorLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtareaProfessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoProfessorLayout.setVerticalGroup(
            BotaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtareaProfessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoMaterias.setBackground(new java.awt.Color(13, 71, 161));
        BotaoMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMateriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoMateriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoMateriasMouseExited(evt);
            }
        });

        txtMaterias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMaterias.setForeground(new java.awt.Color(255, 255, 255));
        txtMaterias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo Projeto (10).png"))); // NOI18N
        txtMaterias.setText("Ver Matérias");
        txtMaterias.setIconTextGap(20);

        javax.swing.GroupLayout BotaoMateriasLayout = new javax.swing.GroupLayout(BotaoMaterias);
        BotaoMaterias.setLayout(BotaoMateriasLayout);
        BotaoMateriasLayout.setHorizontalGroup(
            BotaoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMateriasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtMaterias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoMateriasLayout.setVerticalGroup(
            BotaoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaterias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Versão.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Versão.setForeground(new java.awt.Color(255, 255, 255));
        Versão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Versão.setText("v 1.0");

        BotaoSecretaria.setBackground(new java.awt.Color(13, 71, 161));
        BotaoSecretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSecretariaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoSecretariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoSecretariaMouseExited(evt);
            }
        });

        txtAluno1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAluno1.setForeground(new java.awt.Color(255, 255, 255));
        txtAluno1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Escola.png"))); // NOI18N
        txtAluno1.setText("Área da Secretaria");
        txtAluno1.setIconTextGap(20);

        javax.swing.GroupLayout BotaoSecretariaLayout = new javax.swing.GroupLayout(BotaoSecretaria);
        BotaoSecretaria.setLayout(BotaoSecretariaLayout);
        BotaoSecretariaLayout.setHorizontalGroup(
            BotaoSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoSecretariaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtAluno1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoSecretariaLayout.setVerticalGroup(
            BotaoSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoSecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAluno1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(Versão, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(NOMEMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotaoProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(NOMEMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(BotaoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotaoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(Versão)
                .addContainerGap())
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(BotaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(774, Short.MAX_VALUE)))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(BotaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(707, Short.MAX_VALUE)))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        nomeEscola.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        nomeEscola.setForeground(new java.awt.Color(255, 255, 255));
        nomeEscola.setText("ESCOLA ESTADUAL SENAIGOR");

        slogan.setFont(new java.awt.Font("Roboto Light", 2, 18)); // NOI18N
        slogan.setForeground(new java.awt.Color(255, 255, 255));
        slogan.setText("\"A MELHOR ESCOLA DE PROGRAMAÇÃO\"");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        topo.setBackground(new java.awt.Color(255, 255, 255));

        msgbemvindo.setBackground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        msgbemvindo.setForeground(new java.awt.Color(0, 0, 0));
        msgbemvindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgbemvindo.setText("Seja Bem-Vindo !");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topoLayout = new javax.swing.GroupLayout(topo);
        topo.setLayout(topoLayout);
        topoLayout.setHorizontalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(msgbemvindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(topoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topoLayout.setVerticalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(msgbemvindo)
                .addGap(19, 19, 19))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(775, 478));
        content.setPreferredSize(new java.awt.Dimension(775, 478));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        botaoFechar.setBackground(new java.awt.Color(255, 255, 255));
        botaoFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoFecharMouseExited(evt);
            }
        });

        txtFechar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFechar.setForeground(new java.awt.Color(0, 0, 0));
        txtFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechar.setText("X");

        javax.swing.GroupLayout botaoFecharLayout = new javax.swing.GroupLayout(botaoFechar);
        botaoFechar.setLayout(botaoFecharLayout);
        botaoFecharLayout.setHorizontalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botaoFecharLayout.setVerticalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFechar))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCursosMouseEntered
        BotaoCursos.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event_BotaoCursosMouseEntered

    private void BotaoCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCursosMouseExited
        BotaoCursos.setBackground(new Color(13, 71, 161));
    }//GEN-LAST:event_BotaoCursosMouseExited

    private void BotaoAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlunoMouseEntered
        BotaoAluno.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event_BotaoAlunoMouseEntered

    private void BotaoAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlunoMouseExited
        BotaoAluno.setBackground(new Color(13, 71, 161));

    }//GEN-LAST:event_BotaoAlunoMouseExited

    private void BotaoProfessorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoProfessorMouseEntered
        BotaoProfessor.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event_BotaoProfessorMouseEntered

    private void BotaoProfessorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoProfessorMouseExited
        BotaoProfessor.setBackground(new Color(13, 71, 161));

    }//GEN-LAST:event_BotaoProfessorMouseExited

    private void BotaoMateriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriasMouseEntered
        BotaoMaterias.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event_BotaoMateriasMouseEntered

    private void BotaoMateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriasMouseExited
        BotaoMaterias.setBackground(new Color(13, 71, 161));

    }//GEN-LAST:event_BotaoMateriasMouseExited

    private void BotaoAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlunoMouseClicked

        AreaDoAluno aaluno = new AreaDoAluno();
        aaluno.setSize(760, 471);
        aaluno.setLocation(0, 0);
        content.removeAll();
        content.add(aaluno, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();


    }//GEN-LAST:event_BotaoAlunoMouseClicked

    private void BotaoProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoProfessorMouseClicked
        AreaDoProfessor aprofessor = new AreaDoProfessor();
        aprofessor.setSize(760, 471);
        aprofessor.setLocation(0, 0);
        content.removeAll();
        content.add(aprofessor, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BotaoProfessorMouseClicked

    private void BotaoMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriasMouseClicked
        AreaMateria materia = new AreaMateria();
        materia.setSize(760, 471);
        materia.setLocation(0, 0);
        content.removeAll();
        content.add(materia, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BotaoMateriasMouseClicked

    private void BotaoCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCursosMouseClicked
        AreaDoCurso curso = null;
        try {
            curso = new AreaDoCurso();
        } catch (DAOexception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        curso.setSize(760, 471);
        curso.setLocation(0, 0);
        content.removeAll();
        content.add(curso, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BotaoCursosMouseClicked

    private void BotaoSecretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSecretariaMouseClicked
        AreaDaSecretaria secretaria = new AreaDaSecretaria();

        secretaria.setSize(760, 471);
        secretaria.setLocation(0, 0);
        content.removeAll();
        content.add(secretaria, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BotaoSecretariaMouseClicked

    private void BotaoSecretariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSecretariaMouseEntered
        BotaoSecretaria.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event_BotaoSecretariaMouseEntered

    private void BotaoSecretariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSecretariaMouseExited
        BotaoSecretaria.setBackground(new Color(13, 71, 161));
    }//GEN-LAST:event_BotaoSecretariaMouseExited

    private void botaoFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseEntered
        botaoFechar.setBackground(Color.red);
        txtFechar.setForeground(Color.white);
    }//GEN-LAST:event_botaoFecharMouseEntered

    private void botaoFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseExited
        botaoFechar.setBackground(Color.white);
        txtFechar.setForeground(Color.black);    }//GEN-LAST:event_botaoFecharMouseExited

    private void botaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoFecharMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoAluno;
    private javax.swing.JPanel BotaoCursos;
    private javax.swing.JPanel BotaoMaterias;
    private javax.swing.JPanel BotaoProfessor;
    private javax.swing.JPanel BotaoSecretaria;
    private javax.swing.JLabel NOMEMENU;
    private javax.swing.JLabel Versão;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel msgbemvindo;
    private javax.swing.JLabel nomeEscola;
    private javax.swing.JLabel slogan;
    private javax.swing.JPanel topo;
    private javax.swing.JLabel txtAluno;
    private javax.swing.JLabel txtAluno1;
    private javax.swing.JLabel txtCursos;
    private javax.swing.JLabel txtFechar;
    private javax.swing.JLabel txtMaterias;
    private javax.swing.JLabel txtareaProfessor;
    // End of variables declaration//GEN-END:variables
}
