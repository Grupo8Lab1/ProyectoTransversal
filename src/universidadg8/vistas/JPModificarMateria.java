/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidadg8.vistas;

import universidadg8.entidades.Materia;
import static universidadg8.vistas.JfIndex.listaMaterias;

/**
 *
 * @author Santi
 */
public class JPModificarMateria extends javax.swing.JPanel {

    /**
     * Creates new form JPModificarMateria
     */
    public JPModificarMateria() {
       initComponents();
        JCBActualizarMateria.removeAllItems();
        for (Materia materias : listaMaterias) {
            JCBActualizarMateria.addItem(materias.getNombre());
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

        jPanel2 = new javax.swing.JPanel();
        jlTitulo2ActualizarAlum = new javax.swing.JLabel();
        jlTituloActualizarAlum = new javax.swing.JLabel();
        JCBActualizarMateria = new javax.swing.JComboBox<>();
        JLActualizarNombreMateria = new javax.swing.JLabel();
        JLActualizarAnioMateria = new javax.swing.JLabel();
        JLActualizarIDMateria = new javax.swing.JLabel();
        JTFActualizarNombreMateria = new javax.swing.JTextField();
        JTFActualizarAnioMateria = new javax.swing.JTextField();
        JTFActualizarIDMateria = new javax.swing.JTextField();
        JBActualizarActualizarMateria = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Datos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(369, 353));

        jlTitulo2ActualizarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTitulo2ActualizarAlum.setText("Datos");

        jlTituloActualizarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTituloActualizarAlum.setText("Materia");

        JCBActualizarMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBActualizarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBActualizarMateriaActionPerformed(evt);
            }
        });

        JLActualizarNombreMateria.setText("Nombre");

        JLActualizarAnioMateria.setText("Año");

        JLActualizarIDMateria.setText("ID");

        JTFActualizarIDMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFActualizarIDMateriaActionPerformed(evt);
            }
        });

        JBActualizarActualizarMateria.setText("Actualizar Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBActualizarActualizarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLActualizarNombreMateria)
                                    .addComponent(JLActualizarIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLActualizarAnioMateria)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlTitulo2ActualizarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlTituloActualizarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCBActualizarMateria, 0, 203, Short.MAX_VALUE)
                            .addComponent(JTFActualizarAnioMateria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFActualizarIDMateria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFActualizarNombreMateria, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTituloActualizarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBActualizarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlTitulo2ActualizarAlum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLActualizarNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFActualizarNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLActualizarAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFActualizarAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLActualizarIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFActualizarIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(JBActualizarActualizarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void JCBActualizarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBActualizarMateriaActionPerformed
        if (JCBActualizarMateria.getSelectedIndex() >= 0) {
            JTFActualizarNombreMateria.setText(listaMaterias.get(JCBActualizarMateria.getSelectedIndex()).getNombre());
            JTFActualizarAnioMateria.setText(String.valueOf(listaMaterias.get(JCBActualizarMateria.getSelectedIndex()).getAnio()));
            JTFActualizarIDMateria.setText(String.valueOf(listaMaterias.get(JCBActualizarMateria.getSelectedIndex()).getId_materia()));
        }
    }//GEN-LAST:event_JCBActualizarMateriaActionPerformed

    private void JTFActualizarIDMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFActualizarIDMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFActualizarIDMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizarActualizarMateria;
    private javax.swing.JComboBox<String> JCBActualizarMateria;
    private javax.swing.JLabel JLActualizarAnioMateria;
    private javax.swing.JLabel JLActualizarIDMateria;
    private javax.swing.JLabel JLActualizarNombreMateria;
    private javax.swing.JTextField JTFActualizarAnioMateria;
    private javax.swing.JTextField JTFActualizarIDMateria;
    private javax.swing.JTextField JTFActualizarNombreMateria;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlTitulo2ActualizarAlum;
    private javax.swing.JLabel jlTituloActualizarAlum;
    // End of variables declaration//GEN-END:variables
}
