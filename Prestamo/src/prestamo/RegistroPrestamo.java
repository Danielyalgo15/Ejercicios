/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo;

/**
 *
 * @author latig
 */
import java.util.ArrayList;
import java.util.List;

public class RegistroPrestamo {
    private List<Prestamo> historial = new ArrayList<>();

    public void registrar(Prestamo item) {
        historial.add(item);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de préstamos:");
        for (Prestamo p : historial) {
            if (p instanceof ItemBiblioteca) {
                ItemBiblioteca i = (ItemBiblioteca) p;
                System.out.println(" - " + i.getDescripcion());
            }
        }
    }
}