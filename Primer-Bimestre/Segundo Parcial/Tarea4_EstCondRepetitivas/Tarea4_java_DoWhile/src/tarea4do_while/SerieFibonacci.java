/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       // declarar e inicializar las variables
       int a, b, c, i, n;
       a = 0; b = 1; c = 0; i = 1; n = 0;
       
       // Ingresar datos
        System.out.println("***Serie de Fibonacci***");
        System.out.print("Ingrese cantidad de elementos para la serie: ");
        n = leer.nextInt();
        
       // Proceso
       
        do {
           System.out.println(a);
           c = a + b;
           a = b;
           b = c;
           i = i + 1;
        }while (i <= n);
    }
}
