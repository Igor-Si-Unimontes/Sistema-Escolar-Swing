package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.MateriaController;
import br.unimontes.ccet.dcc.pg1.model.dao.MateriaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.util.ArrayList;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;

public class AreaMateria extends javax.swing.JPanel {

    public AreaMateria() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        tabelaDeDados.getTableHeader().setOpaque(false);
        tabelaDeDados.getTableHeader().setBackground(new Color(1, 181, 214));
        tabelaDeDados.getTableHeader().setForeground(new Color(0, 0, 0));
        tabelaDeDados.setRowHeight(25);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        tabelaDeDados = new javax.swing.JTable();
        CampoCurso = new javax.swing.JTextField();
        BotaoEntrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Matérias");

        tabelaDeDados.setBackground(new java.awt.Color(255, 255, 255));
        tabelaDeDados.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabelaDeDados.setForeground(new java.awt.Color(0, 0, 0));
        tabelaDeDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Periodo", "Professor", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeDados.setFocusable(false);
        tabelaDeDados.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaDeDados.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaDeDados.setRowHeight(25);
        tabelaDeDados.setSelectionBackground(new java.awt.Color(1, 181, 214));
        tabelaDeDados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaDeDados.setShowVerticalLines(false);
        tabelaDeDados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaDeDados);
        if (tabelaDeDados.getColumnModel().getColumnCount() > 0) {
            tabelaDeDados.getColumnModel().getColumn(0).setResizable(false);
            tabelaDeDados.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelaDeDados.getColumnModel().getColumn(1).setResizable(false);
            tabelaDeDados.getColumnModel().getColumn(1).setPreferredWidth(130);
            tabelaDeDados.getColumnModel().getColumn(2).setResizable(false);
            tabelaDeDados.getColumnModel().getColumn(2).setPreferredWidth(4);
            tabelaDeDados.getColumnModel().getColumn(3).setResizable(false);
            tabelaDeDados.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaDeDados.getColumnModel().getColumn(4).setResizable(false);
            tabelaDeDados.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        CampoCurso.setBackground(new java.awt.Color(255, 255, 255));
        CampoCurso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCurso.setForeground(new java.awt.Color(51, 51, 51));
        CampoCurso.setText("Digite o curso");
        CampoCurso.setToolTipText("");
        CampoCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CampoCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCursoMousePressed(evt);
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
        BotaoEntrartxt.setText("BUSCAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoEntrarLayout = new javax.swing.GroupLayout(BotaoEntrar);
        BotaoEntrar.setLayout(BotaoEntrarLayout);
        BotaoEntrarLayout.setHorizontalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoEntrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        BotaoEntrarLayout.setVerticalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoEntrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addGap(515, 515, 515))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoCurso)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoCurso))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCursoMousePressed
        if (CampoCurso.getText().equals("Digite o curso")) {
            CampoCurso.setText("");
            CampoCurso.setForeground(Color.black);
        }

    }//GEN-LAST:event_CampoCursoMousePressed

    private void BotaoEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseEntered
        BotaoEntrar.setBackground(new Color(170, 208, 215));
    }//GEN-LAST:event_BotaoEntrarMouseEntered

    private void BotaoEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseExited
        BotaoEntrar.setBackground(new Color(1, 181, 214));
    }//GEN-LAST:event_BotaoEntrarMouseExited

    private void BotaoEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseClicked
        String curso = CampoCurso.getText();
        DefaultTableModel tableModel = (DefaultTableModel) tabelaDeDados.getModel();
        tableModel.setRowCount(0);
        MateriaController materiaController = new MateriaController();
        try {
            ArrayList<Materia> materias = materiaController.consultaMateria(curso);

            materias.forEach((Materia materia) -> {
                tableModel.addRow(new Object[]{materia.getId(), materia.getNome(), materia.getPeriodo(), materia.getProfessor(), materia.getCurso()});
            });

            tabelaDeDados.setModel(tableModel);
            
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }    }//GEN-LAST:event_BotaoEntrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoEntrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JTextField CampoCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDeDados;
    // End of variables declaration//GEN-END:variables
}
