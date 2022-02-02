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
public class Ejercicio3_127 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // declarar variables
        int i, j, n;
        i = 1; n = 0;
        
        // ingrese los datos
        System.out.println("***Figura especial***");
        System.out.print("Ingrese el número: ");
        n = leer.nextInt();
        
        while (i <= n) { //filas
            for (j = 1; j <= i; j++) {
                System.out.print("* "); //Columnas
            }
            System.out.println("");
            i = i + 1;
        }
    }
    
}

