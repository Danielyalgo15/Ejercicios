/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author latig
 */
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        Revista revista1 = new Revista("National Geographic", "Varios", 2021);
        DVD dvd1 = new DVD("Interstellar", "Christopher Nolan", 2014);

        RegistroPrestamo registro = new RegistroPrestamo();

        libro1.prestar();
        registro.registrar(libro1);

        revista1.prestar();
        registro.registrar(revista1);

        dvd1.prestar();
        registro.registrar(dvd1);

        libro1.devolver();
        dvd1.devolver();

        registro.mostrarHistorial();
    }
}