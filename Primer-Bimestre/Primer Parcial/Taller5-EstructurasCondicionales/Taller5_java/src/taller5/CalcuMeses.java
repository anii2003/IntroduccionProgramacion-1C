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
public class CalcuMeses {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int nmes;      
        nmes = 0;
        
        //Ingreso de datos
        System.out.println("***Calculadora de meses según su número*** \n");
        
        System.out.println("Escoja una ópción del siguiente menú: ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11");
        System.out.println("12");
        System.out.println("");
        
        System.out.println("Seleccione ún número para así conocer el mes: ");
        nmes = leer.nextInt();
        System.out.println("");
        switch (nmes) {
            case 1: {
                System.out.println("El mes correspondiente es enero");
            }
            break;
             case 2: {
                System.out.println("El mes correspindiente es febrero");
            }      
            break;
            case 3: {
                System.out.println("El mes correspondiente es marzo");
            }
            break;
            case 4: {
                System.out.println("El mes correspondiente es abril");
            }
            case 5: {
                System.out.println("El mes correspondiente es mayo");
            }
            break;
            case 6: {
                System.out.println("El mes correspondiente es junio");
            }
            break;
            case 7: {
                System.out.println("El mes correspondiente es julio");
            }
            break;
            case 8: {
                System.out.println("El mes correspondiente es agosto");
            }
            case 9: {
                System.out.println("El mes correspondiente es septiembre");
            }
            break;
            case 10: {
                System.out.println("El mes correspondiente es octubre");
            }
            break;
            case 11: {
                System.out.println("El mes correspondiente es noviembre");
            }
            break;
            case 12: {
                System.out.println("El mes correspondiente es diciembre");
            }
            break; 
            default:
                System.out.println("La opción ingresada es incorrecta");
            break;
        } 
        System.out.println("");
    }  
}
