/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_edgarmembreno;

import java.io.Serializable;

/**
 *
 * @author edgarmembreno
 */
public class astronautas implements Serializable {

    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String titulo;
    private String contextura;
    private String peso;
    private String misones;

    private static final long SerialVersionUID = 555L;

    public astronautas(int id, String nombre, String apellido, String nacionalidad, String titulo, String contextura, String peso, String misones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso = peso;
        this.misones = misones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMisones() {
        return misones;
    }

    public void setMisones(String misones) {
        this.misones = misones;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", titulo=" + titulo + ", contextura=" + contextura + ", peso=" + peso + ", misones=" + misones ;
    }
    

}
