package universidadg8.vistas;

import static universidadg8.UniversidadG8.listaMaterias;
import static universidadg8.UniversidadG8.mdata;
import universidadg8.entidades.Materia;

public class JPBorrarMateria extends javax.swing.JPanel {

    private void actualizarLista() {
        listaMaterias = mdata.obtenerMaterias();
        JCBMateriasBorrarMateria.removeAllItems();
        for (Materia lista : listaMaterias) {
            JCBMateriasBorrarMateria.addItem(lista.getNombre());
        }
    }

    public JPBorrarMateria() {
        initComponents();
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JCBMateriasBorrarMateria = new javax.swing.JComboBox<>();
        JLMateriaBorrar = new javax.swing.JLabel();
        JBBotonBorrar = new javax.swing.JButton();
        jlIDBorrarMateria = new javax.swing.JLabel();
        jtfNombreBorrarMateria = new javax.swing.JTextField();
        jtfAnioBorrarMateria = new javax.swing.JTextField();
        jtfIDBorrarMateria = new javax.swing.JTextField();
        jlTitulo2BorrarAlumno = new javax.swing.JLabel();
        jlNomBorrarMateria = new javax.swing.JLabel();
        JLAnioABorrarMateria = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrar Materia"));
        jPanel2.setPreferredSize(new java.awt.Dimension(369, 353));

        JCBMateriasBorrarMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBMateriasBorrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMateriasBorrarMateriaActionPerformed(evt);
            }
        });

        JLMateriaBorrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        JLMateriaBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMateriaBorrar.setText("Materia");

        JBBotonBorrar.setText("Borrar");
        JBBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonBorrarActionPerformed(evt);
            }
        });

        jlIDBorrarMateria.setText("ID");

        jtfNombreBorrarMateria.setEditable(false);

        jtfAnioBorrarMateria.setEditable(false);

        jtfIDBorrarMateria.setEditable(false);
        jtfIDBorrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDBorrarMateriaActionPerformed(evt);
            }
        });

        jlTitulo2BorrarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlTitulo2BorrarAlumno.setText("Datos");

        jlNomBorrarMateria.setText("Nombre");

        JLAnioABorrarMateria.setText("A??o");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JLMateriaBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JCBMateriasBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jlTitulo2BorrarAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBBotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomBorrarMateria)
                                    .addComponent(JLAnioABorrarMateria)
                                    .addComponent(jlIDBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfAnioBorrarMateria)
                                    .addComponent(jtfIDBorrarMateria)
                                    .addComponent(jtfNombreBorrarMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLMateriaBorrar)
                    .addComponent(JCBMateriasBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jlTitulo2BorrarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAnioABorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAnioBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(JBBotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JCBMateriasBorrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMateriasBorrarMateriaActionPerformed
        if (JCBMateriasBorrarMateria.getSelectedIndex() >= 0) {
            jtfNombreBorrarMateria.setText(listaMaterias.get(JCBMateriasBorrarMateria.getSelectedIndex()).getNombre());
            jtfAnioBorrarMateria.setText(String.valueOf(listaMaterias.get(JCBMateriasBorrarMateria.getSelectedIndex()).getAnio()));
            jtfIDBorrarMateria.setText(String.valueOf(listaMaterias.get(JCBMateriasBorrarMateria.getSelectedIndex()).getId_materia()));
        }
    }//GEN-LAST:event_JCBMateriasBorrarMateriaActionPerformed

    private void JBBotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonBorrarActionPerformed
        mdata.borrarMateria(Integer.parseInt(jtfIDBorrarMateria.getText()));
        actualizarLista();
    }//GEN-LAST:event_JBBotonBorrarActionPerformed

    private void jtfIDBorrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDBorrarMateriaActionPerformed

    }//GEN-LAST:event_jtfIDBorrarMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBotonBorrar;
    private javax.swing.JComboBox<String> JCBMateriasBorrarMateria;
    private javax.swing.JLabel JLAnioABorrarMateria;
    private javax.swing.JLabel JLMateriaBorrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlIDBorrarMateria;
    private javax.swing.JLabel jlNomBorrarMateria;
    private javax.swing.JLabel jlTitulo2BorrarAlumno;
    private javax.swing.JTextField jtfAnioBorrarMateria;
    private javax.swing.JTextField jtfIDBorrarMateria;
    private javax.swing.JTextField jtfNombreBorrarMateria;
    // End of variables declaration//GEN-END:variables
}
