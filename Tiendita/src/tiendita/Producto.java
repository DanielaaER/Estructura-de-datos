/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendita;

/**
 *
 * @author danie
 */
public class Producto {
    private int folio=-1;
    private String nombre;
    private double precio;
    
    public Producto(int folio, String nombre, double precio){
    this.folio=folio;
    this.nombre=nombre;
    this.precio=precio;
}
    public int getFolio() {
        return folio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
