/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancarias;

/**
 *
 * @author latig
 */
class CuentaCorriente extends CuentaBancaria {
    @Override
    public void calcularInteres() {
        System.out.println("Interés de Cuenta Corriente: 0%");
    }
}