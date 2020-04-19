package Paciente;

import Conectar.Conectar;
import static Conectar.Conectar.sentencias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmBuscar extends javax.swing.JFrame {

    Paciente prueba = new Paciente();
    Conectar conec = new Conectar();
    DefaultTableModel paciente;

    /**
     * Creates new form FrmBuscar
     */
    public FrmBuscar() {
        initComponents();
        configurarTabla();
    }

    public void configurarTabla() {

        String Titulos[] = new String[5];
        paciente = new DefaultTableModel(null, Titulos);
        tabla.setModel(paciente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtrar_pacientes = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        can = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        busnombre = new javax.swing.JButton();
        buscedula = new javax.swing.JButton();
        busfecha = new javax.swing.JButton();
        bustelefono = new javax.swing.JButton();
        buscorreo = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        buscan = new javax.swing.JButton();
        filtro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        filtrar = new javax.swing.JButton();
        verdatos = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Filtrar Pacientes");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("ID:");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Nombre Completo:");

        aceptar.setBackground(new java.awt.Color(102, 102, 102));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        aceptar.setText("Guardar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        can.setBackground(new java.awt.Color(0, 204, 255));
        can.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        can.setText("Cancelar");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(60, 60, 60))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(154, 154, 154)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(aceptar)
                        .addGap(89, 89, 89)
                        .addComponent(can)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can)
                    .addComponent(aceptar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout filtrar_pacientesLayout = new javax.swing.GroupLayout(filtrar_pacientes.getContentPane());
        filtrar_pacientes.getContentPane().setLayout(filtrar_pacientesLayout);
        filtrar_pacientesLayout.setHorizontalGroup(
            filtrar_pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        filtrar_pacientesLayout.setVerticalGroup(
            filtrar_pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingrese sus Datos");
        setLocation(new java.awt.Point(435, 180));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Nacimiento: ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        busnombre.setBackground(new java.awt.Color(102, 102, 102));
        busnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        busnombre.setText("Buscar Nombre");
        busnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busnombreActionPerformed(evt);
            }
        });

        buscedula.setBackground(new java.awt.Color(102, 102, 102));
        buscedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscedula.setText("Buscar Cedula");
        buscedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscedulaActionPerformed(evt);
            }
        });

        busfecha.setBackground(new java.awt.Color(0, 204, 255));
        busfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        busfecha.setText("Buscar Fecha");
        busfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busfechaActionPerformed(evt);
            }
        });

        bustelefono.setBackground(new java.awt.Color(102, 102, 102));
        bustelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        bustelefono.setText("Buscar Telefono");
        bustelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bustelefonoActionPerformed(evt);
            }
        });

        buscorreo.setBackground(new java.awt.Color(0, 204, 255));
        buscorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscorreo.setText("Buscar Correo");
        buscorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscorreoActionPerformed(evt);
            }
        });

        buscan.setBackground(new java.awt.Color(102, 102, 102));
        buscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscan.setText("Cancelar");
        buscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono)
                            .addComponent(correo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(cedula)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(busnombre)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buscedula)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(buscan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(busfecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bustelefono)))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busnombre)
                    .addComponent(bustelefono)
                    .addComponent(busfecha))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscedula)
                    .addComponent(buscorreo)
                    .addComponent(buscan))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel1);

        filtro.setBackground(new java.awt.Color(204, 204, 204));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Datos Base de Datos");

        filtrar.setBackground(new java.awt.Color(102, 102, 102));
        filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        filtrar.setText("Buscar Filtro");
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });

        verdatos.setBackground(new java.awt.Color(102, 102, 102));
        verdatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/binoculars.png"))); // NOI18N
        verdatos.setText("Ver Datos");
        verdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdatosActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 204, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
        filtro.setLayout(filtroLayout);
        filtroLayout.setHorizontalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel6))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(filtroLayout.createSequentialGroup()
                                .addComponent(verdatos)
                                .addGap(63, 63, 63)
                                .addComponent(cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(filtrar)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verdatos)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Filtro", filtro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busnombreActionPerformed
        prueba.Nombre = this.nombre;
        conec.conectar();
        prueba.Read_Nombre();
    }//GEN-LAST:event_busnombreActionPerformed

    private void buscedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscedulaActionPerformed
        Paciente prueba = new Paciente();
        prueba.ID = this.cedula;
        conec.conectar();
        prueba.Read_Cedula();
    }//GEN-LAST:event_buscedulaActionPerformed

    private void busfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busfechaActionPerformed
        Paciente prueba = new Paciente();
        prueba.FechaNacimiento = this.fecha;
        conec.conectar();
        prueba.Read_Fecha();
    }//GEN-LAST:event_busfechaActionPerformed

    private void bustelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustelefonoActionPerformed
        Paciente prueba = new Paciente();
        prueba.Telefono = this.telefono;
        conec.conectar();
        prueba.Read_Telefono();
    }//GEN-LAST:event_bustelefonoActionPerformed

    private void buscorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscorreoActionPerformed
        Paciente prueba = new Paciente();
        prueba.correo = this.correo;
        conec.conectar();
        prueba.Read_Correo();
    }//GEN-LAST:event_buscorreoActionPerformed

    private void buscanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscanActionPerformed
        this.dispose();
    }//GEN-LAST:event_buscanActionPerformed

    private void verdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdatosActionPerformed
        conec.conectar();
        String fecha;
        try {
            ResultSet rs = sentencias.executeQuery("SELECT * FROM pacientes");
            String Titulos[] = {"ID", "NombreCompleto", "FechaNacimiento", "Telefono", "CorreoElectronico"};
            paciente = new DefaultTableModel(null, Titulos);

            String fila[] = new String[5];
            rs.beforeFirst();
            while (rs.next()) {

                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fecha = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[2] = fecha;
                fila[3] = rs.getString("Telefono");
                fila[4] = rs.getString("CorreoElectronico");
                paciente.addRow(fila);
            }
            tabla.setModel(paciente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al extraer datos de la tabla");
            //Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verdatosActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed

        filtrar_pacientes.setSize(480,210);
        filtrar_pacientes.setModal(true);
        filtrar_pacientes.setVisible(true);
    }//GEN-LAST:event_filtrarActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        filtrar_pacientes.dispose();
    }//GEN-LAST:event_canActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String id, nombre,fecha;
        String sql;
        int contador = 0;
        
        try {

            id = txtid.getText();
            nombre = txtnombre.getText();
            
            // Contruccion de la consulta sql select
            sql = "SELECT * FROM pacientes";
            
            if (!id.equals("")) {
                contador++;
                sql += " WHERE ID LIKE '%" + id + "%'";
            }
            
            if (!nombre.equals("")) {
                contador++;
                if (contador == 1) {
                    sql += " WHERE NombreCompleto LIKE '%" + nombre + "%'";
                } else {
                    sql += " AND NombreCompleto LIKE '%" + nombre + "%'";
                }
            }

            ResultSet rs = sentencias.executeQuery(sql);
            String encabezado[] = {"ID", "NombreCompleto","FechaNacimiento","Telefono","CorreoElectronico"};
            paciente = new DefaultTableModel(null, encabezado);

            String fila[] = new String[5];
            rs.beforeFirst();
            while (rs.next()) {
                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fila[2] = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[3] = rs.getString("Telefono");
                fila[4] = rs.getString("CorreoElectronico");
                paciente.addRow(fila);
            }
            tabla.setModel(paciente);
        } catch (Exception ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton buscan;
    private javax.swing.JButton buscedula;
    private javax.swing.JButton buscorreo;
    private javax.swing.JButton busfecha;
    private javax.swing.JButton busnombre;
    private javax.swing.JButton bustelefono;
    private javax.swing.JButton can;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton filtrar;
    private javax.swing.JDialog filtrar_pacientes;
    private javax.swing.JPanel filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JButton verdatos;
    // End of variables declaration//GEN-END:variables
}
