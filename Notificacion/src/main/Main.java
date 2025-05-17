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
        Notificador notificador = new Notificador();

        notificador.agregarNotificable(new CorreoElectronico());
        notificador.agregarNotificable(new SMS());
        notificador.agregarNotificable(new PushNotification());

        // Clase anónima 1
        notificador.agregarNotificable(new Notificable() {
            @Override
            public void enviarNotificacion() {
                System.out.println("Enviando notificación desde clase anónima A.");
            }
        });

        // Clase anónima 2
        notificador.agregarNotificable(new Notificable() {
            @Override
            public void enviarNotificacion() {
                System.out.println("Enviando notificación desde clase anónima B.");
            }
        });

        notificador.notificarTodos();
    }
}