/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidadg8.vistas;

import javax.swing.JOptionPane;
import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.mdata;
import universidadg8.entidades.Materia;

public class JPBuscarMateriaporID extends javax.swing.JPanel {


    public JPBuscarMateriaporID() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlBuscarAlumPorIDTitulo = new javax.swing.JLabel();
        JLBuscarMateriaPorID = new javax.swing.JLabel();
        JTFBuscarMateriaPorID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFNombreBuscarMateriaPorID = new javax.swing.JTextField();
        JTFAnioBuscarMateriaPorID = new javax.swing.JTextField();
        JLNombreBuscarMateriaPorID = new javax.swing.JLabel();
        JLAñoBuscarMateriaPorID = new javax.swing.JLabel();
        JBBotonBuscarMateriaPorID = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Legajo"));
        jPanel2.setPreferredSize(new java.awt.Dimension(369, 353));

        jlBuscarAlumPorIDTitulo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jlBuscarAlumPorIDTitulo.setText("Buscar Materia");

        JLBuscarMateriaPorID.setText("ID");

        JTFBuscarMateriaPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFBuscarMateriaPorIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Datos");

        JTFNombreBuscarMateriaPorID.setEditable(false);

        JTFAnioBuscarMateriaPorID.setEditable(false);

        JLNombreBuscarMateriaPorID.setText("Nombre");

        JLAñoBuscarMateriaPorID.setText("Año");

        JBBotonBuscarMateriaPorID.setText("Buscar");
        JBBotonBuscarMateriaPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonBuscarMateriaPorIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombreBuscarMateriaPorID)
                            .addComponent(JLAñoBuscarMateriaPorID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFAnioBuscarMateriaPorID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(JTFNombreBuscarMateriaPorID, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlBuscarAlumPorIDTitulo)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JLBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBBotonBuscarMateriaPorID)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlBuscarAlumPorIDTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBBotonBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLBuscarMateriaPorID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNombreBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNombreBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAñoBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFAnioBuscarMateriaPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
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

    private void JTFBuscarMateriaPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFBuscarMateriaPorIDActionPerformed

    }//GEN-LAST:event_JTFBuscarMateriaPorIDActionPerformed

    private void JBBotonBuscarMateriaPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonBuscarMateriaPorIDActionPerformed
        try {
            Materia aux = mdata.obtenerMateriaPorId(Integer.parseInt(JTFBuscarMateriaPorID.getText()));
            JTFNombreBuscarMateriaPorID.setText(aux.getNombre());
            JTFAnioBuscarMateriaPorID.setText(String.valueOf(aux.getAnio()));
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay materias que correspondan a ese ID.");
        }
    }//GEN-LAST:event_JBBotonBuscarMateriaPorIDActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBotonBuscarMateriaPorID;
    private javax.swing.JLabel JLAñoBuscarMateriaPorID;
    private javax.swing.JLabel JLBuscarMateriaPorID;
    private javax.swing.JLabel JLNombreBuscarMateriaPorID;
    private javax.swing.JTextField JTFAnioBuscarMateriaPorID;
    private javax.swing.JTextField JTFBuscarMateriaPorID;
    private javax.swing.JTextField JTFNombreBuscarMateriaPorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlBuscarAlumPorIDTitulo;
    // End of variables declaration//GEN-END:variables
}
