/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancarias;

/**
 *
 * @author latig
 */
abstract class CuentaBancaria {
    public void depositar() {
        System.out.println("Depositar dinero");
    }

    public void retirar() {
        System.out.println("Retirar dinero");
    }

    public abstract void calcularInteres();
}