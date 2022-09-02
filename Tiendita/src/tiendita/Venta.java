/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendita;

import java.time.LocalDate;

/**
 *
 * @author danie
 */
public class Venta {
    private int folio = -1, cantidad, codigopro;
    private LocalDate fecha;
    private String nombre;
    private double totalpro, precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Venta(int codigopro, String nombre, int cantidad, double precio) {
        folio = folio + 1;
        this.codigopro=codigopro;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
        this.totalpro=cantidad*precio;


    }

    public int getFolio() {
        return folio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigopro() {
        return codigopro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotalpro() {
        return totalpro;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;

    }

}
