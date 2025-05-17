/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import cuentabancarias.CuentaBancaria;
/**
 *
 * @author latig
 */
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico
        CuentaBancarias[] cuentas = new CuentaBancaria[3];

        cuentas[0] = new CuentaCorriente();
        cuentas[1] = new CuentaAhorro();
        cuentas[2] = new CuentaInversion();

        // Ejecutamos operaciones sobre cada cuenta
        for (CuentaBancaria cuenta : cuentas) {
            cuenta.depositar();
            cuenta.retirar();
            cuenta.calcularInteres(); // Polimorfismo en acción
            System.out.println("------------");
        }
    }
}