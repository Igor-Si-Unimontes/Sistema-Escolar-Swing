package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.MateriaController;
import br.unimontes.ccet.dcc.pg1.controller.ProfessorController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlterarMateria extends javax.swing.JPanel {

    public AlterarMateria() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        TabelaMaterias.getTableHeader().setOpaque(false);
        TabelaMaterias.getTableHeader().setBackground(new Color(1, 181, 214));
        TabelaMaterias.getTableHeader().setForeground(new Color(0, 0, 0));
        TabelaMaterias.setRowHeight(40);
        try {
            DefaultTableModel tableModel = (DefaultTableModel) TabelaMaterias.getModel();
            tableModel.setRowCount(0);
            MateriaController materiaController = new MateriaController();
            ArrayList<Materia> materias = materiaController.findAll();
            materias.forEach((Materia materia) -> {
                tableModel.addRow(new Object[]{materia.getId(), materia.getNome(), materia.getPeriodo(), materia.getProfessor(), materia.getCurso()});
            });

            TabelaMaterias.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                PainelExcluir.removeAll();
                PainelExcluir.repaint();
                PainelExcluir.revalidate();
                Materia m = new Materia();
                m.setId((String) TabelaMaterias.getValueAt(TabelaMaterias.getSelectedRow(), 0));
                m.setNome((String) TabelaMaterias.getValueAt(TabelaMaterias.getSelectedRow(), 1));
                m.setPeriodo((int) TabelaMaterias.getValueAt(TabelaMaterias.getSelectedRow(), 2));
                m.setProfessor((String) TabelaMaterias.getValueAt(TabelaMaterias.getSelectedRow(), 3));
                m.setCurso((String) TabelaMaterias.getValueAt(TabelaMaterias.getSelectedRow(), 4));
                
                AlterarDadosMateria alterar = new AlterarDadosMateria(m);
                alterar.setSize(760, 471);
                PainelExcluir.add(alterar);
                PainelExcluir.repaint();
                PainelExcluir.revalidate();
            }
            @Override
            public void onDelete(int row) {
                int resultado = JOptionPane.showConfirmDialog(null, "Deseja excluir a Matéria ?", "Excluir Matéria", 0);
                if (resultado == JOptionPane.YES_OPTION) {
                    row = TabelaMaterias.getSelectedRow();

                    try {
                        DefaultTableModel tableModel = (DefaultTableModel) TabelaMaterias.getModel();
                        MateriaController materiaController =  new MateriaController();
                        String id = "" + tableModel.getValueAt(row, 0);
                        materiaController.delete(id);
                        JOptionPane.showMessageDialog(null, "Matéria Removida");
                        tableModel.removeRow(row);
                    } catch (NumberFormatException ex) {
                        System.out.println("ERROR: " + ex);
                    } catch (DAOexception ex) {
                        System.out.println("ERROR: " + ex);
                    } catch (SQLException ex) {
                        System.out.println("ERROR: " + ex);
                    }
                }
            }

            @Override
            public void onView(int row) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        TabelaMaterias.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        TabelaMaterias.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelExcluir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoprincipal = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        TabelaMaterias = new javax.swing.JTable();
        addProfessor = new javax.swing.JLabel();

        PainelExcluir.setBackground(new java.awt.Color(255, 255, 255));
        PainelExcluir.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dados das Matérias");
        PainelExcluir.add(jLabel1);
        jLabel1.setBounds(60, 50, 385, 40);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGONOVA.png"))); // NOI18N
        PainelExcluir.add(logoprincipal);
        logoprincipal.setBounds(530, 40, 180, 70);
        PainelExcluir.add(jSeparator6);
        jSeparator6.setBounds(60, 310, 347, 0);

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

        PainelExcluir.add(BotaoVoltar);
        BotaoVoltar.setBounds(6, 10, 49, 25);

        TabelaMaterias.setBackground(new java.awt.Color(255, 255, 255));
        TabelaMaterias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TabelaMaterias.setForeground(new java.awt.Color(0, 0, 0));
        TabelaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Periodo", "Professor", "Curso", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaMaterias.setFocusable(false);
        TabelaMaterias.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaMaterias.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TabelaMaterias.setRowHeight(40);
        TabelaMaterias.setSelectionBackground(new java.awt.Color(1, 181, 214));
        TabelaMaterias.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TabelaMaterias.setShowVerticalLines(false);
        TabelaMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaMaterias);
        if (TabelaMaterias.getColumnModel().getColumnCount() > 0) {
            TabelaMaterias.getColumnModel().getColumn(0).setPreferredWidth(25);
            TabelaMaterias.getColumnModel().getColumn(0).setMaxWidth(25);
            TabelaMaterias.getColumnModel().getColumn(2).setPreferredWidth(55);
            TabelaMaterias.getColumnModel().getColumn(2).setMaxWidth(55);
            TabelaMaterias.getColumnModel().getColumn(5).setPreferredWidth(90);
            TabelaMaterias.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        PainelExcluir.add(jScrollPane1);
        jScrollPane1.setBounds(6, 131, 720, 270);

        addProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo Projeto (14).png"))); // NOI18N
        addProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProfessorMouseClicked(evt);
            }
        });
        PainelExcluir.add(addProfessor);
        addProfessor.setBounds(650, 410, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void addProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProfessorMouseClicked
        PainelExcluir.removeAll();
        PainelExcluir.repaint();
        PainelExcluir.revalidate();
        CadastrarMateria cadastrar = new CadastrarMateria();
        cadastrar.setSize(760, 471);
        PainelExcluir.add(cadastrar);
        PainelExcluir.repaint();
        PainelExcluir.revalidate();
    }//GEN-LAST:event_addProfessorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JPanel PainelExcluir;
    private javax.swing.JTable TabelaMaterias;
    private javax.swing.JLabel addProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logoprincipal;
    // End of variables declaration//GEN-END:variables
}
