package Paciente;

import Conectar.Conectar;
import static Conectar.Conectar.sentencias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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

        String Titulos[] = new String[6];
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
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtxcedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        busnombre = new javax.swing.JButton();
        busfecha = new javax.swing.JButton();
        bustelefono = new javax.swing.JButton();
        buscorreo = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        buscan = new javax.swing.JButton();
        txttelefono = new javax.swing.JFormattedTextField();
        buscar_cedula = new javax.swing.JButton();
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
        jLabel8.setText("Cedula:");

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
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.Alignment.LEADING)))
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
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        txtxcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtxcedulaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Nacimiento: ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });

        busnombre.setBackground(new java.awt.Color(102, 102, 102));
        busnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        busnombre.setText("Buscar Nombre");
        busnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busnombreActionPerformed(evt);
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

        try {
            txttelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buscar_cedula.setBackground(new java.awt.Color(0, 204, 255));
        buscar_cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscar_cedula.setText("Buscar Cedula");
        buscar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_cedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(correo)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(118, 118, 118)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(nombre))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtxcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar_cedula)
                            .addComponent(bustelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(busnombre)
                            .addComponent(buscorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busfecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscan))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtxcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_cedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(busnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(busfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bustelefono)
                    .addComponent(buscan)
                    .addComponent(buscorreo))
                .addGap(18, 18, 18))
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
                        .addGap(61, 61, 61)
                        .addComponent(verdatos)
                        .addGap(33, 33, 33)
                        .addComponent(cancelar)
                        .addGap(37, 37, 37)
                        .addComponent(filtrar))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel6))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verdatos)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtro", filtro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busnombreActionPerformed
        prueba.setNombre(this.nombre.getText());
        conec.conectar();
        prueba.Read_Nombre();
    }//GEN-LAST:event_busnombreActionPerformed

    private void busfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busfechaActionPerformed
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        prueba.setFechaNacimiento(date.format(this.fecha.getDate()));
        conec.conectar();
        prueba.Read_Fecha();
    }//GEN-LAST:event_busfechaActionPerformed

    private void bustelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustelefonoActionPerformed
        prueba.setTelefono(this.txttelefono.getText());
        conec.conectar();
        prueba.Read_Telefono();
    }//GEN-LAST:event_bustelefonoActionPerformed

    private void buscorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscorreoActionPerformed
        prueba.setCorreo(this.correo.getText());
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
            String Titulos[] = {"ID", "Cedula", "NombreCompleto", "FechaNacimiento", "Telefono", "CorreoElectronico"};
            paciente = new DefaultTableModel(null, Titulos);

            String fila[] = new String[6];
            rs.beforeFirst();
            while (rs.next()) {

                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("Cedula");
                fila[2] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fecha = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[3] = fecha;
                fila[4] = rs.getString("Telefono");
                fila[5] = rs.getString("CorreoElectronico");
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

        filtrar_pacientes.setSize(480, 210);
        filtrar_pacientes.setModal(true);
        filtrar_pacientes.setVisible(true);
    }//GEN-LAST:event_filtrarActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        filtrar_pacientes.dispose();
    }//GEN-LAST:event_canActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String cedula, nombre, fecha;
        String sql;
        int contador = 0;

        try {

            cedula = txtcedula.getText();
            nombre = txtnombre.getText();

            // Contruccion de la consulta sql select
            sql = "SELECT * FROM pacientes";

            if (!cedula.equals("")) {
                contador++;
                sql += " WHERE Cedula LIKE '%" + cedula + "%'";
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
            String encabezado[] = {"ID", "Cedula", "NombreCompleto", "FechaNacimiento", "Telefono", "CorreoElectronico"};
            paciente = new DefaultTableModel(null, encabezado);

            String fila[] = new String[6];
            rs.beforeFirst();
            while (rs.next()) {
                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("Cedula");
                fila[2] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fila[3] = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[4] = rs.getString("Telefono");
                fila[5] = rs.getString("CorreoElectronico");
                paciente.addRow(fila);
            }
            tabla.setModel(paciente);
        } catch (Exception ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_aceptarActionPerformed

    private void buscar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_cedulaActionPerformed
        prueba.setCedula(Integer.parseInt(this.txtxcedula.getText()));
        conec.conectar();
        prueba.Read_Cedula();
    }//GEN-LAST:event_buscar_cedulaActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if (txtnombre.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void txtxcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxcedulaKeyTyped
        if (txtxcedula.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtxcedulaKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        if (correo.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_correoKeyTyped

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
    private javax.swing.JButton buscar_cedula;
    private javax.swing.JButton buscorreo;
    private javax.swing.JButton busfecha;
    private javax.swing.JButton busnombre;
    private javax.swing.JButton bustelefono;
    private javax.swing.JButton can;
    private javax.swing.JButton cancelar;
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
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JFormattedTextField txttelefono;
    private javax.swing.JTextField txtxcedula;
    private javax.swing.JButton verdatos;
    // End of variables declaration//GEN-END:variables
}
