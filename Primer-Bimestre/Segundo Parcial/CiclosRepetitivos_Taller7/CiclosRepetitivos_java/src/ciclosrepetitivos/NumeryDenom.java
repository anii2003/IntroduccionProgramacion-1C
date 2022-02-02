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
public class NumeryDenom {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        int n, i;
        double term, suma, num, den;
        
        n = 0; i = 1; num = 1; den = 2; term = 0; suma = 0;
        
        // Ingrese los datos
        
        System.out.print("Ingrese el límite: ");
        n = leer.nextInt();
        
        // Proceso
        
        while (i <= n) {
            term = num/den;
            System.out.println("El término "+i +" es: "+num+"/"+den);
            suma = suma + term;
            num = num + 2;
            den = den + 3;
            i= i + 1;
        }
        System.out.println("La suma es: " +suma);
    }   
}
