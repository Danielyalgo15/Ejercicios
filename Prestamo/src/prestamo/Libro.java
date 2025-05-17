/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo;

/**
 *
 * @author latig
 */
public class Libro extends ItemBiblioteca implements Prestamo {
    private boolean prestado = false;

    public Libro(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado: " + getDescripcion());
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto: " + getDescripcion());
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }
}