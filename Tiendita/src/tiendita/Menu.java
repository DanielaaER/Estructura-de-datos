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
        int opc1, opc2;
        Scanner s = new Scanner(System.in);
        System.out.println("MENU \n 1. Productos \n 2. Venta \n 3. Corte ");
        try{
            opc1=s.nextInt();
            switch (opc1){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }catch(InputMismatchException ex){
            
        }
    }
    
}
