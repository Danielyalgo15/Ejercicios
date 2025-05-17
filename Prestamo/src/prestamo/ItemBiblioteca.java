/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamo;

/**
 *
 * @author latig
 */
public class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public ItemBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getDescripcion() {
        return titulo + " por " + autor + " (" + anioPublicacion + ")";
    }
}
