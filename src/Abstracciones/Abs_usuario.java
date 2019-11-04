/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;

/**
 *
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_usuario {
    private long id_usuario;
    private String nombre;
    private int rol;
    private int telefono;

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Abs_usuario(long id_usuario, String nombre, int rol, int telefono) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.rol = rol;
        this.telefono = telefono;
    }
    
    

}
