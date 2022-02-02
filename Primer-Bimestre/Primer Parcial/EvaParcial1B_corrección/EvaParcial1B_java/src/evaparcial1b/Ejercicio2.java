/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial1b;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //Declarar e inicializar las variables
        
        int num1, num2, dif;
        num1 = 0; num2 = 0; dif = 0;
        
        //Ingresar los dos números
        System.out.println("***Programa para determinar si la diferencia de los dos números es"
                + " múltiplo de algunos de ellos");
        System.out.print("Ingrese el número 1: ");
        num1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        //Proceso para obtener la diferencia y verificar si es múltiplo
        
        dif = (num1 - num2);
        
        if ((num1 % dif == 0) && (num2 % dif == 0)) {
            System.out.println("La diferencia " +dif +" es divisor de " +num1 +" y " +num2);   
        }
       else {
            if (num1 % dif == 0) {
                System.out.println("La diferencia " +dif +" es divisor de " +num1);
            }
            else {
                if (num2 % dif == 0) {
                    System.out.println("La diferencia " +dif +" es divisor de " +num2);
                }
                else {
                    System.out.println("La diferencia no es divisor de ninguno de los dos números");
                }
            
            }
    
        }
    }
}


