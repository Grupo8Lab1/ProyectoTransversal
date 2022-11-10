package universidadg8.vistas;

import javax.swing.JOptionPane;
import static universidadg8.UniversidadG8.mdata;
import static universidadg8.UniversidadG8.listaMaterias;
import universidadg8.entidades.Materia;

public class JPGuardarMateria extends javax.swing.JPanel {

    public JPGuardarMateria() {
        initComponents();
        listaMaterias = mdata.obtenerMaterias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlNombreGuardarAlumno = new javax.swing.JLabel();
        JFAnio = new javax.swing.JLabel();
        jlIconGuardarAlum = new javax.swing.JLabel();
        JTFAñoGuardarMateria = new javax.swing.JTextField();
        JTFNombreGuardarMateria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarGuardarMateria = new javax.swing.JButton();
        JBGuardarGuardarMateria = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardar"));
        jPanel2.setPreferredSize(new java.awt.Dimension(369, 353));

        jlNombreGuardarAlumno.setText("Nombre");

        JFAnio.setText("Año");

        JTFAñoGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAñoGuardarMateriaActionPerformed(evt);
            }
        });

        JTFNombreGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNombreGuardarMateriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        JBBorrarGuardarMateria.setText("Borrar");
        JBBorrarGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarGuardarMateriaActionPerformed(evt);
            }
        });

        JBGuardarGuardarMateria.setText("Guardar");
        JBGuardarGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarGuardarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreGuardarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlIconGuardarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFAñoGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFNombreGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(JBBorrarGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBGuardarGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconGuardarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNombreGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFAñoGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBorrarGuardarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(JBGuardarGuardarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFAñoGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAñoGuardarMateriaActionPerformed

    }//GEN-LAST:event_JTFAñoGuardarMateriaActionPerformed

    private void JTFNombreGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNombreGuardarMateriaActionPerformed

    }//GEN-LAST:event_JTFNombreGuardarMateriaActionPerformed

    private void JBGuardarGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarGuardarMateriaActionPerformed

        if (JTFAñoGuardarMateria.getText().isEmpty() || JTFNombreGuardarMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        } else {
            try {
                mdata.guardarMateria(new Materia(JTFNombreGuardarMateria.getText(), Integer.parseInt(JTFAñoGuardarMateria.getText()), true));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, verifique haber ingresado todos los datos correctamente.");
            }
        }
    }//GEN-LAST:event_JBGuardarGuardarMateriaActionPerformed

    private void JBBorrarGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarGuardarMateriaActionPerformed
        JTFNombreGuardarMateria.setText("");
        JTFAñoGuardarMateria.setText("");
    }//GEN-LAST:event_JBBorrarGuardarMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBorrarGuardarMateria;
    private javax.swing.JButton JBGuardarGuardarMateria;
    private javax.swing.JLabel JFAnio;
    private javax.swing.JTextField JTFAñoGuardarMateria;
    private javax.swing.JTextField JTFNombreGuardarMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlIconGuardarAlum;
    private javax.swing.JLabel jlNombreGuardarAlumno;
    // End of variables declaration//GEN-END:variables
}
