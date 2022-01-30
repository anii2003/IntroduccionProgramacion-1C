/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class NumPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e inicialización de variables
        int num, i, n;
        double j, divisor;
        
        num = 0; i = 1; n = 0; divisor = 0;
        
        System.out.print("Ingrese el límite de números a verificar: ");
        n = leer.nextInt();
        
        for (i=1; i <= n; i++) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            
            // Verificar si un número es par o impar
            
            if (num%2 == 0) {
                System.out.println("El número "+num+" es par");
            }
            else {
                System.out.println("El número "+num+" es impar");
            }
            
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
            divisor = 0;
        }
    }
}
