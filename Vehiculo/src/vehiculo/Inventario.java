/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author latig
 */
public class Inventario {

    public static void gestionarVehiculo(Vehiculo v) {
        v.encender();

        switch (v) {
            case Coche c -> // Downcasting
                // Downcasting
                c.abrirMaletero();
            case Moto m -> m.hacerCaballito();
            case Camion cm -> cm.cargarMercancia();
            default -> {
            }
        }

        v.apagar();
    }
}