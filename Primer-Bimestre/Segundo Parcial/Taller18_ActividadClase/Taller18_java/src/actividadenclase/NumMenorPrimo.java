/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadenclase;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NumMenorPrimo {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            // Declarar e inicializar las variables
            int n, divisor, num, menor, i, j, primo;
            n = 0; divisor = 0; num = 0; menor = 0; i = 1; j = 1; primo = 0;
            
            // Ingrese los datos
            System.out.println("***Programa para obtener el número primo menor***");
            System.out.print("Ingrese el límite: ");
            n = leer.nextInt();
            
            while (i <= n) {
                System.out.print("Ingrese un número a evaluar: ");
                num = leer.nextInt();
                
                for (j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        divisor = divisor + 1;
                    }
                }
                if (divisor == 2) {
                    System.out.println("El número "+num+" es primo");
                    primo = primo + 1;
                    
                    if (primo == 1) {
                        menor = num;
                    }                       
                    if (num < menor) {
                        menor = num;
                    }
                }
                
                divisor = 0;
                i = i + 1;
            }
            System.out.println("---------------------------------");
            System.out.println("El número primo menor es: "+menor);        
    }
}
