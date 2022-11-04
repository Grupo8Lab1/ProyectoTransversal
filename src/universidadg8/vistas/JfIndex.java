/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadg8.vistas;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static universidadg8.UniversidadG8.adata;
import static universidadg8.UniversidadG8.idata;
import static universidadg8.UniversidadG8.mdata;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Materia;
import universidadg8.vistas.JPGuardarMateria;

/**
 *
 * @author Santi
 */
public class JfIndex extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    public static ArrayList<Alumno> listaAlumnos;
    public static ArrayList<Materia> listaMaterias;

    public JfIndex() {
        initComponents();
        listaAlumnos = adata.obtenerAlumnos();
        listaMaterias = mdata.obtenerMaterias();
        cargarAlumno();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();

    }

    private void cargarAlumno() {
        JCBAlumnosDB.removeAllItems();
        for (Alumno lista : listaAlumnos) {

            JCBAlumnosDB.addItem(lista.getNombre() + " " + lista.getApellido());
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("AÑO");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        JTMaterias.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }

        }
    }

    private void cargarDatoInscriptas() {
        borrarFilasTabla();
        Alumno seleccionado = listaAlumnos.get(JCBAlumnosDB.getSelectedIndex());
        if (seleccionado != null) {

            for (Materia mat : idata.obtenerMateriasNoInscriptas(seleccionado)) {
                modelo.addRow(new Object[]{mat.getId_materia(), mat.getNombre(), mat.getAnio()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "se debe seleccionar un alumno");
        }
    }

    private void cargarDatoNoInscriptas() {
        borrarFilasTabla();
        Alumno seleccionado = listaAlumnos.get(JCBAlumnosDB.getSelectedIndex());
        if (seleccionado != null) {
            for (Materia mat : idata.obtenerMateriasInscriptas(seleccionado)) {
                modelo.addRow(new Object[]{mat.getId_materia(), mat.getNombre(), mat.getAnio()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "se debe seleccionar un alumno");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtpOpciones = new javax.swing.JTabbedPane();
        content = new javax.swing.JPanel();
        JPAlumno = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        contentAlumno = new javax.swing.JPanel();
        jlIconBuscarAlumID = new javax.swing.JLabel();
        jlIconListarAlum = new javax.swing.JLabel();
        jlIconActualizarAlumno = new javax.swing.JLabel();
        jlIConGuardarAlumno = new javax.swing.JLabel();
        jlIconAlumno = new javax.swing.JLabel();
        JBBorrarAlumno = new java.awt.Button();
        jbListarAlumnos = new java.awt.Button();
        jbActualizarAlumno = new java.awt.Button();
        jbGuardarAlumno = new java.awt.Button();
        JBBuscarAlumnoPorID = new java.awt.Button();
        jlIconBorrarAlum = new javax.swing.JLabel();
        JPMaterias = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        contentMateria = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JBGuardarMateria = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BModificarMateria = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        BBuscarMateriaporID = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();
        BBorrarMateria = new java.awt.Button();
        JpInscripciones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contentInscripcion = new javax.swing.JPanel();
        JCBAlumnosDB = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        JRBMateriasInscriptas = new javax.swing.JRadioButton();
        JRBMateriasNoInscriptas = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTMaterias = new javax.swing.JTable();
        JBAnularInscripcionAlumno = new java.awt.Button();
        JBInscribirAlumno = new java.awt.Button();
        copyright = new java.awt.Button();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Universidad G8");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-car-accident-50.png"))); // NOI18N
        jLabel2.setText("Integrantes:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Lucas Teruel");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Santiago Lucero");

        JPAlumno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Alumno");

        javax.swing.GroupLayout contentAlumnoLayout = new javax.swing.GroupLayout(contentAlumno);
        contentAlumno.setLayout(contentAlumnoLayout);
        contentAlumnoLayout.setHorizontalGroup(
            contentAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        contentAlumnoLayout.setVerticalGroup(
            contentAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jlIconBuscarAlumID.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlIconBuscarAlumID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconBuscarAlumID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-búsqueda-50.png"))); // NOI18N

        jlIconListarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlIconListarAlum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconListarAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-buscar-en-la-lista-50.png"))); // NOI18N

        jlIconActualizarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlIconActualizarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconActualizarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-choose-50.png"))); // NOI18N

        jlIConGuardarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlIConGuardarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIConGuardarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-más-50.png"))); // NOI18N

        jlIconAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-contactos-50.png"))); // NOI18N

        JBBorrarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        JBBorrarAlumno.setLabel("Borrar Alumno");
        JBBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarAlumnoActionPerformed(evt);
            }
        });

        jbListarAlumnos.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jbListarAlumnos.setLabel("Listar Alumnos");
        jbListarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarAlumnosActionPerformed(evt);
            }
        });

        jbActualizarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jbActualizarAlumno.setLabel("Actualizar Datos");
        jbActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarAlumnoActionPerformed(evt);
            }
        });

        jbGuardarAlumno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jbGuardarAlumno.setLabel("Guardar Alumno");
        jbGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarAlumnoActionPerformed(evt);
            }
        });

        JBBuscarAlumnoPorID.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        JBBuscarAlumnoPorID.setLabel("Buscar Legajo");
        JBBuscarAlumnoPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarAlumnoPorIDActionPerformed(evt);
            }
        });

        jlIconBorrarAlum.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jlIconBorrarAlum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconBorrarAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-borrar-para-siempre-50.png"))); // NOI18N

        javax.swing.GroupLayout JPAlumnoLayout = new javax.swing.GroupLayout(JPAlumno);
        JPAlumno.setLayout(JPAlumnoLayout);
        JPAlumnoLayout.setHorizontalGroup(
            JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAlumnoLayout.createSequentialGroup()
                        .addComponent(contentAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPAlumnoLayout.createSequentialGroup()
                                .addComponent(jlIconBorrarAlum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBBorrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JPAlumnoLayout.createSequentialGroup()
                                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlIconListarAlum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlIconBuscarAlumID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbListarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBBuscarAlumnoPorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(JPAlumnoLayout.createSequentialGroup()
                                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlIConGuardarAlumno)
                                    .addComponent(jlIconActualizarAlumno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbGuardarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(JPAlumnoLayout.createSequentialGroup()
                        .addComponent(jlIconAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addContainerGap())
        );
        JPAlumnoLayout.setVerticalGroup(
            JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jlIconAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAlumnoLayout.createSequentialGroup()
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIConGuardarAlumno)
                            .addComponent(jbGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconActualizarAlumno)
                            .addComponent(jbActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconListarAlum)
                            .addComponent(jbListarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconBuscarAlumID)
                            .addComponent(JBBuscarAlumnoPorID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIconBorrarAlum)
                            .addComponent(JBBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(JPAlumnoLayout.createSequentialGroup()
                        .addComponent(contentAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addComponent(JPAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpOpciones.addTab("Alumnos", content);

        JPMaterias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Materia");

        javax.swing.GroupLayout contentMateriaLayout = new javax.swing.GroupLayout(contentMateria);
        contentMateria.setLayout(contentMateriaLayout);
        contentMateriaLayout.setHorizontalGroup(
            contentMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        contentMateriaLayout.setVerticalGroup(
            contentMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-abrir-carpeta-50.png"))); // NOI18N

        JBGuardarMateria.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        JBGuardarMateria.setLabel("Guardar Materia");
        JBGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarMateriaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-más-50.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-choose-50.png"))); // NOI18N

        BModificarMateria.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        BModificarMateria.setLabel("Modificar Materia");
        BModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarMateriaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-buscar-en-la-lista-50.png"))); // NOI18N

        BBuscarMateriaporID.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        BBuscarMateriaporID.setLabel("Buscar Materia por ID");
        BBuscarMateriaporID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarMateriaporIDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-borrar-para-siempre-50.png"))); // NOI18N

        BBorrarMateria.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        BBorrarMateria.setLabel("Borar Materia");
        BBorrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPMateriasLayout = new javax.swing.GroupLayout(JPMaterias);
        JPMaterias.setLayout(JPMateriasLayout);
        JPMateriasLayout.setHorizontalGroup(
            JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPMateriasLayout.createSequentialGroup()
                        .addComponent(contentMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPMateriasLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBGuardarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGroup(JPMateriasLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BModificarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGroup(JPMateriasLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarMateriaporID, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGroup(JPMateriasLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBorrarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                    .addGroup(JPMateriasLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        JPMateriasLayout.setVerticalGroup(
            JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPMateriasLayout.createSequentialGroup()
                        .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(JBGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BModificarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(BBuscarMateriaporID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(BBorrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jtpOpciones.addTab("Materias", JPMaterias);

        JpInscripciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel7.setText("Inscripcion");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-buscar-en-la-lista-50.png"))); // NOI18N

        JCBAlumnosDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBAlumnosDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAlumnosDBActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Seleccione un Alumno:");

        JRBMateriasInscriptas.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        JRBMateriasInscriptas.setText("Materias Inscriptas");
        JRBMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMateriasInscriptasActionPerformed(evt);
            }
        });

        JRBMateriasNoInscriptas.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        JRBMateriasNoInscriptas.setText("Materias no Inscriptas");
        JRBMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Listado Materias");

        JTMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTMaterias);

        JBAnularInscripcionAlumno.setLabel("Anular Inscripcion Alumno");

        JBInscribirAlumno.setLabel("Inscribir Alumno");
        JBInscribirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInscribirAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentInscripcionLayout = new javax.swing.GroupLayout(contentInscripcion);
        contentInscripcion.setLayout(contentInscripcionLayout);
        contentInscripcionLayout.setHorizontalGroup(
            contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentInscripcionLayout.createSequentialGroup()
                .addGroup(contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentInscripcionLayout.createSequentialGroup()
                        .addComponent(JRBMateriasInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JRBMateriasNoInscriptas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentInscripcionLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel17))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentInscripcionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentInscripcionLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBAlumnosDB, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentInscripcionLayout.createSequentialGroup()
                                .addComponent(JBInscribirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBAnularInscripcionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        contentInscripcionLayout.setVerticalGroup(
            contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBAlumnosDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addComponent(jLabel17)
                .addGroup(contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBMateriasInscriptas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JRBMateriasNoInscriptas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(contentInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentInscripcionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(JBAnularInscripcionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBInscribirAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpInscripcionesLayout = new javax.swing.GroupLayout(JpInscripciones);
        JpInscripciones.setLayout(JpInscripcionesLayout);
        JpInscripcionesLayout.setHorizontalGroup(
            JpInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpInscripcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JpInscripcionesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JpInscripcionesLayout.setVerticalGroup(
            JpInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpInscripcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(contentInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        jtpOpciones.addTab("Inscripciones", JpInscripciones);

        copyright.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        copyright.setLabel("Copyright");
        copyright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyrightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(copyright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nombre)
                .addGap(240, 240, 240)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void presentarVistasAlumno(javax.swing.JPanel p) {
        p.setSize(369, 353);
        p.setLocation(0, 0);
        contentAlumno.removeAll();
        contentAlumno.add(p, BorderLayout.CENTER);
        contentAlumno.revalidate();
        contentAlumno.repaint();
    }

    private void presentarvistasMateria(javax.swing.JPanel p) {
        p.setSize(369, 353);
        p.setLocation(0, 0);
        contentMateria.removeAll();
        contentMateria.add(p, BorderLayout.CENTER);
        contentMateria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentMateria.revalidate();
        contentMateria.repaint();
    }

    private void jBotonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCopyActionPerformed

    }//GEN-LAST:event_jBotonCopyActionPerformed

    private void JBGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarMateriaActionPerformed
        JPGuardarMateria a = new JPGuardarMateria();
        presentarvistasMateria(a);
    }//GEN-LAST:event_JBGuardarMateriaActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void jbActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarAlumnoActionPerformed
        JPModificarAlumno jp = new JPModificarAlumno();
        presentarVistasAlumno(jp);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbActualizarAlumnoActionPerformed

    private void jbGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarAlumnoActionPerformed
        JPGuardarAlumno jp = new JPGuardarAlumno();
        presentarVistasAlumno(jp);
    }//GEN-LAST:event_jbGuardarAlumnoActionPerformed

    private void copyrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyrightActionPerformed
        JOptionPane.showMessageDialog(null, "Por favor Apruebenos.");
    }//GEN-LAST:event_copyrightActionPerformed

    private void jbListarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarAlumnosActionPerformed
        JPListarAlumnos jp = new JPListarAlumnos();
        presentarVistasAlumno(jp);
    }//GEN-LAST:event_jbListarAlumnosActionPerformed

    private void JBBuscarAlumnoPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarAlumnoPorIDActionPerformed
        JPBuscarAlumnoPorID jp = new JPBuscarAlumnoPorID();
        presentarVistasAlumno(jp);    // TODO add your handling code here:
    }//GEN-LAST:event_JBBuscarAlumnoPorIDActionPerformed

    private void JBBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarAlumnoActionPerformed
        JPBorrarAlumno jp = new JPBorrarAlumno();
        presentarVistasAlumno(jp);// TODO add your handling code here:
    }//GEN-LAST:event_JBBorrarAlumnoActionPerformed

    private void JRBMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMateriasInscriptasActionPerformed
        JRBMateriasNoInscriptas.setSelected(false);
        JBAnularInscripcionAlumno.setEnabled(true);
        JBInscribirAlumno.setEnabled(false);
        cargarDatoInscriptas();
    }//GEN-LAST:event_JRBMateriasInscriptasActionPerformed

    private void JBInscribirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInscribirAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBInscribirAlumnoActionPerformed

    private void JRBMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMateriasNoInscriptasActionPerformed
        JRBMateriasInscriptas.setSelected(false);
        JBAnularInscripcionAlumno.setEnabled(false);
        JBInscribirAlumno.setEnabled(true);
        cargarDatoNoInscriptas();
    }//GEN-LAST:event_JRBMateriasNoInscriptasActionPerformed

    private void JCBAlumnosDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAlumnosDBActionPerformed

    }//GEN-LAST:event_JCBAlumnosDBActionPerformed

    private void BModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {
        JPModificarMateria a = new JPModificarMateria();
        presentarvistasMateria(a);
    }

    private void BBuscarMateriaporIDActionPerformed(java.awt.event.ActionEvent evt) {
        JPBuscarMateriaporID a = new JPBuscarMateriaporID();
        presentarvistasMateria(a);
    }

    private void BBorrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {
        JPBorrarMateria a = new JPBorrarMateria();
        presentarvistasMateria(a);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfIndex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfIndex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfIndex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfIndex.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BBorrarMateria;
    private java.awt.Button BBuscarMateriaporID;
    private java.awt.Button BModificarMateria;
    private java.awt.Button JBAnularInscripcionAlumno;
    private java.awt.Button JBBorrarAlumno;
    private java.awt.Button JBBuscarAlumnoPorID;
    private java.awt.Button JBGuardarMateria;
    private java.awt.Button JBInscribirAlumno;
    private javax.swing.JComboBox<String> JCBAlumnosDB;
    private javax.swing.JPanel JPAlumno;
    private javax.swing.JPanel JPMaterias;
    private javax.swing.JRadioButton JRBMateriasInscriptas;
    private javax.swing.JRadioButton JRBMateriasNoInscriptas;
    private javax.swing.JTable JTMaterias;
    private javax.swing.JPanel JpInscripciones;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel content;
    private javax.swing.JPanel contentAlumno;
    private javax.swing.JPanel contentInscripcion;
    private javax.swing.JPanel contentMateria;
    private java.awt.Button copyright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Button jbActualizarAlumno;
    private java.awt.Button jbGuardarAlumno;
    private java.awt.Button jbListarAlumnos;
    private javax.swing.JLabel jlIConGuardarAlumno;
    private javax.swing.JLabel jlIconActualizarAlumno;
    private javax.swing.JLabel jlIconAlumno;
    private javax.swing.JLabel jlIconBorrarAlum;
    private javax.swing.JLabel jlIconBuscarAlumID;
    private javax.swing.JLabel jlIconListarAlum;
    private javax.swing.JTabbedPane jtpOpciones;
    // End of variables declaration//GEN-END:variables
}
