/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Conectar.Conectar;
import static Conectar.Conectar.sentencias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarUsuarios extends javax.swing.JFrame {

    Usuario prueba = new Usuario();
    Conectar conec = new Conectar();
    DefaultTableModel usuario;

    /**
     * Creates new form BuscarUsuarios
     */
    public BuscarUsuarios() {
        initComponents();
        configurarTabla();
    }

    public void configurarTabla() {

        String Titulos[] = new String[8];
        usuario = new DefaultTableModel(null, Titulos);
        tabla.setModel(usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Filtrar_Usuarios = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        gaurdar_usuario = new javax.swing.JButton();
        cancelar_usuario = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtU = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        nom = new javax.swing.JButton();
        Usuario = new javax.swing.JButton();
        correo = new javax.swing.JButton();
        tel = new javax.swing.JButton();
        fecha = new javax.swing.JButton();
        tipo = new javax.swing.JButton();
        calce = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        buscedula = new javax.swing.JButton();
        filtro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        buscar_filtro = new javax.swing.JButton();
        verdatos = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText("Filtrar Usuario");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("ID:");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setText("Nombre Completo:");

        gaurdar_usuario.setBackground(new java.awt.Color(102, 102, 102));
        gaurdar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        gaurdar_usuario.setText("Guardar");
        gaurdar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaurdar_usuarioActionPerformed(evt);
            }
        });

        cancelar_usuario.setBackground(new java.awt.Color(0, 204, 255));
        cancelar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        cancelar_usuario.setText("Cancelar");
        cancelar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_usuarioActionPerformed(evt);
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
                                .addContainerGap()
                                .addComponent(jLabel11))
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(gaurdar_usuario)
                        .addGap(50, 50, 50)
                        .addComponent(cancelar_usuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gaurdar_usuario)
                    .addComponent(cancelar_usuario))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout Filtrar_UsuariosLayout = new javax.swing.GroupLayout(Filtrar_Usuarios.getContentPane());
        Filtrar_Usuarios.getContentPane().setLayout(Filtrar_UsuariosLayout);
        Filtrar_UsuariosLayout.setHorizontalGroup(
            Filtrar_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Filtrar_UsuariosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Filtrar_UsuariosLayout.setVerticalGroup(
            Filtrar_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Informacion");
        setLocation(new java.awt.Point(330, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Correo");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de Usuario");

        nom.setBackground(new java.awt.Color(102, 102, 102));
        nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        nom.setText("Buscar Nombre");
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        Usuario.setBackground(new java.awt.Color(0, 204, 255));
        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Usuario.setText("Buscar Usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        correo.setBackground(new java.awt.Color(102, 102, 102));
        correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        correo.setText("Buscar Correo");
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        tel.setBackground(new java.awt.Color(0, 204, 255));
        tel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        tel.setText("Buscar Telefono");
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        fecha.setBackground(new java.awt.Color(0, 204, 255));
        fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        fecha.setText("Buscar Fecha");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        tipo.setBackground(new java.awt.Color(102, 102, 102));
        tipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        tipo.setText("Buscar Tipo");
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        calce.setBackground(new java.awt.Color(102, 102, 102));
        calce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        calce.setText("Cancelar");
        calce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calceActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/job.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Cedula");

        buscedula.setBackground(new java.awt.Color(102, 102, 102));
        buscedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscedula.setText("Buscar Cedula");
        buscedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscedulaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom)
                            .addComponent(Usuario))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(fecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tel)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correo)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(buscedula))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtU)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(txtcedula)
                                    .addComponent(txtCorreo)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(61, 61, 61)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(calce)
                                .addGap(21, 21, 21)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(correo)
                    .addComponent(tel)
                    .addComponent(tipo))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(calce)
                    .addComponent(Usuario)
                    .addComponent(buscedula))
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

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Datos Base de Datos");

        buscar_filtro.setBackground(new java.awt.Color(102, 102, 102));
        buscar_filtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscar_filtro.setText("Buscar Filtro");
        buscar_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_filtroActionPerformed(evt);
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
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(237, 237, 237))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(filtroLayout.createSequentialGroup()
                                .addComponent(verdatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar_filtro)
                                .addGap(172, 172, 172)
                                .addComponent(cancelar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verdatos))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtro", filtro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        prueba.setTxtNombre(this.txtnombre.getText());
        conec.conectar();
        prueba.readNombre();
    }//GEN-LAST:event_nomActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        prueba.setNomUsuario(this.txtU.getText());
        conec.conectar();
        prueba.readUsuario();
    }//GEN-LAST:event_UsuarioActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        prueba.setTxtCorreo(this.txtCorreo.getText());
        conec.conectar();
        prueba.readCorreo();
    }//GEN-LAST:event_correoActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        prueba.setTxtTel(this.txtTel.getText());
        conec.conectar();
        prueba.readTel();
    }//GEN-LAST:event_telActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        Usuario prueba = new Usuario();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        prueba.setFechaNacimiento(dt.format(this.txtFecha.getDate()));
        conec.conectar();
        prueba.readFecha();
    }//GEN-LAST:event_fechaActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        prueba.setTipo(this.txtUsuario.getText());
        conec.conectar();
        prueba.readTipo();
    }//GEN-LAST:event_tipoActionPerformed

    private void calceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calceActionPerformed
        this.dispose();
    }//GEN-LAST:event_calceActionPerformed

    private void verdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdatosActionPerformed
        conec.conectar();
        String fecha;
        try {
            ResultSet rs = sentencias.executeQuery("SELECT * FROM usuarios");
            String Titulos[] = {"ID", "NombreCompleto", "FechaNacimiento", "Telefono", "CorreoElectronico", "NombredeUsuario", "Contraseña", "TipodeUsuario"};
            usuario = new DefaultTableModel(null, Titulos);

            String fila[] = new String[8];
            rs.beforeFirst();
            while (rs.next()) {

                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fecha = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[2] = fecha;
                fila[3] = rs.getString("Telefono");
                fila[4] = rs.getString("CorreoElectronico");
                fila[5] = rs.getString("NombredeUsuario");
                fila[6] = rs.getString("Contraseña");
                fila[7] = rs.getString("TipodeUsuario");
                usuario.addRow(fila);
            }
            tabla.setModel(usuario);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error al extraer datos de la tabla");
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verdatosActionPerformed

    private void buscedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscedulaActionPerformed
        prueba.setId(Integer.parseInt(this.txtid.getText()));
        conec.conectar();
        prueba.Read_Cedula();
    }//GEN-LAST:event_buscedulaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void gaurdar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaurdar_usuarioActionPerformed
        String id, nombre, fecha;
        String sql;
        int contador = 0;

        try {

            id = txtid.getText();
            nombre = txtnombre.getText();

            // Contruccion de la consulta sql select
            sql = "SELECT * FROM usuarios";

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
            String encabezado[] = {"ID", "NombreCompleto", "FechaNacimiento", "Telefono", "CorreoElectronico", "NombredeUsuario", "Contraseña", "TipodeUsuario"};
            usuario = new DefaultTableModel(null, encabezado);

            String fila[] = new String[8];
            rs.beforeFirst();
            while (rs.next()) {
                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCompleto");
                fecha = rs.getString("FechaNacimiento");
                fila[2] = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                fila[3] = rs.getString("Telefono");
                fila[4] = rs.getString("CorreoElectronico");
                fila[5] = rs.getString("NombredeUsuario");
                fila[6] = rs.getString("Contraseña");
                fila[7] = rs.getString("TipodeUsuario");
                usuario.addRow(fila);
            }
            tabla.setModel(usuario);
        } catch (Exception ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gaurdar_usuarioActionPerformed

    private void buscar_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_filtroActionPerformed
        Filtrar_Usuarios.setSize(350, 230);
        Filtrar_Usuarios.setModal(true);
        Filtrar_Usuarios.setVisible(true);
    }//GEN-LAST:event_buscar_filtroActionPerformed

    private void cancelar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_usuarioActionPerformed
        Filtrar_Usuarios.dispose();
    }//GEN-LAST:event_cancelar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Filtrar_Usuarios;
    private javax.swing.JButton Usuario;
    private javax.swing.JButton buscar_filtro;
    private javax.swing.JButton buscedula;
    private javax.swing.JButton calce;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar_usuario;
    private javax.swing.JButton correo;
    private javax.swing.JButton fecha;
    private javax.swing.JPanel filtro;
    private javax.swing.JButton gaurdar_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton nom;
    private javax.swing.JTable tabla;
    private javax.swing.JButton tel;
    private javax.swing.JButton tipo;
    private javax.swing.JTextField txtCorreo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JButton verdatos;
    // End of variables declaration//GEN-END:variables
}
