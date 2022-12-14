
package universidadg8.vistas;

import javax.swing.JOptionPane;
import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.listaAlumnos;
import universidadg8.entidades.Alumno;

public class JPBuscarAlumnoPorID extends javax.swing.JPanel {

    public JPBuscarAlumnoPorID() {
        listaAlumnos = adata.obtenerAlumnos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlBuscarAlumPorIDTitulo = new javax.swing.JLabel();
        jlIdBuscarBuscarAlumnoPorID = new javax.swing.JLabel();
        jtfIDBuscarBuscarAlumnoPorID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlFechaBuscarAlumnoPorID = new javax.swing.JLabel();
        jlLegajoBuscarAlumnoPorID = new javax.swing.JLabel();
        jtfNombreBuscarAlumnoPorID = new javax.swing.JTextField();
        jtfApeBuscarAlumnoPorID = new javax.swing.JTextField();
        jtfDNIBuscarAlumnoPorID = new javax.swing.JTextField();
        jlNomBuscarAlumnoPorID = new javax.swing.JLabel();
        jtfIDBuscarAlumnoPorID = new javax.swing.JTextField();
        jlApeBuscarAlumnoPorID = new javax.swing.JLabel();
        jlDNIBuscarAlumnoPorID = new javax.swing.JLabel();
        jtfFechaNacBuscarAlumnoPorID = new javax.swing.JTextField();
        jbBuscarBuscarAlumnoPorID = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Legajo"));
        setPreferredSize(new java.awt.Dimension(369, 353));

        jlBuscarAlumPorIDTitulo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlBuscarAlumPorIDTitulo.setText("Buscar Alumno");

        jlIdBuscarBuscarAlumnoPorID.setText("Legajo");

        jtfIDBuscarBuscarAlumnoPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDBuscarBuscarAlumnoPorIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Datos");

        jlFechaBuscarAlumnoPorID.setText("Fecha Nacimiento");

        jlLegajoBuscarAlumnoPorID.setText("Legajo");

        jtfNombreBuscarAlumnoPorID.setEditable(false);

        jtfApeBuscarAlumnoPorID.setEditable(false);

        jtfDNIBuscarAlumnoPorID.setEditable(false);
        jtfDNIBuscarAlumnoPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDNIBuscarAlumnoPorIDActionPerformed(evt);
            }
        });

        jlNomBuscarAlumnoPorID.setText("Nombre");

        jtfIDBuscarAlumnoPorID.setEditable(false);

        jlApeBuscarAlumnoPorID.setText("Apellido");

        jlDNIBuscarAlumnoPorID.setText("DNI");

        jtfFechaNacBuscarAlumnoPorID.setEditable(false);
        jtfFechaNacBuscarAlumnoPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaNacBuscarAlumnoPorIDActionPerformed(evt);
            }
        });

        jbBuscarBuscarAlumnoPorID.setText("Buscar");
        jbBuscarBuscarAlumnoPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarBuscarAlumnoPorIDActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomBuscarAlumnoPorID)
                            .addComponent(jlFechaBuscarAlumnoPorID)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlLegajoBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDNIBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlApeBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfApeBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jtfDNIBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfIDBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNombreBuscarAlumnoPorID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfFechaNacBuscarAlumnoPorID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlBuscarAlumPorIDTitulo)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlIdBuscarBuscarAlumnoPorID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfIDBuscarBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jbBuscarBuscarAlumnoPorID)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlBuscarAlumPorIDTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfIDBuscarBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscarBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlIdBuscarBuscarAlumnoPorID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApeBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfApeBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNIBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNIBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLegajoBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFechaBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFechaNacBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIDBuscarBuscarAlumnoPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDBuscarBuscarAlumnoPorIDActionPerformed

    }//GEN-LAST:event_jtfIDBuscarBuscarAlumnoPorIDActionPerformed

    private void jtfDNIBuscarAlumnoPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDNIBuscarAlumnoPorIDActionPerformed

    }//GEN-LAST:event_jtfDNIBuscarAlumnoPorIDActionPerformed

    private void jtfFechaNacBuscarAlumnoPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaNacBuscarAlumnoPorIDActionPerformed

    }//GEN-LAST:event_jtfFechaNacBuscarAlumnoPorIDActionPerformed

    private void jbBuscarBuscarAlumnoPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarBuscarAlumnoPorIDActionPerformed
        try {
            Alumno aux = adata.obtenerAlumnoPorId(Integer.valueOf(jtfIDBuscarBuscarAlumnoPorID.getText()));
            jtfNombreBuscarAlumnoPorID.setText(aux.getNombre());
            jtfApeBuscarAlumnoPorID.setText(aux.getApellido());
            jtfDNIBuscarAlumnoPorID.setText(String.valueOf(aux.getDni()));
            jtfIDBuscarAlumnoPorID.setText(String.valueOf(aux.getId_alumno()));
            jtfFechaNacBuscarAlumnoPorID.setText(aux.getFecha_nacimiento().toString());
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay alumnos que correspondan a ese legajo.");
            jtfDNIBuscarAlumnoPorID.setText("");
            jtfIDBuscarAlumnoPorID.setText("");
        }
    }//GEN-LAST:event_jbBuscarBuscarAlumnoPorIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbBuscarBuscarAlumnoPorID;
    private javax.swing.JLabel jlApeBuscarAlumnoPorID;
    private javax.swing.JLabel jlBuscarAlumPorIDTitulo;
    private javax.swing.JLabel jlDNIBuscarAlumnoPorID;
    private javax.swing.JLabel jlFechaBuscarAlumnoPorID;
    private javax.swing.JLabel jlIdBuscarBuscarAlumnoPorID;
    private javax.swing.JLabel jlLegajoBuscarAlumnoPorID;
    private javax.swing.JLabel jlNomBuscarAlumnoPorID;
    private javax.swing.JTextField jtfApeBuscarAlumnoPorID;
    private javax.swing.JTextField jtfDNIBuscarAlumnoPorID;
    private javax.swing.JTextField jtfFechaNacBuscarAlumnoPorID;
    private javax.swing.JTextField jtfIDBuscarAlumnoPorID;
    private javax.swing.JTextField jtfIDBuscarBuscarAlumnoPorID;
    private javax.swing.JTextField jtfNombreBuscarAlumnoPorID;
    // End of variables declaration//GEN-END:variables
}
