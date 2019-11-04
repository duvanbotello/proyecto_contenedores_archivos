/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;

/**
 *
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_deudores {
    private long id_prestamo;
    private long id_usuario;
    private long id_material;
    private int dias_atraso;
    private String dedua;

      
    public long getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(long id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public long getId_material() {
        return id_material;
    }

    public void setId_material(long id_material) {
        this.id_material = id_material;
    }

    public int getDias_atraso() {
        return dias_atraso;
    }

    public void setDias_atraso(int dias_atraso) {
        this.dias_atraso = dias_atraso;
    }

    public String getDedua() {
        return dedua;
    }

    public void setDedua(String dedua) {
        this.dedua = dedua;
    }

       
    public Abs_deudores(long id_prestamo, long id_usuario, long id_material, int dias_atraso, String dedua) {
        this.id_prestamo = id_prestamo;
        this.id_usuario = id_usuario;
        this.id_material = id_material;
        this.dias_atraso = dias_atraso;
        this.dedua = dedua;
    }
    
    

}
