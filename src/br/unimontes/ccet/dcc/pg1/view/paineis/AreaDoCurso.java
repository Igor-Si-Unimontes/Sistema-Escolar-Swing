package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunoController;
import br.unimontes.ccet.dcc.pg1.controller.CursoController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.SQLException;

public class AreaDoCurso extends javax.swing.JPanel {

    public AreaDoCurso() throws DAOexception, SQLException {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        tabelaDeDadosCurso.getTableHeader().setOpaque(false);
        tabelaDeDadosCurso.getTableHeader().setBackground(new Color(1, 181, 214));
        tabelaDeDadosCurso.getTableHeader().setForeground(new Color(0, 0, 0));
        tabelaDeDadosCurso.setRowHeight(25);
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tabelaDeDadosCurso.getModel();
            tableModel.setRowCount(0);
            AlunoController alunoController = new AlunoController();
            CursoController cursoController = new CursoController();
            ArrayList<Curso> cursos = cursoController.consultaCurso();
            cursos.forEach((Curso curso) -> {
               
                tableModel.addRow(new Object[]{curso.getId(), curso.getNome(), curso.getPeriodos(), curso.getCarga_horaria()});
            });
            tabelaDeDadosCurso.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        tabelaDeDadosCurso = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cursos da Escola SenaIgor");

        tabelaDeDadosCurso.setBackground(new java.awt.Color(255, 255, 255));
        tabelaDeDadosCurso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabelaDeDadosCurso.setForeground(new java.awt.Color(0, 0, 0));
        tabelaDeDadosCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Periodos", "Carga Horaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeDadosCurso.setFocusable(false);
        tabelaDeDadosCurso.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaDeDadosCurso.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaDeDadosCurso.setRowHeight(25);
        tabelaDeDadosCurso.setSelectionBackground(new java.awt.Color(1, 181, 214));
        tabelaDeDadosCurso.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaDeDadosCurso.setShowVerticalLines(false);
        tabelaDeDadosCurso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaDeDadosCurso);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(325, 325, 325))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(577, 577, 577))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(131, 131, 131))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaDeDadosCurso;
    // End of variables declaration//GEN-END:variables
}
