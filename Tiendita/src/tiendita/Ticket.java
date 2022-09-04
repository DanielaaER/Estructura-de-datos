/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendita;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Ticket {

    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    private int folio, cantidad;
    private LocalDateTime fecha;
    private double total;

    public int getCantidad(){
        return cantidad;
    }
    public double getTotal() {
        int i;
        total = 0;
        for (i = 0; i < folio; i++) {
            total = total + ventas.get(i).getTotalpro();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void guardarProducto(Venta temporal) {
            fecha = LocalDateTime.now();
        
        folio = folio + 1;
        ventas.add(temporal);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public int getFolio() {
        return folio;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void linea(int x) {
        int i;
        for (i = 0; i < x; i++) {
            System.out.print("-");
        }
    }

    public void imprimeTicket() {
        int i;
        linea(28);
        
        System.out.print(" TICKET DE COMPRA No. " + getCantidad() + " ");
        linea(28);
        System.out.println("");
        linea(80);
        System.out.println("");
        System.out.println("Fecha: " + fecha);
        System.out.println(Menu.formatoT("CODIGO", "NOMBRE", "CANTIDAD", "PRECIO", "TOTAL"));
        for (i = 0; i < folio; i++) {
            System.out.println(Menu.formatoT(String.valueOf(ventas.get(i).getCodigopro() + 1),
                    ventas.get(i).getNombre(), String.valueOf(ventas.get(i).getCantidad()),
                    String.valueOf(ventas.get(i).getPrecio()), String.valueOf(ventas.get(i).getTotalpro())));
        }
        System.out.println("");
        String dato = "TOTAL A PAGAR";
        System.out.println(String.format("%69s %8s", dato, String.valueOf(getTotal())));
    }

}
