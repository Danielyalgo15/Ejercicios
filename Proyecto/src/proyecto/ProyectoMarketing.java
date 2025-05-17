/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author latig
 */
public class ProyectoMarketing extends Proyecto {
    public ProyectoMarketing(String nombre) {
        super(nombre);
    }

    public void agregarTareaCreativa(String descripcion) {
        agregarTarea("Creativa: " + descripcion);
    }
}