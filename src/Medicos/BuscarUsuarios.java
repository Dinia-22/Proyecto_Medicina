/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicos;

/**
 *
 * @author juan1
 */
public class BuscarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form BuscarUsuarios
     */
    public BuscarUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcedula1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jnombre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jfecha1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtelefono1 = new javax.swing.JTextField();
        jcorreo1 = new javax.swing.JTextField();
        jcodigo1 = new javax.swing.JTextField();
        jespecialidad1 = new javax.swing.JTextField();
        jsalario1 = new javax.swing.JTextField();
        btncedula = new javax.swing.JButton();
        btnnombre = new javax.swing.JButton();
        btntelefono = new javax.swing.JButton();
        btnnacimiento = new javax.swing.JButton();
        btncorreo = new javax.swing.JButton();
        btncodigo = new javax.swing.JButton();
        btnespecialidad = new javax.swing.JButton();
        btnsalario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingrese sus Datos");
        setLocation(new java.awt.Point(380, 170));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcedula1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Numero Cedula:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Nacimiento:");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Codigo Colegio Medicos:");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Especialidad:");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Salario:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jtelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtelefono1ActionPerformed(evt);
            }
        });

        btncedula.setBackground(new java.awt.Color(102, 102, 102));
        btncedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btncedula.setText("Cedula");
        btncedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncedulaActionPerformed(evt);
            }
        });

        btnnombre.setBackground(new java.awt.Color(0, 204, 255));
        btnnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnnombre.setText("Nombre");
        btnnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnombreActionPerformed(evt);
            }
        });

        btntelefono.setBackground(new java.awt.Color(102, 102, 102));
        btntelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btntelefono.setText("Telefono");
        btntelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntelefonoActionPerformed(evt);
            }
        });

        btnnacimiento.setBackground(new java.awt.Color(0, 204, 255));
        btnnacimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnnacimiento.setText("Fecha Nacimiento");
        btnnacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnacimientoActionPerformed(evt);
            }
        });

        btncorreo.setBackground(new java.awt.Color(102, 102, 102));
        btncorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btncorreo.setText("Correo");
        btncorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncorreoActionPerformed(evt);
            }
        });

        btncodigo.setBackground(new java.awt.Color(0, 204, 255));
        btncodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btncodigo.setText("Codigo");
        btncodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncodigoActionPerformed(evt);
            }
        });

        btnespecialidad.setBackground(new java.awt.Color(102, 102, 102));
        btnespecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnespecialidad.setText("Especialidad");
        btnespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnespecialidadActionPerformed(evt);
            }
        });

        btnsalario.setBackground(new java.awt.Color(0, 204, 255));
        btnsalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnsalario.setText("Salario");
        btnsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(btnnacimiento)
                        .addGap(27, 27, 27)
                        .addComponent(btncorreo)
                        .addGap(43, 43, 43)
                        .addComponent(btnsalario)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jcedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(26, 26, 26)
                                                .addComponent(jcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jsalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(78, 78, 78)
                                                    .addComponent(jcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btncedula)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jespecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnnombre)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btntelefono)))
                                        .addGap(28, 28, 28)
                                        .addComponent(btncodigo)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnespecialidad)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jespecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jsalario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncodigo)
                    .addComponent(btnespecialidad)
                    .addComponent(btnnombre)
                    .addComponent(btncedula)
                    .addComponent(btntelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnacimiento)
                    .addComponent(btncorreo)
                    .addComponent(btnsalario)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcedula1ActionPerformed

    private void jtelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtelefono1ActionPerformed

    private void btncedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncedulaActionPerformed
        // TODO add your handling code here:
        //Buscar Cedula:
        Medicos Mbuscar = new Medicos();
        Mbuscar.ID = this.jcedula1;
        Mbuscar.conectar();
        Mbuscar.readCedula();
    }//GEN-LAST:event_btncedulaActionPerformed

    private void btnnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnombreActionPerformed
        // TODO add your handling code here:
        //Buscar Nombre:
        Medicos Mbuscar = new Medicos();
        Mbuscar.Nombre = this.jnombre1;
        Mbuscar.conectar();
        Mbuscar.readNombre();
    }//GEN-LAST:event_btnnombreActionPerformed

    private void btntelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntelefonoActionPerformed
        // TODO add your handling code here:
        //Buscar Telefono:
        Medicos Mbuscar = new Medicos();
        Mbuscar.tel = this.jtelefono1;
        Mbuscar.conectar();
        Mbuscar.readTel();
    }//GEN-LAST:event_btntelefonoActionPerformed

    private void btnnacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnacimientoActionPerformed
        // TODO add your handling code here:
        //Buscar Nacimiento:
        Medicos Mbuscar = new Medicos();
        Mbuscar.FechaNacimiento = this.jfecha1;
        Mbuscar.conectar();
        Mbuscar.readDate();
    }//GEN-LAST:event_btnnacimientoActionPerformed

    private void btncorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncorreoActionPerformed
        // TODO add your handling code here:
        //Buscar Correo:

        Medicos Mbuscar = new Medicos();
        Mbuscar.correo = this.jcorreo1;
        Mbuscar.conectar();
        Mbuscar.readCorreo();
    }//GEN-LAST:event_btncorreoActionPerformed

    private void btncodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncodigoActionPerformed
        // TODO add your handling code here:
        //Buscar Codigo:
        Medicos Mbuscar = new Medicos();
        Mbuscar.Codigo = this.jcodigo1;
        Mbuscar.conectar();
        Mbuscar.readCodigo();
    }//GEN-LAST:event_btncodigoActionPerformed

    private void btnespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnespecialidadActionPerformed
        // TODO add your handling code here:
        //Buscar Especialidad:
        Medicos Mbuscar = new Medicos();
        Mbuscar.especialidad = this.jespecialidad1;
        Mbuscar.conectar();
        Mbuscar.readEspecialidad();
    }//GEN-LAST:event_btnespecialidadActionPerformed

    private void btnsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalarioActionPerformed
        // TODO add your handling code here:
        //Buscar Salario:
        Medicos Mbuscar = new Medicos();
        Mbuscar.salario = this.jsalario1;
        Mbuscar.conectar();
        Mbuscar.readSalario();
    }//GEN-LAST:event_btnsalarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btncedula;
    private javax.swing.JButton btncodigo;
    private javax.swing.JButton btncorreo;
    private javax.swing.JButton btnespecialidad;
    private javax.swing.JButton btnnacimiento;
    private javax.swing.JButton btnnombre;
    private javax.swing.JButton btnsalario;
    private javax.swing.JButton btntelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcedula1;
    private javax.swing.JTextField jcodigo1;
    private javax.swing.JTextField jcorreo1;
    private javax.swing.JTextField jespecialidad1;
    private com.toedter.calendar.JDateChooser jfecha1;
    private javax.swing.JTextField jnombre1;
    private javax.swing.JTextField jsalario1;
    private javax.swing.JTextField jtelefono1;
    // End of variables declaration//GEN-END:variables
}
