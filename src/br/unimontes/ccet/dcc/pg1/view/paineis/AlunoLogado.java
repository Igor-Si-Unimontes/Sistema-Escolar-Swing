
package br.unimontes.ccet.dcc.pg1.view.paineis;

import br.unimontes.ccet.dcc.pg1.controller.AlunosMateriasController;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunosMaterias;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class AlunoLogado extends javax.swing.JPanel {

    
    public AlunoLogado(String matricula) {
        initComponents();
        CampoCurso.setText(matricula);
        buscar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeDadosAluno = new javax.swing.JTable();
        CampoCurso = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Visualizar avaliações");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 57, -1, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 103, 337, 10));

        tabelaDeDadosAluno.setBackground(new java.awt.Color(255, 255, 255));
        tabelaDeDadosAluno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabelaDeDadosAluno.setForeground(new java.awt.Color(0, 0, 0));
        tabelaDeDadosAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Materia", "Carga Horaria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeDadosAluno.setFocusable(false);
        tabelaDeDadosAluno.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaDeDadosAluno.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaDeDadosAluno.setRowHeight(25);
        tabelaDeDadosAluno.setSelectionBackground(new java.awt.Color(1, 181, 214));
        tabelaDeDadosAluno.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaDeDadosAluno.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaDeDadosAluno);
        if (tabelaDeDadosAluno.getColumnModel().getColumnCount() > 0) {
            tabelaDeDadosAluno.getColumnModel().getColumn(0).setPreferredWidth(3);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 214, 733, 141));

        CampoCurso.setBackground(new java.awt.Color(255, 255, 255));
        CampoCurso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCurso.setForeground(new java.awt.Color(51, 51, 51));
        CampoCurso.setText("Digite o numero de Matricula:");
        CampoCurso.setToolTipText("");
        CampoCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CampoCurso.setEnabled(false);
        CampoCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCursoMousePressed(evt);
            }
        });
        CampoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCursoActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 131, 430, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCursoMousePressed
        if (CampoCurso.getText().equals("Digite o numero de Matricula:")) {
            CampoCurso.setText("");
            CampoCurso.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoCursoMousePressed
private void buscar(){
     String matricula = CampoCurso.getText();
        DefaultTableModel tableModel = (DefaultTableModel) tabelaDeDadosAluno.getModel();
        tableModel.setRowCount(0);
        AlunosMateriasController amController = new AlunosMateriasController();

        try {
            ArrayList<AlunosMaterias> materias = amController.consultaMateria(matricula);
            materias.forEach((AlunosMaterias materia) -> {
                tableModel.addRow(new Object[]{materia.getMatricula_aluno(), materia.getId_materia(), materia.getCarga_horaria()});
            });

            tabelaDeDadosAluno.setModel(tableModel);

        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }
}
    private void CampoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCursoActionPerformed

    }//GEN-LAST:event_CampoCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaDeDadosAluno;
    // End of variables declaration//GEN-END:variables
}
