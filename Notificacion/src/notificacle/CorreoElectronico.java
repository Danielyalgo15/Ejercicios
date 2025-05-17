/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacle;

/**
 *
 * @author latig
 */
public class CorreoElectronico implements Notificable {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por correo");
    }
}