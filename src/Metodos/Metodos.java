/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package Metodos;

import Abstracciones.*;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Metodos {

  

     private static final String link_reportes = "/Reportes/logon.jpg";
    /**
     * METODOS////////////////////////
     *
     * @param a
     */
    public static void imagen_fondo(JLabel a) {
        ImageIcon imagen = new ImageIcon("src/Imagenes/resize-img.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
        a.setIcon(icono);
    }

    public static Date sumarDiasAFecha(Date fecha, int dias) {
        if (dias == 0) {
            return fecha;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();

//Calendar.MILISECOND – milisegundos
//Calendar.SECOND – segundos
//Calendar.MINUTE – minutos
//Calendar.HOUR – horas
//Calendar.DAY_OF_YEAR – días
//Calendar.MONTH – meses
//Calendar.YEAR – años
    }

    public static int diferencia_dias_fecha(Date fechaFinal, Date fechaInicial) {
        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
        return dias;
    }

    public static void icono_proyecto(JFrame x) {
        ImageIcon icono = new ImageIcon("src/Imagenes/icono_principal.png");
        x.setIconImage(icono.getImage());

    }

    public static void Crear_Archivos() {
        try {
            //SI EL FICHERO NO EXISTE LO CREA.
            if (!FicheroRegistroUsuario.exists()) {
                FicheroRegistroUsuario.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero de usuarios Creado");
            }
            if (!fichero_materiales.exists()) {
                fichero_materiales.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero de materiales Creado");
            }
            if (!fichero_prestamos.exists()) {
                fichero_prestamos.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero de materiales Creado");
            }
            if (!fichero_devoluciones.exists()) {
                fichero_devoluciones.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero de devoluciones Creado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * METODOS DE REGISTRAR USUARIOS
     *
     */
    public static File FicheroRegistroUsuario = new File("src/Archivos_Planos/Rusuario.txt");
    public static LinkedList<Abs_usuario> Lista_usuarios = new LinkedList<>();

    public static void guardar_usuario_c(Abs_usuario x) {
        Lista_usuarios.add(x);
    }

    public static void generar_reporte_usuarios() {
        try {
            JasperReport jp = (JasperReport) JRLoader.loadObject(new FileInputStream("src/Reportes/Rlista_Usuarios.jasper"));
            @SuppressWarnings("unchecked")
            Map<String,Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", parametros.getClass().getResourceAsStream(link_reportes));  
            JasperPrint prin = JasperFillManager.fillReport(jp, parametros, new JRBeanCollectionDataSource(Lista_usuarios));
            JasperViewer.viewReport(prin, false);

        } catch (FileNotFoundException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void InsertarUsuario(Abs_usuario r) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FicheroRegistroUsuario, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO        
            Fescribe.write(r.getId_usuario() + "\t" + r.getNombre() + "\t" + r.getRol() + "\t" + r.getTelefono() + "\r\n");
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            //SE CIERRA 
            Fescribe.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void CargarLista_Usuarios() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(FicheroRegistroUsuario));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                String documento = mistokens.nextToken().trim();
                String nombre = mistokens.nextToken().trim();
                String rol = mistokens.nextToken().trim();
                String telefono = mistokens.nextToken().trim();
                int tele = Integer.parseInt(telefono);
                long doc = Long.parseLong(documento);
                int rol1 = Integer.parseInt(rol);
                //guardo los datos en un contenedor
                Lista_usuarios.add(new Abs_usuario(doc, nombre, rol1, tele));
            }
            leerfichero.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * METODOS DE REGISTRAR MATERIALES
     */
    public static LinkedList<Abs_material> lista_materiales = new LinkedList<>();
    public static File fichero_materiales = new File("src/Archivos_Planos/Rmaterial.txt");

    public static void agregar_material_lista(Abs_material x) {
        lista_materiales.add(x);
    }

    public static void generar_reporte_materiales() {
        try {
            JasperReport jp = (JasperReport) JRLoader.loadObject(new FileInputStream("src/Reportes/Rlista_materiales.jasper"));
            @SuppressWarnings("unchecked")
            Map<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", parametros.getClass().getResourceAsStream(link_reportes));  
            JasperPrint prin = JasperFillManager.fillReport(jp, parametros, new JRBeanCollectionDataSource(lista_materiales));
            JasperViewer.viewReport(prin, false);

        } catch (FileNotFoundException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void InsertarMaterial(Abs_material r) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_materiales, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO        
            Fescribe.write(r.getId_material() + "\t" + r.getNombre() + "\t" + r.getTipo() + "\t" + r.getEditorial() + "\t" + r.getCantidad() + "\r\n");
            JOptionPane.showMessageDialog(null, "MATERIAL REGISTRADO!!!!");
            //SE CIERRA 
            Fescribe.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void CargarLista_Materiales() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_materiales));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                long id_material = Long.parseLong(mistokens.nextToken().trim());
                String nombre_m = mistokens.nextToken().trim();
                int tipo = Integer.parseInt(mistokens.nextToken().trim());
                String editorial = mistokens.nextToken().trim();
                int cantidad = Integer.parseInt(mistokens.nextToken().trim());

                //guardo los datos en un contenedor
                lista_materiales.add(new Abs_material(id_material, nombre_m, tipo, editorial, cantidad));
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void guarda_modificacion_materiales() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_materiales));
            for (Abs_material n : lista_materiales) {
                bw.write(n.getId_material() + "\t" + n.getNombre() + "\t" + n.getTipo() + "\t" + n.getEditorial() + "\t" + n.getCantidad() + "\r\n");
            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * METODOS DE PRESTAMOS
     */
    public static File fichero_prestamos = new File("src/Archivos_Planos/Rprestamo.txt");
    public static LinkedList<Abs_prestamo> lista_prestamo = new LinkedList<>();

    public static void agregar_prestamo_lista(Abs_prestamo x) {
        lista_prestamo.add(x);
    }

    public static void generar_reporte_prestamos() {
        try {
            JasperReport jp = (JasperReport) JRLoader.loadObject(new FileInputStream("src/Reportes/Rlista_prestamos.jasper"));
            @SuppressWarnings("unchecked")
            Map<String,Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", parametros.getClass().getResourceAsStream(link_reportes));  
            JasperPrint prin = JasperFillManager.fillReport(jp, parametros, new JRBeanCollectionDataSource(lista_prestamo));
            JasperViewer.viewReport(prin, false);

        } catch (FileNotFoundException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void guarda_modificacion_prestamos() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_prestamos));
            for (Abs_prestamo n : lista_prestamo) {
                String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(n.getFecha_prestamo());
                String fecha2 = new SimpleDateFormat("dd/MM/yyyy").format(n.getFecha_entrega());
                bw.write(n.getId_prestamo() + "\t" + n.getId_usuario() + "\t" + n.getId_material()
                        + "\t" + fecha1 + "\t" + fecha2 + "\t" + n.getEstado() + "\r\n");
            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void InsertarPrestamo(Abs_prestamo r) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_prestamos, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO
            String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(r.getFecha_prestamo());
            String fecha2 = new SimpleDateFormat("dd/MM/yyyy").format(r.getFecha_entrega());
            Fescribe.write(r.getId_prestamo() + "\t" + r.getId_usuario() + "\t" + r.getId_material() + "\t" + fecha1 + "\t" + fecha2 + "\t" + r.getEstado() + "\r\n");
            JOptionPane.showMessageDialog(null, "PRESTAMO REGISTRADO!!!!");
            //SE CIERRA 
            Fescribe.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void CargarLista_prestamos() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_prestamos));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                long id_prestamo = Long.parseLong(mistokens.nextToken().trim());
                long id_usuario = Long.parseLong(mistokens.nextToken().trim());
                long id_material = Long.parseLong(mistokens.nextToken().trim());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formato.parse(mistokens.nextToken().trim());
                Date fecha2 = formato.parse(mistokens.nextToken().trim());
                String estado = mistokens.nextToken().trim();

                //guardo los datos en un contenedor
                lista_prestamo.add(new Abs_prestamo(id_prestamo, id_usuario, id_material, fecha, fecha2, estado));
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * METODOS DE DEVOLUCIONES
     */
    public static File fichero_devoluciones = new File("src/Archivos_Planos/Rdevoluciones.txt");
    public static LinkedList<Abs_devoluciones> lista_devoluciones = new LinkedList<>();

    public static void agregar_devolucion_lista(Abs_devoluciones x) {
        lista_devoluciones.add(x);
    }
 
    public static void generar_reporte_devoluciones() {
        try {
            
            JasperReport jp = (JasperReport) JRLoader.loadObject(new FileInputStream("src/Reportes/Rlista_devoluciones.jasper"));
            @SuppressWarnings("unchecked")
            Map<String,Object> parametros = new HashMap();
            parametros.clear();
            parametros.put((String)"logo", (Object)parametros.getClass().getResourceAsStream(link_reportes));                     
            JasperPrint prin = JasperFillManager.fillReport(jp, parametros, new JRBeanCollectionDataSource(lista_devoluciones));
            JasperViewer.viewReport(prin, false);
            
        } catch (FileNotFoundException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void InsertarDevolucion(Abs_devoluciones r) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_devoluciones, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO
            String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(r.getFecha_devolucion());
            Fescribe.write(r.getId_devolucion() + "\t" + r.getId_usuario() + "\t" + r.getId_material() + "\t" + fecha1 + "\r\n");
            JOptionPane.showMessageDialog(null, "DEVOLUCION REGISTRADA!!!!");
            //SE CIERRA 
            Fescribe.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void CargarLista_Devoluciones() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_devoluciones));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                long id_devolucion = Long.parseLong(mistokens.nextToken().trim());
                long id_usuario = Long.parseLong(mistokens.nextToken().trim());
                long id_material = Long.parseLong(mistokens.nextToken().trim());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formato.parse(mistokens.nextToken().trim());
                //guardo los datos en un contenedor
                lista_devoluciones.add(new Abs_devoluciones(id_devolucion, id_usuario, id_material, fecha));
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
