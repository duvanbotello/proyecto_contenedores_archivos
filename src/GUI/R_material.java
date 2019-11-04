/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import Abstracciones.Abs_material;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public final class R_material extends javax.swing.JFrame {

    private final DefaultTableModel modelomaeriales = new DefaultTableModel();
    private TableRowSorter<TableModel> trs;

    /**
     * Creates new form R_material
     */
    public R_material() {
        
        initComponents();        
        this.setLocationRelativeTo(null);
        modelomaeriales.addColumn("ID");
        modelomaeriales.addColumn("NOMBRE");
        modelomaeriales.addColumn("TIPO");
        modelomaeriales.addColumn("EDITORIAL");
        modelomaeriales.addColumn("CANTIDAD");
        tbmateriales.setModel(modelomaeriales);
        Metodos.Metodos.icono_proyecto(this);
        cargar_tabla_materiales();
    }

    private void cargar_tabla_materiales() {
        modelomaeriales.setRowCount(0);
        Iterator<Abstracciones.Abs_material> buscar1 = Metodos.Metodos.lista_materiales.iterator();
        Object file[] = new Object[tbmateriales.getColumnCount()];
        for (Abs_material f : Metodos.Metodos.lista_materiales) {
            String tipo1 = "";
            f = buscar1.next();
            file[0] = f.getId_material();
            file[1] = f.getNombre();
            if (f.getTipo() == 1) {
                tipo1 = "Libro";
            }
            if (f.getTipo() == 2) {
                tipo1 = "Revista";
            }
            if (f.getTipo() == 3) {
                tipo1 = "Tesis";
            }
            file[2] = tipo1;
            file[3] = f.getEditorial();
            file[4] = f.getCantidad();
            modelomaeriales.addRow(file);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmateriales = new javax.swing.JTable();
        panel_buscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        txtbuscar_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panel_Datos = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txtnombre_m = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_editorial = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btm_nuevo = new javax.swing.JButton();
        btm_guardar = new javax.swing.JButton();
        btmmodificar = new javax.swing.JButton();
        cbm_tipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO DE MATERIALES - UNI PAMPLONA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbmateriales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbmateriales.setModel(new javax.swing.table.DefaultTableModel(
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
        tbmateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmaterialesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbmaterialesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbmateriales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 560, 110));

        panel_buscar.setBackground(new java.awt.Color(255, 255, 255));
        panel_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        panel_buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Material:");
        panel_buscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        txtbuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });
        panel_buscar.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));

        txtbuscar_id.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtbuscar_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbuscar_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscar_idKeyTyped(evt);
            }
        });
        panel_buscar.add(txtbuscar_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 140, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        panel_buscar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 20));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BUSCAR MATERIAL");
        panel_buscar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_buscar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        getContentPane().add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 560, 70));

        Panel_Datos.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        Panel_Datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 0, 0));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Datos.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, -1));

        txtnombre_m.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtnombre_m.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre_mKeyTyped(evt);
            }
        });
        Panel_Datos.add(txtnombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        Panel_Datos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");
        Panel_Datos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");
        Panel_Datos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 20));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Editorial:");
        Panel_Datos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 20));

        txt_editorial.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_editorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_editorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_editorialKeyTyped(evt);
            }
        });
        Panel_Datos.add(txt_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, -1));

        txt_cantidad.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });
        Panel_Datos.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 50, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cant:");
        Panel_Datos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 20));

        btm_nuevo.setBackground(new java.awt.Color(0, 0, 0));
        btm_nuevo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btm_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btm_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_nuevo.png"))); // NOI18N
        btm_nuevo.setText("Nuevo");
        btm_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_nuevoActionPerformed(evt);
            }
        });
        Panel_Datos.add(btm_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 40));

        btm_guardar.setBackground(new java.awt.Color(0, 0, 0));
        btm_guardar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btm_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btm_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar_icono.png"))); // NOI18N
        btm_guardar.setText("Guardar");
        btm_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_guardarActionPerformed(evt);
            }
        });
        Panel_Datos.add(btm_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, 40));

        btmmodificar.setBackground(new java.awt.Color(0, 0, 0));
        btmmodificar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btmmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btmmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar_icono.png"))); // NOI18N
        btmmodificar.setText("Modificar");
        btmmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmmodificarActionPerformed(evt);
            }
        });
        Panel_Datos.add(btmmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 40));

        cbm_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Libro", "Revista", "Tesis" }));
        cbm_tipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Datos.add(cbm_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 140, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Datos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 130));

        getContentPane().add(Panel_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 560, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_materiales.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_guardarActionPerformed
        if (!txtnombre_m.getText().isEmpty()) {
            if (cbm_tipo.getSelectedIndex() != 0) {
                if (!txt_editorial.getText().isEmpty()) {
                    if (!txt_cantidad.getText().isEmpty()) {
                        long id_material = Metodos.Metodos.lista_materiales.size() + 1;
                        String nombre_m = txtnombre_m.getText().trim();
                        int tipo = 0;
                        if (cbm_tipo.getSelectedIndex() == 1) {
                            tipo = 1;
                        }
                        if (cbm_tipo.getSelectedIndex() == 2) {
                            tipo = 2;
                        }
                        if (cbm_tipo.getSelectedIndex() == 3) {
                            tipo = 3;
                        }
                        String editorial = txt_editorial.getText().trim();
                        int cantidad = Integer.parseInt(txt_cantidad.getText().trim());

                        boolean existe = false;
                        //CONFIRMA SI LA ID YA EXISTE

                        Abstracciones.Abs_material d;
                        Iterator<Abstracciones.Abs_material> buscar = Metodos.Metodos.lista_materiales.iterator();
                        for (int i = 0; i < Metodos.Metodos.lista_materiales.size(); i++) {
                            d = buscar.next();
                            if (d.getId_material() == id_material) {
                                JOptionPane.showMessageDialog(null, "El material con id:" + " " + d.getId_material() + " YA EXISTE!!!");
                                existe = true;
                            }
                        }
                        //SI NO EXISTE REGISTRA
                        if (existe == false) {
                            Metodos.Metodos.InsertarMaterial(new Abstracciones.Abs_material(id_material, nombre_m, tipo, editorial, cantidad));
                            Metodos.Metodos.agregar_material_lista(new Abs_material(id_material, nombre_m, tipo, editorial, cantidad));
                            modelomaeriales.setRowCount(0);
                            //AGREGO LOS DATOS DEL CONTENEDOR A LA TABLA
                            Abs_material f;
                            Iterator<Abstracciones.Abs_material> buscar1 = Metodos.Metodos.lista_materiales.iterator();
                            Object file[] = new Object[tbmateriales.getColumnCount()];
                            for (int i = 0; i < Metodos.Metodos.lista_materiales.size(); i++) {
                                String tipo1 = "";
                                f = buscar1.next();
                                file[0] = f.getId_material();
                                file[1] = f.getNombre();
                                if (f.getTipo() == 1) {
                                    tipo1 = "Libro";
                                }
                                if (f.getTipo() == 2) {
                                    tipo1 = "Revista";
                                }
                                if (f.getTipo() == 3) {
                                    tipo1 = "Tesis";
                                }
                                file[2] = tipo1;
                                file[3] = f.getEditorial();
                                file[4] = f.getCantidad();
                                modelomaeriales.addRow(file);
                            }
                            txtnombre_m.setText("");
                            txt_editorial.setText("");
                            txt_cantidad.setText("");
                            cbm_tipo.setSelectedIndex(0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE CANTIDAD DISPOBILE DEL MATERIAL");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE EDITORIAL DE MATERIAL");
                }
            } else {
                JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE TIPO DE MATERIAL");
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE NOMBRE DEL MATERIAL");
        }
    }//GEN-LAST:event_btm_guardarActionPerformed

    private void txtnombre_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_mKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_guardar.doClick();
        }
    }//GEN-LAST:event_txtnombre_mKeyTyped

    private void txt_editorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_editorialKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_guardar.doClick();
        }
    }//GEN-LAST:event_txt_editorialKeyTyped

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_guardar.doClick();
        }
        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        //Para bucar dentro de la tabla      
        txtbuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtbuscar.getText(), 1));
            }

        });        
        trs = new TableRowSorter<>(tbmateriales.getModel());
        tbmateriales.setRowSorter(trs);

    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscar_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscar_idKeyTyped
        txtbuscar_id.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter(txtbuscar_id.getText(), 0));
            }

        });
        trs = new TableRowSorter<>(tbmateriales.getModel());
        tbmateriales.setRowSorter(trs);

    }//GEN-LAST:event_txtbuscar_idKeyTyped

    private void tbmaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmaterialesMouseClicked
        btm_guardar.setEnabled(false);
        int seleccion = tbmateriales.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(tbmateriales.getValueAt(seleccion, 0)));
        txtnombre_m.setText(String.valueOf(tbmateriales.getValueAt(seleccion, 1)));
        txt_editorial.setText(String.valueOf(tbmateriales.getValueAt(seleccion, 3)));
        txt_cantidad.setText(String.valueOf(tbmateriales.getValueAt(seleccion, 4)));
        cbm_tipo.setSelectedItem(String.valueOf(tbmateriales.getValueAt(seleccion, 2)));
    }//GEN-LAST:event_tbmaterialesMouseClicked

    private void tbmaterialesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmaterialesMousePressed


    }//GEN-LAST:event_tbmaterialesMousePressed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void btm_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_nuevoActionPerformed
        txtnombre_m.setText("");
        txt_id.setText("");
        txt_editorial.setText("");
        txt_cantidad.setText("");
        cbm_tipo.setSelectedIndex(0);
        btm_guardar.setEnabled(true);
    }//GEN-LAST:event_btm_nuevoActionPerformed

    private void btmmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmmodificarActionPerformed
        if(!txt_id.getText().isEmpty()){
             String botones[] = {"Modificar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Seguro que deseas Modificar?" + "\n ID: " + txt_id.getText() + "\n Nombre: " + txtnombre_m.getText()
                + "\n Tipo: " + cbm_tipo.getSelectedItem().toString() + "\n Editorial: " + txt_editorial.getText() + "\n Cantidad: " + txt_cantidad.getText(),
                "Advertencia", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(txt_id.getText());
            String nombre_m = txtnombre_m.getText();
            String editorial = txt_editorial.getText();
            int tipo = 0;
            if (cbm_tipo.getSelectedIndex() == 1) {
                tipo = 1;
            }
            if (cbm_tipo.getSelectedIndex() == 2) {
                tipo = 2;
            }
            if (cbm_tipo.getSelectedIndex() == 3) {
                tipo = 3;
            }
            int cantidad = Integer.parseInt(txt_cantidad.getText().trim());

            Iterator<Abs_material> buscar = Metodos.Metodos.lista_materiales.iterator();
            for (Abs_material n : Metodos.Metodos.lista_materiales) {
                n = buscar.next();
                if (id == n.getId_material()) {
                    n.setNombre(nombre_m);
                    n.setTipo(tipo);
                    n.setEditorial(editorial);
                    n.setCantidad(cantidad);
                    break;
                }
            }

            Metodos.Metodos.guarda_modificacion_materiales();
            cargar_tabla_materiales();
            JOptionPane.showMessageDialog(null, "MATERIAL MODIFICADO!!");
        }
        }else{
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE UN MATERIAL!!");
        }
        
       
    }//GEN-LAST:event_btmmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(R_material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R_material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R_material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R_material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R_material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JButton btm_guardar;
    private javax.swing.JButton btm_nuevo;
    private javax.swing.JButton btmmodificar;
    private javax.swing.JComboBox<String> cbm_tipo;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JTable tbmateriales;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar_id;
    private javax.swing.JTextField txtnombre_m;
    // End of variables declaration//GEN-END:variables
}