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
public class TablaMult {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int num, i, mult, n;
        num = 0; i = 1; mult = 0; n = 0;
        
        // Ingresar los datos
        System.out.println("***Tabla de multiplicar***");
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        System.out.print("Ingrese el límite: ");
        n = leer.nextInt();
        
        // Proceso
        
        while (i <= n) {
            mult = num *  i;
            System.out.println(num+" x "+i+" = "+mult);
            i = i + 1;
        }
    }  
}
