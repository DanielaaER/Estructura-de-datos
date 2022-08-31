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
    private int folio=-1, cantidad, codigopro;
    private LocalDate fecha;
    private String nombre;
    private double totalpro, totalven;

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

    public double getTotalven() {
        return totalven;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigopro(int codigopro) {
        this.codigopro = codigopro;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTotalpro(double totalpro) {
        this.totalpro = totalpro;
    }

    public void setTotalven(double totalven) {
        this.totalven = totalven;
    }
    
}
