/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Principal extends javax.swing.JFrame {
   
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        cargar();

    }
    private void cargar(){
       
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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

        ttelefono = new javax.swing.JTextField();
        pusuario = new javax.swing.JTextField();
        pnombre = new javax.swing.JTextField();
        ttipo = new javax.swing.JTextField();
        lbbienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_principal = new javax.swing.JMenuBar();
        Menu_Archivo = new javax.swing.JMenu();
        menu_item_cerrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_servicios = new javax.swing.JMenu();
        menu_item_prestamos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menu_item_devoluciones = new javax.swing.JMenuItem();
        menu_administracion = new javax.swing.JMenu();
        menu_item_registro_material = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_item_registro_usuarios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menu_item_reportes = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menu_item_registro_empleados = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA PRINCIPAL - MI PERFIL - BIBLIOTECA UNI PAMPLONA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ttelefono.setEditable(false);
        ttelefono.setBackground(new java.awt.Color(0, 102, 153));
        ttelefono.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ttelefono.setForeground(new java.awt.Color(255, 255, 255));
        ttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(ttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 170, 30));

        pusuario.setEditable(false);
        pusuario.setBackground(new java.awt.Color(0, 102, 153));
        pusuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pusuario.setForeground(new java.awt.Color(255, 255, 255));
        pusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(pusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 170, 30));

        pnombre.setEditable(false);
        pnombre.setBackground(new java.awt.Color(0, 102, 153));
        pnombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pnombre.setForeground(new java.awt.Color(255, 255, 255));
        pnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnombreActionPerformed(evt);
            }
        });
        getContentPane().add(pnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 170, 30));

        ttipo.setEditable(false);
        ttipo.setBackground(new java.awt.Color(0, 102, 153));
        ttipo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ttipo.setForeground(new java.awt.Color(255, 255, 255));
        ttipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttipoActionPerformed(evt);
            }
        });
        getContentPane().add(ttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 170, 30));

        lbbienvenida.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbbienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lbbienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbbienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 750, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/principal_fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        menu_principal.setBackground(new java.awt.Color(0, 0, 0));
        menu_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Menu_Archivo.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_archivo.png"))); // NOI18N
        Menu_Archivo.setText("Archivo");
        Menu_Archivo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Menu_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ArchivoActionPerformed(evt);
            }
        });

        menu_item_cerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menu_item_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_cerrar.setForeground(new java.awt.Color(255, 0, 0));
        menu_item_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_principal.png"))); // NOI18N
        menu_item_cerrar.setText("Cerrar Sesion");
        menu_item_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_cerrarActionPerformed(evt);
            }
        });
        Menu_Archivo.add(menu_item_cerrar);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Menu_Archivo.add(jSeparator1);

        menu_principal.add(Menu_Archivo);

        menu_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_libro.png"))); // NOI18N
        menu_servicios.setText("Servicios");
        menu_servicios.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        menu_item_prestamos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_prestamos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_llevar.png"))); // NOI18N
        menu_item_prestamos.setText("Prestamos");
        menu_item_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_prestamosActionPerformed(evt);
            }
        });
        menu_servicios.add(menu_item_prestamos);
        menu_servicios.add(jSeparator2);

        menu_item_devoluciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_devoluciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_devolver.png"))); // NOI18N
        menu_item_devoluciones.setText("Devoluciones");
        menu_item_devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_devolucionesActionPerformed(evt);
            }
        });
        menu_servicios.add(menu_item_devoluciones);

        menu_principal.add(menu_servicios);

        menu_administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_admin.png"))); // NOI18N
        menu_administracion.setText("Administracion");
        menu_administracion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        menu_item_registro_material.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_registro_material.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_registro_material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icino_agg_material.png"))); // NOI18N
        menu_item_registro_material.setText("Registrar Material");
        menu_item_registro_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_registro_materialActionPerformed(evt);
            }
        });
        menu_administracion.add(menu_item_registro_material);
        menu_administracion.add(jSeparator4);

        menu_item_registro_usuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_registro_usuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_registro_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_add_usuario.png"))); // NOI18N
        menu_item_registro_usuarios.setText("Registrar Usuario");
        menu_item_registro_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_registro_usuariosActionPerformed(evt);
            }
        });
        menu_administracion.add(menu_item_registro_usuarios);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        menu_administracion.add(jSeparator5);

        menu_item_reportes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_reportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar_icono.png"))); // NOI18N
        menu_item_reportes.setText("Reportes");
        menu_item_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_reportesActionPerformed(evt);
            }
        });
        menu_administracion.add(menu_item_reportes);
        menu_administracion.add(jSeparator6);

        menu_item_registro_empleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menu_item_registro_empleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menu_item_registro_empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_nuevo.png"))); // NOI18N
        menu_item_registro_empleados.setText("Registrar Empleados");
        menu_item_registro_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_registro_empleadosActionPerformed(evt);
            }
        });
        menu_administracion.add(menu_item_registro_empleados);
        menu_administracion.add(jSeparator7);

        menu_principal.add(menu_administracion);

        setJMenuBar(menu_principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttelefonoActionPerformed

    private void pusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pusuarioActionPerformed

    private void pnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnombreActionPerformed

    private void ttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttipoActionPerformed

    private void menu_item_registro_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_registro_usuariosActionPerformed
        R_usuario d = new R_usuario();
        d.setVisible(true);
    }//GEN-LAST:event_menu_item_registro_usuariosActionPerformed

    private void menu_item_registro_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_registro_empleadosActionPerformed
        R_empleados d = new R_empleados();
        d.setVisible(true);
    }//GEN-LAST:event_menu_item_registro_empleadosActionPerformed

    private void menu_item_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_cerrarActionPerformed
        this.dispose();
        Login d = new Login();
        d.setVisible(true);
    }//GEN-LAST:event_menu_item_cerrarActionPerformed

    private void menu_item_registro_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_registro_materialActionPerformed
        R_material f = new R_material();
        f.setVisible(true);
    }//GEN-LAST:event_menu_item_registro_materialActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void menu_item_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_prestamosActionPerformed
        R_prestamos d = new R_prestamos();
        d.setVisible(true);
    }//GEN-LAST:event_menu_item_prestamosActionPerformed

    private void menu_item_devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_devolucionesActionPerformed
       R_devoluciones d = new R_devoluciones();
       d.setVisible(true);
    }//GEN-LAST:event_menu_item_devolucionesActionPerformed

    private void menu_item_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_reportesActionPerformed
        FReportes D = new FReportes();
        D.setVisible(true);
    }//GEN-LAST:event_menu_item_reportesActionPerformed

    private void Menu_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ArchivoActionPerformed
       
    }//GEN-LAST:event_Menu_ArchivoActionPerformed
    private void cerrar() {
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea Cerrar la Aplicacion?", "Advertencia", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_Archivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    public static javax.swing.JLabel lbbienvenida;
    private javax.swing.JMenu menu_administracion;
    private javax.swing.JMenuItem menu_item_cerrar;
    private javax.swing.JMenuItem menu_item_devoluciones;
    private javax.swing.JMenuItem menu_item_prestamos;
    private javax.swing.JMenuItem menu_item_registro_empleados;
    private javax.swing.JMenuItem menu_item_registro_material;
    private javax.swing.JMenuItem menu_item_registro_usuarios;
    private javax.swing.JMenuItem menu_item_reportes;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JMenu menu_servicios;
    public static javax.swing.JTextField pnombre;
    public static javax.swing.JTextField pusuario;
    public static javax.swing.JTextField ttelefono;
    public static javax.swing.JTextField ttipo;
    // End of variables declaration//GEN-END:variables
}
