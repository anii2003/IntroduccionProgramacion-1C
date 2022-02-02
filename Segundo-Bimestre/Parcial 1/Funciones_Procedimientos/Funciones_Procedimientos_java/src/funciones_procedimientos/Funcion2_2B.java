/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones_procedimientos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Funcion2_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num = 0;
        boolean band;
        
        System.out.println("Función para verificar si un número es "
                + "positivo o negativo");
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        
        band = funNegPos(num); 
        
        // Asigna el valor que devuelve la función
        
        if (band == true) {
            System.out.println("El número "+num+" es positivo");
        }
        
        else {
            System.out.println("El número "+num+" es negativo");
        }
        System.out.println("*** Fin de función 1 ***\n");
        
        // Comprobar directamente con el llamado a la función
        
        if (funNegPos(num) == true) {
            System.out.println("El número "+num+" es positivo 1");
        }
        
        else {
            System.out.println("El número "+num+" es negativo 1");
        }
        System.out.println("*** Fin de función 2 ***\n");
        
    }
    
    public static boolean funNegPos(int numero) {
        if (numero > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
