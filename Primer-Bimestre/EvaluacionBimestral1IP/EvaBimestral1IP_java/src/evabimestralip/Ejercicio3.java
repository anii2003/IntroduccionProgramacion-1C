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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // declarar e inicializar las variables
        int exp, i, n;
        double term, num, deno,suma;
        num = 1; deno = 7; exp = 2; i = 2; n = 0; suma = 0;
        // Ingrese los datos
        System.out.print("Ingrese un límite: ");
        n = leer.nextInt();
        
        // Proceso
        
        while (i <= n+1) {

            System.out.println(num+"^"+exp+"/"+deno);
            num = Math.pow(num,exp);
            term = num/deno;
            suma = suma + term;
            
            if (i % 2 == 0) {
                num = 2;
                exp = exp + 2;
                deno = deno + (3*2);
            }
            else {
                num = 1;
                exp = exp + 2;
                deno = deno+(3*2);
            }         
            
            i = i + 1;
            
        }
        
        System.out.println("La suma total es: "+suma);
    }
}
