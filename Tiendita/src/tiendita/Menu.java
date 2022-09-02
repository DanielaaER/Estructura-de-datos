/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendita;

import java.security.CodeSigner;
import java.time.temporal.Temporal;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

/**
 *
 * @author danie
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static String formato(String codigo, String nombre, String precio) {
        String datos = String.format("%-10s    %-40s       %-10s    ", codigo, nombre, precio);
        return datos;
    }

    public static Producto ingresar() {
        String nombre;
        Double precio;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el nombre del prodcuto");
        nombre = s.nextLine();
        System.out.println("Ingresa el precio del prodcuto");
        precio = s.nextDouble();
        Producto temporal = new Producto(nombre, precio);
        return temporal;
    }

    public static int borrar(Registro temporal) {
        Scanner s = new Scanner(System.in);
        int pos;
        String opc;
        temporal.imprimeLista();
        do {
            System.out.println("Ingresa el codigo de producto a eliminar");
            pos = s.nextInt() - 1;
            System.out.println("El producto a eliminar es: " + temporal.getProductos().get(pos).getNombre()
                    + "\n Es correcto (S/N)");
            opc = s.next();
        } while (opc == "S");
        return pos;

    }



    public static Producto modificar(Registro temporal) {
        Scanner s = new Scanner(System.in);
        int codigo;
        double precio;
        String opc;
        temporal.imprimeLista();
        do {
            System.out.println("Ingresa el codigo de producto a modificar");
            codigo = s.nextInt() - 1;
            System.out.println("El producto a modificar es: " + temporal.getProductos().get(codigo).getNombre()
                    + "\n Es correcto (S/N)");
            opc = s.next();
        } while (opc == "S");
        opc = "n";
        do {
            System.out.println("Ingresa el precio de producto a modificar");
            precio = s.nextDouble();
            System.out.println("El precio a modificar es: " + precio + "\n Es correcto (S/N)");
            opc = s.next();
        } while (opc == "S");
        temporal.getProductos().get(codigo).getPrecio();
        return temporal.getProductos().get(codigo);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int opc1 = 0, opc2 = 0, opc3;
        Registro registros = new Registro();
        boolean avanza, avanza2;
        Scanner s = new Scanner(System.in);
        registros.iniciar();
        do {
            do {
                System.out.println("MENU \n 1. Productos \n 2. Venta \n 3. Corte \n 4. Salir ");
                try {
                    avanza = false;
                    opc1 = s.nextInt();
                    switch (opc1) {
                        case 1:
                            do {
                                do {
                                    try {
                                        avanza2 = false;
                                        System.out.println(
                                                "\n PRODUCTOS \n 1. Lista de productos \n 2. Agregar Producto \n 3. Modificar Producto \n 4. Borrar Producto \n 5. Salir");
                                        opc2 = s.nextInt();
                                        switch (opc2) {
                                            case 1:
                                                System.out.println("Lista de productos");
                                                System.out.println(formato("CODIGO", "NOMBRE", "PRECIO"));

                                                registros.imprimeLista();
                                                break;
                                            case 2:
                                                System.out.println("Agregar Producto");
                                                registros.agregarProducto(ingresar());
                                                break;
                                            case 3:
                                                System.out.println("Modificar Producto");

                                                registros.modificarProducto(modificar(registros));
                                                System.out.println("mod");
                                                System.out.println("Producto actualizado");
                                                break;
                                            case 4:
                                                System.out.println("Borrar Producto");
                                                registros.borrarProducto(borrar(registros));
                                                break;
                                        }
                                    } catch (InputMismatchException ex) {
                                        avanza2 = true;
                                        System.out.println("Ingresa los datos correctamente");
                                        s.next();
                                    }
                                } while (avanza2);
                            } while (5 != opc2);
                            break;
                        case 2:
                            System.out.println("VENTAS");
                            break;
                        case 3:
                            System.out.println("CORTE DE CAJA");
                            break;
                    }

                } catch (InputMismatchException ex) {
                    avanza = true;
                    System.out.println("Ingresa los datos correctamente");
                    s.next();
                }
            } while (avanza);
        } while (4 != opc1);
    }

}
