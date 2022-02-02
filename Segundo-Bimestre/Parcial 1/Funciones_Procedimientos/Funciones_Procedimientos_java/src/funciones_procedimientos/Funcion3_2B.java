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
public class Funcion3_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num = 0;
        boolean esImpar;
        
        System.out.println("Función para verificar si un número es impar y un procedimiento"
                + "para verificar si es primo");
        
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        
        esImpar = Impar(num);
        
        if (esImpar == true) {
            Primo(num);
        }
        else {
            System.out.println("El número no es impar por lo cual no se verifica si es primo");
        }
    }
    
    public static boolean Impar(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static void Primo(int numero) {
        int div = 0;
        
        for (int i=1; i<=numero; i++) {
            if (numero % i == 0) {
                div = div + 1;
            }
        }
        
        if (div == 2) {
            System.out.println("El número "+numero+" es impar y primo");
        }
        else {
            System.out.println("El número "+numero+" es impar y no es primo");
        }
    }
}
