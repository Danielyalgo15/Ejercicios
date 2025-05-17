/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacle;
import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Notificable> listaNotificaciones = new ArrayList<>();

    public void agregarNotificable(Notificable n) {
        listaNotificaciones.add(n);
    }

    public void notificarTodos() {
        for (Notificable n : listaNotificaciones) {
            n.enviarNotificacion();
        }
    }
}