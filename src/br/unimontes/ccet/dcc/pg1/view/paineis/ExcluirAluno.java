package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.AlunosMateriasController;
import br.unimontes.ccet.dcc.pg1.controller.CursoController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExcluirAluno extends javax.swing.JPanel {

    public ExcluirAluno() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        TabelaAluno.getTableHeader().setOpaque(false);
        TabelaAluno.getTableHeader().setBackground(new Color(1, 181, 214));
        TabelaAluno.getTableHeader().setForeground(new Color(0, 0, 0));
        TabelaAluno.setRowHeight(25);
        try {
            DefaultTableModel tableModel = (DefaultTableModel) TabelaAluno.getModel();
            tableModel.setRowCount(0);
            AlunoController alunoController = new AlunoController();
            ArrayList<Aluno> alunos = alunoController.findAll();

            alunos.forEach((Aluno aluno) -> {

                tableModel.addRow(new Object[]{aluno.getMatricula(), aluno.getNome(), aluno.getDataNascimento(), aluno.getEmail(), aluno.getTelefone(), aluno.getEndereço()});
            });
            TabelaAluno.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelExcluir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoprincipal = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        TabelaAluno = new javax.swing.JTable();

        PainelExcluir.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Remover Aluno");

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N

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
        BotaoEntrartxt.setText("Remover");
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

        TabelaAluno.setBackground(new java.awt.Color(255, 255, 255));
        TabelaAluno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TabelaAluno.setForeground(new java.awt.Color(0, 0, 0));
        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Nascimento", "Email", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAluno.setFocusable(false);
        TabelaAluno.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaAluno.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TabelaAluno.setSelectionBackground(new java.awt.Color(1, 181, 214));
        TabelaAluno.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TabelaAluno.setShowVerticalLines(false);
        TabelaAluno.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaAluno);

        javax.swing.GroupLayout PainelExcluirLayout = new javax.swing.GroupLayout(PainelExcluir);
        PainelExcluir.setLayout(PainelExcluirLayout);
        PainelExcluirLayout.setHorizontalGroup(
            PainelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExcluirLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelExcluirLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PainelExcluirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PainelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelExcluirLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PainelExcluirLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelExcluirLayout.setVerticalGroup(
            PainelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExcluirLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(PainelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelExcluirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoprincipal))
                .addGap(21, 21, 21)
                .addGroup(PainelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelExcluirLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
       

        int row = TabelaAluno.getSelectedRow();

        try {
            DefaultTableModel tableModel = (DefaultTableModel) TabelaAluno.getModel();
            AlunoController alunoController = new AlunoController();
            String matricula = "" + tableModel.getValueAt(row, 0);
            alunoController.delete(matricula);
            AlunosMateriasController.deleteFrommatricula(matricula);

            JOptionPane.showMessageDialog(null, "Aluno Removido");
            tableModel.removeRow(row);
        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        } catch (DAOexception ex) {
            System.out.println("ERROR: " + ex);
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }

    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelExcluir.removeAll();
        PainelExcluir.repaint();
        PainelExcluir.revalidate();
        AreaAlteraçõesSecretaria alteracoes = new AreaAlteraçõesSecretaria();
        alteracoes.setSize(760, 471);
        PainelExcluir.add(alteracoes);
        PainelExcluir.repaint();
        PainelExcluir.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoVoltarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JPanel PainelExcluir;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logoprincipal;
    // End of variables declaration//GEN-END:variables
}
