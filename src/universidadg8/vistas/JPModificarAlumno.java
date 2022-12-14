package universidadg8.vistas;

import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.listaAlumnos;
import universidadg8.entidades.Alumno;

public class JPModificarAlumno extends javax.swing.JPanel {

    private void actualizarLista() {
        listaAlumnos = adata.obtenerAlumnos();
        jcbAlumnosActualizarAlumno.removeAllItems();
        for (Alumno alumnos : listaAlumnos) {
            jcbAlumnosActualizarAlumno.addItem(alumnos.getNombre() + " " + alumnos.getApellido());
        }
    }

    public JPModificarAlumno() {
        initComponents();
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jlTitulo2ActualizarAlum = new javax.swing.JLabel();
        jlTituloActualizarAlum = new javax.swing.JLabel();
        jcbAlumnosActualizarAlumno = new javax.swing.JComboBox<>();
        jlNomActualizarAlumno = new javax.swing.JLabel();
        jlApeActualizarAlumno = new javax.swing.JLabel();
        jlDNIActualizarAlumno = new javax.swing.JLabel();
        jlFechaActualizarAlumno = new javax.swing.JLabel();
        jlLegajoActualizarAlumno = new javax.swing.JLabel();
        jtfNombreActualizarAlumno = new javax.swing.JTextField();
        jtfApeActualizarAlumno = new javax.swing.JTextField();
        jtfDNIActualizarAlumno = new javax.swing.JTextField();
        jtfIDAlumActualizarAlumno = new javax.swing.JTextField();
        jDaChActualizarAlumno = new com.toedter.calendar.JDateChooser();
        jbActualizarActualizarAlumno = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Datos"));
        setPreferredSize(new java.awt.Dimension(369, 353));

        jlTitulo2ActualizarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTitulo2ActualizarAlum.setText("Datos");

        jlTituloActualizarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTituloActualizarAlum.setText("Alumno");

        jcbAlumnosActualizarAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbAlumnosActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActualizarAlumnoActionPerformed(evt);
            }
        });

        jlNomActualizarAlumno.setText("Nombre");

        jlApeActualizarAlumno.setText("Apellido");

        jlDNIActualizarAlumno.setText("DNI");

        jlFechaActualizarAlumno.setText("Fecha Nacimiento");

        jlLegajoActualizarAlumno.setText("Legajo");

        jtfDNIActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDNIActualizarAlumnoActionPerformed(evt);
            }
        });

        jtfIDAlumActualizarAlumno.setEditable(false);

        jbActualizarActualizarAlumno.setText("Actualizar Datos");
        jbActualizarActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActualizarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbActualizarActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomActualizarAlumno)
                                    .addComponent(jlFechaActualizarAlumno)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlLegajoActualizarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlDNIActualizarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlApeActualizarAlumno, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlTitulo2ActualizarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlTituloActualizarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbAlumnosActualizarAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfApeActualizarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfDNIActualizarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfIDAlumActualizarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNombreActualizarAlumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDaChActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTituloActualizarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAlumnosActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlTitulo2ActualizarAlum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApeActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApeActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNIActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNIActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLegajoActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDAlumActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlFechaActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDaChActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbActualizarActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDNIActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDNIActualizarAlumnoActionPerformed

    }//GEN-LAST:event_jtfDNIActualizarAlumnoActionPerformed

    private void jcbAlumnosActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActualizarAlumnoActionPerformed
        if (jtfNombreActualizarAlumno.getText().isEmpty() || jtfApeActualizarAlumno.getText().isEmpty()) {

        }
        if (jcbAlumnosActualizarAlumno.getSelectedIndex() >= 0) {
            jtfNombreActualizarAlumno.setText(listaAlumnos.get(jcbAlumnosActualizarAlumno.getSelectedIndex()).getNombre());
            jtfApeActualizarAlumno.setText(listaAlumnos.get(jcbAlumnosActualizarAlumno.getSelectedIndex()).getApellido());
            jtfDNIActualizarAlumno.setText(String.valueOf(listaAlumnos.get(jcbAlumnosActualizarAlumno.getSelectedIndex()).getDni()));
            jtfIDAlumActualizarAlumno.setText(String.valueOf(listaAlumnos.get(jcbAlumnosActualizarAlumno.getSelectedIndex()).getId_alumno()));
            jDaChActualizarAlumno.setDate(Date.from(listaAlumnos.get(jcbAlumnosActualizarAlumno.getSelectedIndex()).getFecha_nacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
    }//GEN-LAST:event_jcbAlumnosActualizarAlumnoActionPerformed

    private void jbActualizarActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActualizarAlumnoActionPerformed
        if (jtfNombreActualizarAlumno.getText().isEmpty() || jtfApeActualizarAlumno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
        } else {
            try {
                Alumno aux;
                aux = adata.obtenerAlumnoPorId(Integer.parseInt(jtfIDAlumActualizarAlumno.getText()));
                aux.setNombre(jtfNombreActualizarAlumno.getText());
                aux.setApellido(jtfApeActualizarAlumno.getText());
                aux.setDni(Long.parseLong(jtfDNIActualizarAlumno.getText()));
                aux.setFecha_nacimiento(jDaChActualizarAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                adata.actualizaAlumno(aux);
                actualizarLista();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, verifique haber ingresado todos los datos correctamente.");
            }
        }
    }//GEN-LAST:event_jbActualizarActualizarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDaChActualizarAlumno;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbActualizarActualizarAlumno;
    private javax.swing.JComboBox<String> jcbAlumnosActualizarAlumno;
    private javax.swing.JLabel jlApeActualizarAlumno;
    private javax.swing.JLabel jlDNIActualizarAlumno;
    private javax.swing.JLabel jlFechaActualizarAlumno;
    private javax.swing.JLabel jlLegajoActualizarAlumno;
    private javax.swing.JLabel jlNomActualizarAlumno;
    private javax.swing.JLabel jlTitulo2ActualizarAlum;
    private javax.swing.JLabel jlTituloActualizarAlum;
    private javax.swing.JTextField jtfApeActualizarAlumno;
    private javax.swing.JTextField jtfDNIActualizarAlumno;
    private javax.swing.JTextField jtfIDAlumActualizarAlumno;
    private javax.swing.JTextField jtfNombreActualizarAlumno;
    // End of variables declaration//GEN-END:variables
}
