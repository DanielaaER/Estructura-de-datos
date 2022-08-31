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
public class Registro {
    
  private ArrayList<Producto> productos = new ArrayList<Producto>();
  private int folio;
    
   private void iniciar(){
       Producto temporal;
       folio++;
       temporal= new Producto(folio,"Cereal Kellogs", 32.50);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Leche Alpura Deslactosada", 19.70);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Refresco 600ml", 18.20);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Sabritas 50g", 13.20);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Caramelos Variados",3);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Crema de Cacahuate Nutella 200g ", 45.50);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Shampoo Pantene 350ml ", 98.30);
       productos.add(temporal);
        folio++;
       temporal= new Producto(folio,"Crema Dental Colgate 250g ", 32.60);
       productos.add(temporal);
   }
   
    public void borrarProducto(int pos) {
        folio=folio-1;
        productos.remove(pos);
    }
    
    public Producto guardarProducto(Producto temporal) { 
        folio= folio+1;
        productos.add (folio,temporal);
        return productos.get(folio);
    }
    
    public Producto modificarProducto(Producto temporal, int pos){
        productos.add (pos,temporal);
        return productos.get(pos);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getFolio() {
        return folio;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
    
    
}
