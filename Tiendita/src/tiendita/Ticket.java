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
    private int folio, cantidad = -1;
    private LocalDateTime fecha;
    private double total;

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
        if (cantidad == -1) {
            cantidad = cantidad + 1;
            fecha = LocalDateTime.now();
        }
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

    public void imprimeTicket() {
        int i;
        System.out.println("TICKET DE COMPRA No." + cantidad + 1);
        System.out.println("Fecha: " + fecha);
//        System.out.println(Menu.formatoT("CODIGO", "NOMBRE", "CANTIDAD", "PRECIO", "TOTAL"));
//        for (i = 0; i < folio; i++) {
//            System.out.print(Menu.formatoT(String.valueOf(ventas.get(i).getCodigopro()+1),ventas.get(i).getNombre(), String.valueOf(ventas.get(i).getCantidad()), String.valueOf(ventas.get(i).getPrecio()),  String.valueOf(ventas.get(i).getTotalpro()) + "\n"));
//        }
        System.out.println(Menu.formatoT("CODIGO", "NOMBRE", "CANTIDAD", "PRECIO", "TOTAL"));
        for (i = 0; i < folio; i++) {
            System.out.println(Menu.formatoT(String.valueOf(ventas.get(i).getCodigopro()+1), ventas.get(i).getNombre(), String.valueOf(ventas.get(i).getCantidad()), String.valueOf(ventas.get(i).getPrecio()), String.valueOf(ventas.get(i).getTotalpro())));
//            System.out.print(Menu.formatoT(String.valueOf(ventas.get(i).getFolio()),
//                    ventas.get(i).getNombre(),
//                    String.valueOf(ventas.get(i).getPrecio())) + "\n");
        }
        System.out.println("");
        String dato = "TOTAL A PAGAR";
        System.out.println(String.format("%69s %8s", dato, String.valueOf(getTotal())));
    }

}
