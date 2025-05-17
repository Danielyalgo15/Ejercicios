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
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Ana", 5000));
        empleados.add(new Desarrollador("Luis", 4000));
        empleados.add(new Diseñador("Carla", 3500));

        Nomina.procesarNomina(empleados);
    }
}