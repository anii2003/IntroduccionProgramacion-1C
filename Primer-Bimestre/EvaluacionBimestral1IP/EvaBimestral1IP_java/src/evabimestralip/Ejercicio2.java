/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evabimestralip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int i, n, num1, num2, mult3, menor;
        i = 0; n = 0; num1 = 0; num2 = 0; mult3 = 0; menor = 0;
        
        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        // Proceso
                
        if (num1 < num2){
            menor = num1;
            i = menor;
            n = num2;
        }
        
        if (num2 < num1) {
            menor = num2;
            i = menor;
            n = num1;
        }
        
        do{
            if (i % 3 == 0) {
                System.out.println(i+" es múltiplo de 3");
            }
            i = i + 1;
            
        } while (i <= n);
        
    }
}
