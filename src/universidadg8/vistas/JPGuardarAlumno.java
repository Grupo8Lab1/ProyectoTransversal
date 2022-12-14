package universidadg8.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JOptionPane;
import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.listaAlumnos;
import universidadg8.entidades.Alumno;

public class JPGuardarAlumno extends javax.swing.JPanel {

    public JPGuardarAlumno() {
        initComponents();
        listaAlumnos = adata.obtenerAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlNombreGuardarAlumno = new javax.swing.JLabel();
        jlApellidoGuardarAlumno = new javax.swing.JLabel();
        jlDNIGuardarAlumno = new javax.swing.JLabel();
        jlFechaNacGuardarAlumno = new javax.swing.JLabel();
        jCalGuardarAlumno = new com.toedter.calendar.JCalendar();
        jtfApellidoGuardarAlumno = new javax.swing.JTextField();
        jtfNombreGuardarAlumno = new javax.swing.JTextField();
        jtfDNIGuardarAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbBorrarGuardarAlumno = new javax.swing.JButton();
        jbGuardarGuardarAlumno = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder("Guardar"));
        setPreferredSize(new java.awt.Dimension(369, 353));

        jlNombreGuardarAlumno.setText("Nombre");

        jlApellidoGuardarAlumno.setText("Apellido");

        jlDNIGuardarAlumno.setText("DNI");

        jlFechaNacGuardarAlumno.setText("Fecha Nacimiento");

        jtfApellidoGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoGuardarAlumnoActionPerformed(evt);
            }
        });

        jtfNombreGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreGuardarAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        jbBorrarGuardarAlumno.setText("Borrar");
        jbBorrarGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarGuardarAlumnoActionPerformed(evt);
            }
        });

        jbGuardarGuardarAlumno.setText("Guardar");
        jbGuardarGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarGuardarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreGuardarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlApellidoGuardarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDNIGuardarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApellidoGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNombreGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfDNIGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFechaNacGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBorrarGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbGuardarGuardarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCalGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellidoGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidoGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDNIGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDNIGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaNacGuardarAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBorrarGuardarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jbGuardarGuardarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfApellidoGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoGuardarAlumnoActionPerformed

    }//GEN-LAST:event_jtfApellidoGuardarAlumnoActionPerformed

    private void jtfNombreGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreGuardarAlumnoActionPerformed

    }//GEN-LAST:event_jtfNombreGuardarAlumnoActionPerformed

    private void jbGuardarGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarGuardarAlumnoActionPerformed
        if (jtfNombreGuardarAlumno.getText().isEmpty() || jtfApellidoGuardarAlumno.getText().isEmpty() || jtfDNIGuardarAlumno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        } else if (jCalGuardarAlumno.getDate().after(Date.from(LocalDate.now().minusYears(4).atStartOfDay().toInstant(ZoneOffset.UTC)))) {
            JOptionPane.showMessageDialog(null, "Error, su alumno es un poco joven para nuestra instituci??n...");
        } else {
            try {
                adata.guardarAlumno(new Alumno((Long.parseLong(jtfDNIGuardarAlumno.getText())), jtfApellidoGuardarAlumno.getText(), jtfNombreGuardarAlumno.getText(), jCalGuardarAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), true));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, verifique haber ingresado todos los datos correctamente.");
            }
        }
    }//GEN-LAST:event_jbGuardarGuardarAlumnoActionPerformed

    private void jbBorrarGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarGuardarAlumnoActionPerformed
        jtfApellidoGuardarAlumno.setText("");
        jtfNombreGuardarAlumno.setText("");
        jtfDNIGuardarAlumno.setText("");
        jCalGuardarAlumno.setDate(Date.from(LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC)));
    }//GEN-LAST:event_jbBorrarGuardarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalGuardarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBorrarGuardarAlumno;
    private javax.swing.JButton jbGuardarGuardarAlumno;
    private javax.swing.JLabel jlApellidoGuardarAlumno;
    private javax.swing.JLabel jlDNIGuardarAlumno;
    private javax.swing.JLabel jlFechaNacGuardarAlumno;
    private javax.swing.JLabel jlNombreGuardarAlumno;
    private javax.swing.JTextField jtfApellidoGuardarAlumno;
    private javax.swing.JTextField jtfDNIGuardarAlumno;
    private javax.swing.JTextField jtfNombreGuardarAlumno;
    // End of variables declaration//GEN-END:variables
}
