/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author latig
 */
public class ProyectoSoftware extends Proyecto {
    public ProyectoSoftware(String nombre) {
        super(nombre);
    }

    public void agregarTareaTecnica(String descripcion) {
        agregarTarea("Técnica: " + descripcion);
    }
}