/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package Abstracciones;

import java.util.Date;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_devoluciones {

    private long id_devolucion;
    private long id_usuario;
    private long id_material;
    private Date fecha_devolucion;

    public long getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(long id_devolucion) {
        this.id_devolucion = id_devolucion;
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

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Abs_devoluciones(long id_devolucion, long id_usuario, long id_material, Date fecha_devolucion) {
        this.id_devolucion = id_devolucion;
        this.id_usuario = id_usuario;
        this.id_material = id_material;
        this.fecha_devolucion = fecha_devolucion;
    }

}
