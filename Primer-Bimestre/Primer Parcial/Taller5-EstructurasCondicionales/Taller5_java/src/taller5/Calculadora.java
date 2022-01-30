/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        
        double num1, num2, resp;
        int opc;
        
        num1 = 0; num2 = 0; resp = 0;
        
        //Ingreso de los datos
        System.out.println("Calculadora básica \n");
        
        System.out.println("Ingrese el valor del primer número: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del segundo número: ");
        num2 = leer.nextDouble();
        System.out.println("\n");
        System.out.println("Escoja la opción del siguiente menú");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        System.out.println("Ingrese una opción: ");
        opc = leer.nextInt();
        
        switch (opc) {       
            case 1: {
                resp = num1 +num2;
                System.out.println("La suma es: " +resp);
            }
            break;
            case 2 : {
                resp = num1 - num2;
                System.out.println("La resta es: " +resp);
            }
            break;
            
            case 3: {
                resp = num1 * num2;
                System.out.println("La multiplicación es: " +resp);
            }
            break;
            
            case 4: {
                resp = num1 / num2;
                System.out.println("La división es: " +resp);
            }
            break;
            
            default:
                System.out.println("No existe la opción que usted ingresó");
            break;    
        }
        System.out.println("");
    }
}
