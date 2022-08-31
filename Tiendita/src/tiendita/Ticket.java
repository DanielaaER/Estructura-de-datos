/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendita;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Ticket {
     private ArrayList<Venta> ventas = new ArrayList<Venta>();
     private int folio;
     
      public void borrarProducto(int pos) {
        folio=folio-1;
        ventas.remove(pos);
    }
    
    public Venta guardarProducto(Venta temporal) { 
        folio= folio+1;
        ventas.add (folio,temporal);
        return ventas.get(folio);
    }
    
    public Venta modificarProducto(Venta temporal, int pos){
        ventas.add (pos,temporal);
        return ventas.get(pos);
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
    
    
}
