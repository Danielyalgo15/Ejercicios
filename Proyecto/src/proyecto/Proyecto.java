/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author latig
 */
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    protected String nombre;
    protected List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    // Clase interna
    public class Tarea {
        private String descripcion;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        @Override
        public String toString() {
            return "Tarea: " + descripcion;
        }
    }

    public void agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareas.add(tarea);
    }

    public void eliminarTarea(String descripcion) {
        tareas.removeIf(t -> t.getDescripcion().equals(descripcion));
    }

    public void listarTareas() {
        System.out.println("Tareas del proyecto " + nombre + ":");
        for (Tarea t : tareas) {
            System.out.println(" - " + t);
        }
    }
}