/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author cass465
 */
public class Vehiculo {

    private String tipo;
    private String placa;
    private String marca;
    private String linea;
    private String cilindraje;
    private short modelo;

    public Vehiculo(String tipo, String placa, String marca, String linea, String cilindraje, short modelo) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public short getModelo() {
        return modelo;
    }

    public void setModelo(short modelo) {
        this.modelo = modelo;
    }
}
