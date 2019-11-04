/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import Abstracciones.Abs_alumnos_x_semestre;
import Abstracciones.Abs_usuario;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class R_usuario extends javax.swing.JFrame {

    String semestre;

    /**
     * Creates new form R_usuario
     */
    public R_usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Metodos.Metodos.icono_proyecto(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbmrol = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        btmregistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO DE USUARIO - BIBLIOTECA UNIPAMPLONA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 70, -1, 30));

        txtdocumento.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtdocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdocumentoKeyTyped(evt);
            }
        });
        getContentPane().add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 180, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, 30));

        txttelefono.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 180, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Nombres:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, 30));

        cbmrol.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cbmrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Estudiante", "Profesor", "Externo" }));
        cbmrol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmrol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbmrolMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbmrolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbmrolMouseEntered(evt);
            }
        });
        cbmrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmrolActionPerformed(evt);
            }
        });
        cbmrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbmrolKeyTyped(evt);
            }
        });
        getContentPane().add(cbmrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 180, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Rol:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 30));

        txtnombres.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtnombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 30));

        btmregistrar.setBackground(new java.awt.Color(0, 0, 0));
        btmregistrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btmregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btmregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_registrar.png"))); // NOI18N
        btmregistrar.setText("Registrar");
        btmregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btmregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 20, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 20, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reg_usu_fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmregistrarActionPerformed
        //COMPRUEBO QUE TODOS LOS CAMPOS ESTEN LLENOS
        if (!txtdocumento.getText().isEmpty()) {
            if (!txtnombres.getText().isEmpty()) {
                if (cbmrol.getSelectedIndex() != 0) {
                    if (!txttelefono.getText().isEmpty()) {

                        try {

                            //COVIERTO LO QUE ESTA DENTRO DE LOS TEXTOS EN SUS RESPECTIVOS VALORES
                            long documento = Long.parseLong(txtdocumento.getText().trim());
                            String nombre = txtnombres.getText();
                            int rol = 0;
                            if (cbmrol.getSelectedIndex() == 1) {
                                rol = 1; //si es 1 es Estudiante
                            }
                            if (cbmrol.getSelectedIndex() == 2) {
                                rol = 2; //si es 2 es profesor
                            }
                            if (cbmrol.getSelectedIndex() == 3) {
                                rol = 3; //si es 3 es externo
                            }
                            int telefono = Integer.parseInt(txttelefono.getText().trim());
                            //COMPRUEBO SI YA EXISTE EL USUARIO
                            boolean existe = false;
                            Abs_usuario b;
                            Iterator<Abs_usuario> buscar = Metodos.Metodos.Lista_usuarios.iterator();
                            for (int i = 0; i < Metodos.Metodos.Lista_usuarios.size(); i++) {
                                b = buscar.next();
                                if (b.getId_usuario() == documento) {
                                    existe = true;
                                    JOptionPane.showMessageDialog(null, "Usuario: " + b.getId_usuario() + " Ya existe" + "\n" + "Nombre: " + b.getNombre());
                                }
                            }
                            if (existe == false) {
                                //SI NO EXISTE LOS CREO
                                if (cbmrol.getSelectedIndex() == 1) {
                                    Metodos.Metodos.InsertarUsuario(new Abs_usuario(documento, nombre, rol, telefono));
                                    Metodos.Metodos.guardar_usuario_c(new Abs_usuario(documento, nombre, rol, telefono));
                                    Abstracciones.Abs_alumnos_x_semestre.Insertar_Empleado(new Abs_alumnos_x_semestre(documento, Integer.parseInt(semestre)));
                                    Abs_alumnos_x_semestre.add_lista_alumnos(new Abs_alumnos_x_semestre(documento, Integer.parseInt(semestre)));
                                    txtdocumento.setText("");
                                    txtnombres.setText("");
                                    txttelefono.setText("");
                                    cbmrol.setSelectedIndex(0);
                                } else if (cbmrol.getSelectedIndex() != 1) {
                                    Metodos.Metodos.InsertarUsuario(new Abs_usuario(documento, nombre, rol, telefono));
                                    Metodos.Metodos.guardar_usuario_c(new Abs_usuario(documento, nombre, rol, telefono));
                                    txtdocumento.setText("");
                                    txtnombres.setText("");
                                    txttelefono.setText("");
                                    cbmrol.setSelectedIndex(0);
                                }

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR, REVISE LOS CAMPOS");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE TELEFONO");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE ROL");
                }
            } else {
                JOptionPane.showMessageDialog(null, "POR FAVOR INGRESAR NOMBRE");
            }

        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESAR DOCUMENTO");
        }


    }//GEN-LAST:event_btmregistrarActionPerformed

    private void cbmrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmrolActionPerformed
        String pizzas[] = {"Seleccione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",};
        if (cbmrol.getSelectedIndex() == 1) {

            while (true) {
                semestre = (String) JOptionPane.showInputDialog(null, "Que semestre esta el estudiante", "Ingrese",
                        JOptionPane.WARNING_MESSAGE, null, pizzas, pizzas[0]);
                if (!semestre.equals("Seleccione")) {
                    break;
                }
            }
            System.out.println(semestre);

        }
    }//GEN-LAST:event_cbmrolActionPerformed

    private void txtdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocumentoKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btmregistrar.doClick();
        }

        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txtdocumentoKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btmregistrar.doClick();
        }

        if (Character.isDigit(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR LETRAS EN EL CAMPO");
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btmregistrar.doClick();
        }
        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void cbmrolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmrolMouseClicked

    }//GEN-LAST:event_cbmrolMouseClicked

    private void cbmrolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbmrolKeyTyped

    }//GEN-LAST:event_cbmrolKeyTyped

    private void cbmrolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmrolMousePressed

    }//GEN-LAST:event_cbmrolMousePressed

    private void cbmrolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmrolMouseEntered

    }//GEN-LAST:event_cbmrolMouseEntered

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
            java.util.logging.Logger.getLogger(R_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmregistrar;
    private javax.swing.JComboBox<String> cbmrol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}