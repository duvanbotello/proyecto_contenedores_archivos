/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package Abstracciones;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_Empleado extends Abs_usuario {

    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Abs_Empleado(String contraseña, long id_usuario, String nombre, int rol, int telefono) {
        super(id_usuario, nombre, rol, telefono);
        this.contraseña = contraseña;
    }

    /**
     * METODOS DE REGISTRAR Empleados
     */
    public static LinkedList<Abs_Empleado> lista_rempleados = new LinkedList<>();
    public static File Fichero_Empleados = new File("src/Archivos_Planos/Rempleados.txt");

    public static void crer_txtempleados() {
        try {
            if (!Fichero_Empleados.exists()) {
                Fichero_Empleados.createNewFile();
                JOptionPane.showMessageDialog(null, "Fichero Empleado Creado");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void add_listaempleados(Abs_Empleado x) {
        lista_rempleados.add(x);
    }

    public static void Insertar_Empleado(Abs_Empleado r) {
        try {
            BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Fichero_Empleados, true), "utf-8"));
            escribir.write(r.getContraseña() +"\t"+r.getId_usuario() + "\t" + r.getNombre() + "\t" + r.getRol() + "\t" + r.getTelefono() + "\r\n");
            JOptionPane.showMessageDialog(null, "Empelado creado con exito");
            escribir.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
     public static void CargarLista_Empleados() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(Fichero_Empleados));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                String contraseña = mistokens.nextToken().trim();
                String documento = mistokens.nextToken().trim();
                String nombre = mistokens.nextToken().trim();
                String rol = mistokens.nextToken().trim();
                String telefono = mistokens.nextToken().trim();
                int tele = Integer.parseInt(telefono);
                long doc = Long.parseLong(documento);
                int rol1 = Integer.parseInt(rol);
                //guardo los datos en un contenedor
                lista_rempleados.add(new Abs_Empleado(contraseña, doc, nombre, rol1, tele));
            }
            leerfichero.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
