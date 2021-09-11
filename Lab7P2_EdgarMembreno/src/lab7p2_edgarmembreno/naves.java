/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_edgarmembreno;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author edgarmembreno
 */
public class naves implements Serializable {

    private String nombre;
    private String identificador;
    private int personasMax;
    private int despegue;
    private int aterrizaje;
    private int velocidad;
    private int distanciaMax;
    private int combustible;
    private int reserva;
    private ArrayList<astronautas> astronautas = new ArrayList();
    private ArrayList<destino> destino = new ArrayList();
   

    private static final long SerialVersionUID = 777L;

    public naves(String nombre, String identificador, int personasMax, int despegue, int aterrizaje, int velocidad, int distanciaMax, int combustible, int reserva) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.personasMax = personasMax;
        this.despegue = despegue;
        this.aterrizaje = aterrizaje;
        this.velocidad = velocidad;
        this.distanciaMax = distanciaMax;
        this.combustible = combustible;
        this.reserva = reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPersonasMax() {
        return personasMax;
    }

    public void setPersonasMax(int personasMax) {
        this.personasMax = personasMax;
    }

    public int getDespegue() {
        return despegue;
    }

    public void setDespegue(int despegue) {
        this.despegue = despegue;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDistanciaMax() {
        return distanciaMax;
    }

    public void setDistanciaMax(int distanciaMax) {
        this.distanciaMax = distanciaMax;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public ArrayList<astronautas> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<astronautas> astronautas) {
        this.astronautas = astronautas;
    }

    public ArrayList<destino> getDestino() {
        return destino;
    }

    public void setDestino(ArrayList<destino> destino) {
        this.destino = destino;
    }
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", identificador=" + identificador + ", personasMax=" + personasMax + ", despegue=" + despegue + ", aterrizaje=" + aterrizaje + ", velocidad=" + velocidad + ", distanciaMax=" + distanciaMax + ", combustible=" + combustible + ", reserva=" + reserva;
    }

}
