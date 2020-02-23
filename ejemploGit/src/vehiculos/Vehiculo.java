/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 * Clase Vehiculo que crea los vehiculos de la aplicacion
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Vehiculo {

    /**
     * Variable que asigna el tipo del vehiculo creado
     */
    private String tipo;
    
    /**
     * Variable que asigna la placa del vehiculo creado
     */
    private String placa;
    
    /**
     * Variable que asigna la marca del vehiculo creado
     */
    private String marca;
    
    /**
     * Variable que asigna la linea del vehiculo creado
     */
    private String linea;
    
    /**
     * Variable que asigna el cilindraje del vehiculo creado
     */
    private String cilindraje;
    
    /**
     * Variable que asigna el modelo del vehiculo creado
     */
    private short modelo;

    /**
     * Constructor de la clase
     * @param tipo
     * @param placa
     * @param marca
     * @param linea
     * @param cilindraje
     * @param modelo 
     */
    public Vehiculo(String tipo, String placa, String marca, String linea, String cilindraje, short modelo) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }

    /**
     * Obtiene variable tipo
     * @return tipo de vehiculo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece tipo al vehiculo
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene variable placa
     * @return placa del vehiculo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece placa al vehiculo
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene variable marca
     * @return marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece marca al vehiculo
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene variable linea
     * @return linea del vehiculo
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece linea al vehiculo
     * @param linea 
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene variable cilindraje
     * @return cilindraje del vehiculo
     */
    public String getCilindraje() {
        return cilindraje;
    }

    /**
     * Establece cilindraje al vehiculo
     * @param cilindraje 
     */
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Obtiene variable modelo
     * @return modelo del vehiculo
     */
    public short getModelo() {
        return modelo;
    }

    /**
     * Establece modelo al vehiculo
     * @param modelo 
     */
    public void setModelo(short modelo) {
        this.modelo = modelo;
    }
}
