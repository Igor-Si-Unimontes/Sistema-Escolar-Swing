/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.view.paineis;

    public interface TableActionEvent {

    public void onEdit(int row);

    public void onDelete(int row);

    public void onView(int row);
}
