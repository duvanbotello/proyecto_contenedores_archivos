/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;



import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
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
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_alumnos_x_semestre {
    private long codigo_alumno;
    private int semestre_actual;
    public static LinkedList<Abs_alumnos_x_semestre> lista_alumnos_x_semestre = new LinkedList<>();
    public static File Fichero_Alumnos = new File("src/Archivos_Planos/RAlumnos_x_semestre.txt");
    private static final String link_reportes = "/Reportes/logon.jpg";
    
    public static void generar_reporte_alumnos() {
        try {
            JasperReport jp = (JasperReport) JRLoader.loadObject(new FileInputStream("src/Reportes/Rlista_Alumnos.jasper"));
            @SuppressWarnings("unchecked")
            Map<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", parametros.getClass().getResourceAsStream(link_reportes));  
            JasperPrint prin = JasperFillManager.fillReport(jp, parametros, new JRBeanCollectionDataSource(lista_alumnos_x_semestre));
            JasperViewer.viewReport(prin, false);

        } catch (FileNotFoundException | JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void crer_txtAlumnos_semestre() {
        try {
            if (!Fichero_Alumnos.exists()) {
                Fichero_Alumnos.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero Alumnos Creado");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void add_lista_alumnos(Abs_alumnos_x_semestre x) {
        lista_alumnos_x_semestre.add(x);
    }
    
    public static void Insertar_Empleado(Abs_alumnos_x_semestre r) {
        try {
            BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Fichero_Alumnos, true), "utf-8"));
            escribir.write(r.getCodigo_alumno()+"\t"+r.getSemestre_actual()+ "\r\n");
            JOptionPane.showMessageDialog(null, "Alumno creado con exito");
            escribir.close();

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void CargarLista_Alumnos() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(Fichero_Alumnos));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");                
                long Codigo = Long.parseLong(mistokens.nextToken().trim());
                int semestre = Integer.parseInt(mistokens.nextToken().trim());
                //guardo los datos en un contenedor
                lista_alumnos_x_semestre.add(new Abs_alumnos_x_semestre(Codigo, semestre));
            }
            leerfichero.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public long getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(long codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public int getSemestre_actual() {
        return semestre_actual;
    }

    public void setSemestre_actual(int semestre_actual) {
        this.semestre_actual = semestre_actual;
    }

    public Abs_alumnos_x_semestre(long codigo_alumno, int semestre_actual) {
        this.codigo_alumno = codigo_alumno;
        this.semestre_actual = semestre_actual;
    }
        

}
