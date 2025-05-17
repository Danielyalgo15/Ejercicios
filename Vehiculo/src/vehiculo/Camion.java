/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author latig
 */
public class Camion extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Camión encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("Camión apagado.");
    }

    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión.");
    }
}