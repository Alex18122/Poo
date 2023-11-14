/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author gbeni
 */
public class Persona {

    public String nombre;

    public String sexo;

    private long id = 1232143;

    public Persona(String nombre) {

        this.nombre = nombre;

    }

    public Persona() {

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public long getId() {

        return id;

    }

    public void setId(long id) {

        this.id = id;

    }

    public String getSexo() {

        return sexo;

    }

    public void setSexo(String sexo) {

        this.sexo = sexo;

    }

}
