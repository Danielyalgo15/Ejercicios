/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo;

/**
 *
 * @author latig
 */
public class DVD extends ItemBiblioteca implements Prestamo {
    private boolean prestado = false;

    public DVD(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void prestar() {
        prestado = true;
        System.out.println("DVD prestado: " + getDescripcion());
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("DVD devuelto: " + getDescripcion());
    }
}