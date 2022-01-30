/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evabimestralip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaración e inicialización de variables
        int num, opc, par, impar, posi, nega, mult3, primo, j, divisor;
        num = 0; opc = 0; par = 0; impar = 0; posi = 0; nega = 0; mult3 = 0; primo = 0; j = 0; divisor = 0;
        
        // Ingreso de datos y proceso
        System.out.println("***Programa para verificar si un número es positivo, negativo, par o impar***");       
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        
        System.out.println("Seleccione la opción a realizar");
        System.out.println("1. Verificar si es par o impar");
        System.out.println("2. Verificar si es positivo o negativo");
        System.out.println("3. Verificar si es múltiplo de 3");
        System.out.println("4. Verificar si es primo");
        
        System.out.println("");
        System.out.print("Ingrese una opción: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1: {
                if (num % 2 == 0){
                    System.out.println("El número ingresado es par");
                }
                else {
                    System.out.println("El número ingresado es impar");
                }             
            }
            break;
            
            case 2:{
                if (num > 0) {
                    System.out.println("El número es positivo");
                }
                else {
                    if (num < 0) {
                        System.out.println("El número ingresado es negativo");
                    }
                    if (num == 0) {
                        System.out.println("El número ingresado es neutro");
                    }
                }
            }
            break;
            
            case 3: {
                if (num % 3 == 0) {
                    System.out.println("El número es múltiplo de 3");
                }
                else {
                    System.out.println("El número no es múltiplo de 3");
                }
            }
            break;
            
            case 4: {
                j = 1;
                while (j <= num) {
                    if (num%j == 0) {
                        divisor = divisor + 1;
                    }
                    j = j + 1;
                }
                if (divisor == 2) {
                    System.out.println("El número "+num +" es primo");
                }
                else {
                    System.out.println("El número "+num+" no es primo");
                }                             
            }
            break;
            default:
                System.out.println("Opción incorrecta, por favor vuelva a ingresar");
            break;
        }
    }    
}
