/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author latig
 */
import java.util.List;

public class Nomina {
    public static double procesarNomina(List<Empleado> empleados) {
        double total = 0;
        for (Empleado e : empleados) {
            double salario = e.calcularSalario();  // polimorfismo
            System.out.println(e.nombre + ": $" + salario);
            total += salario;
        }
        System.out.println("Total a pagar en nómina: $" + total);
        return total;
    }
}