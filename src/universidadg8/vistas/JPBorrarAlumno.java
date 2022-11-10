
package universidadg8.vistas;

import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.listaAlumnos;
import universidadg8.entidades.Alumno;

public class JPBorrarAlumno extends javax.swing.JPanel {

    private void actualizarLista() {
        listaAlumnos = adata.obtenerAlumnos();
        jcbAlumnosBorrarAlumno.removeAllItems();
        for (Alumno alumnos : listaAlumnos) {
            jcbAlumnosBorrarAlumno.addItem(alumnos.getNombre() + " " + alumnos.getApellido());
        }
    }

    public JPBorrarAlumno() {
        initComponents();
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTituloBorrarAlumno = new javax.swing.JLabel();
        jcbAlumnosBorrarAlumno = new javax.swing.JComboBox<>();
        jlFechaBorrarAlumno = new javax.swing.JLabel();
        jlLegajoBorrarAlumno = new javax.swing.JLabel();
        jtfNombreBorrarAlumno = new javax.swing.JTextField();
        jtfApeBorrarAlumno = new javax.swing.JTextField();
        jtfDNIBorrarAlumno = new javax.swing.JTextField();
        jlTitulo2BorrarAlumno = new javax.swing.JLabel();
        jtfFechaNacBorrarAlumno = new javax.swing.JTextField();
        jlNomBorrarAlumno = new javax.swing.JLabel();
        jlApeBorrarAlumno = new javax.swing.JLabel();
        jlDNIBorrarAlumno = new javax.swing.JLabel();
        jtfIDAlumBorrarAlumno = new javax.swing.JTextField();
        jbBorrarBorrarAlumno = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Borrar Alumno"));

        jlTituloBorrarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTituloBorrarAlumno.setText("Borrar Alumno");

        jcbAlumnosBorrarAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbAlumnosBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosBorrarAlumnoActionPerformed(evt);
            }
        });

        jlFechaBorrarAlumno.setText("Fecha Nacimiento");

        jlLegajoBorrarAlumno.setText("Legajo");

        jtfNombreBorrarAlumno.setEditable(false);

        jtfApeBorrarAlumno.setEditable(false);

        jtfDNIBorrarAlumno.setEditable(false);
        jtfDNIBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDNIBorrarAlumnoActionPerformed(evt);
            }
        });

        jlTitulo2BorrarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTitulo2BorrarAlumno.setText("Datos");

        jtfFechaNacBorrarAlumno.setEditable(false);

        jlNomBorrarAlumno.setText("Nombre");

        jlApeBorrarAlumno.setText("Apellido");

        jlDNIBorrarAlumno.setText("DNI");

        jtfIDAlumBorrarAlumno.setEditable(false);

        jbBorrarBorrarAlumno.setText("Borrar");
        jbBorrarBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarBorrarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBorrarBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlTitulo2BorrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomBorrarAlumno)
                            .addComponent(jlFechaBorrarAlumno)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlLegajoBorrarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDNIBorrarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlApeBorrarAlumno, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfApeBorrarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfDNIBorrarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfFechaNacBorrarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNombreBorrarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfIDAlumBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTituloBorrarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbAlumnosBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTituloBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAlumnosBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlTitulo2BorrarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApeBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApeBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNIBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNIBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLegajoBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDAlumBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFechaBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFechaNacBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBorrarBorrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosBorrarAlumnoActionPerformed
        if (jcbAlumnosBorrarAlumno.getSelectedIndex() >= 0) {
            jtfNombreBorrarAlumno.setText(listaAlumnos.get(jcbAlumnosBorrarAlumno.getSelectedIndex()).getNombre());
            jtfApeBorrarAlumno.setText(listaAlumnos.get(jcbAlumnosBorrarAlumno.getSelectedIndex()).getApellido());
            jtfDNIBorrarAlumno.setText(String.valueOf(listaAlumnos.get(jcbAlumnosBorrarAlumno.getSelectedIndex()).getDni()));
            jtfIDAlumBorrarAlumno.setText(String.valueOf(listaAlumnos.get(jcbAlumnosBorrarAlumno.getSelectedIndex()).getId_alumno()));
            jtfFechaNacBorrarAlumno.setText(String.valueOf(listaAlumnos.get(jcbAlumnosBorrarAlumno.getSelectedIndex()).getFecha_nacimiento()));
        }
    }//GEN-LAST:event_jcbAlumnosBorrarAlumnoActionPerformed

    private void jtfDNIBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDNIBorrarAlumnoActionPerformed

    }//GEN-LAST:event_jtfDNIBorrarAlumnoActionPerformed

    private void jbBorrarBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarBorrarAlumnoActionPerformed
        adata.borrarAlumno(Integer.parseInt(jtfIDAlumBorrarAlumno.getText()));
        actualizarLista();
    }//GEN-LAST:event_jbBorrarBorrarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBorrarBorrarAlumno;
    private javax.swing.JComboBox<String> jcbAlumnosBorrarAlumno;
    private javax.swing.JLabel jlApeBorrarAlumno;
    private javax.swing.JLabel jlDNIBorrarAlumno;
    private javax.swing.JLabel jlFechaBorrarAlumno;
    private javax.swing.JLabel jlLegajoBorrarAlumno;
    private javax.swing.JLabel jlNomBorrarAlumno;
    private javax.swing.JLabel jlTitulo2BorrarAlumno;
    private javax.swing.JLabel jlTituloBorrarAlumno;
    private javax.swing.JTextField jtfApeBorrarAlumno;
    private javax.swing.JTextField jtfDNIBorrarAlumno;
    private javax.swing.JTextField jtfFechaNacBorrarAlumno;
    private javax.swing.JTextField jtfIDAlumBorrarAlumno;
    private javax.swing.JTextField jtfNombreBorrarAlumno;
    // End of variables declaration//GEN-END:variables
}
