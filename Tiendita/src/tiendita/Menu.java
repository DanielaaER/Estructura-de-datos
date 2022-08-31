/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendita;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc1 = 0, opc2 = 0, opc3;
        boolean avanza, avanza2;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("MENU \n 1. Productos \n 2. Venta \n 3. Corte \n 4. Salir ");
            do {
                try {
                    avanza = false;
                    opc1 = s.nextInt();
                    switch (opc1) {
                        case 1:
                            do {
                                System.out.println("PRODUCTOS");
                                do {
                                    try {
                                        avanza2 = false;
                                        System.out.println("1. Lista de productos \n 2. Agregar Producto \n 3. Modificar Producto \n 4. Borrar Producto \n 5. Salir");
                                        opc2 = s.nextInt();
                                        switch (opc2) {
                                            case 1:
                                                System.out.println("Lista de productos");
                                                break;
                                            case 2:
                                                System.out.println("Agregar Producto");
                                                break;
                                            case 3:
                                                System.out.println("Modificar Producto");
                                                break;
                                            case 4:
                                                System.out.println("Borrar Producto");
                                                break;
                                        }
                                    } catch (InputMismatchException ex) {
                                        avanza2 = true;
                                        System.out.println("Ingresa los datos correctamente");
                                    }
                                    s.next();
                                } while (avanza);
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
        } while (5 != opc1);
    }

}
