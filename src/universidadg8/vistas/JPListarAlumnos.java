/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidadg8.vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadg8.entidades.Alumno;
import static universidadg8.vistas.JfIndex.listaAlumnos;

/**
 *
 * @author tcnlu
 */
public class JPListarAlumnos extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    /**
     * Creates new form JPListarAlumnos
     */
    public JPListarAlumnos() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        cargarAlumnos();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("DNI");
        columnas.add("Fecha Nacimiento");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        JTAlumnos.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }

        }
    }

    private void cargarAlumnos() {
        borrarFilasTabla();
        for (Alumno aux : listaAlumnos) {
            modelo.addRow(new Object[]{aux.getId_alumno(), aux.getNombre(), aux.getApellido(), aux.getDni(), aux.getFecha_nacimiento()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTAlumnos = new javax.swing.JTable();
        jlListaAlumnosTitulo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Alumnos"));

        JTAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTAlumnos);

        jlListaAlumnosTitulo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jlListaAlumnosTitulo.setText("Lista de Alumnos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListaAlumnosTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListaAlumnosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListaAlumnosTitulo;
    // End of variables declaration//GEN-END:variables
}
