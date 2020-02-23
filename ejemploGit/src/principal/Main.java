/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import vehiculos.Vehiculo;

/**
 * Clase principal del proyecto
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Main {

    /**
     * Metodo principal donde se ejecuta el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1 = new Vehiculo("Tracto camión", "XVV254", "INTERNATIONAL", "DT-4300", "8000", (short)2007);
    }
    
}
