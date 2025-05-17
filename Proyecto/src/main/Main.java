/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author latig
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Proyecto> proyectos = new ArrayList<>();

        ProyectoSoftware ps = new ProyectoSoftware("Sistema ERP");
        ProyectoMarketing pm = new ProyectoMarketing("Campaña Primavera");

        ps.agregarTarea("Revisión de requisitos");
        ps.agregarTareaTecnica("Implementar backend");

        pm.agregarTarea("Estudio de mercado");
        pm.agregarTareaCreativa("Diseño de slogan");

        proyectos.add(ps);
        proyectos.add(pm);

        for (Proyecto p : proyectos) {
            p.listarTareas();
            System.out.println();
        }
    }
}