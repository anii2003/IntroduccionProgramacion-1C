/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int n, i, j, k, l;
        double dig, suma, prom, Pdec;
        n = 5; prom = 0; dig = 0; suma = 0; k = 0; l = 0; Pdec = 0;
        
        // Declarar las matrices
        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
        
        // Ingresar los elementos de la matriz A
        System.out.println("***Ingrese los elementos de la matriz A***");
        for (i=0; i<n; i++) {
            for (j=0;j<n;j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        // Ingresar los elementos de la matriz B
        System.out.println("***Ingrese los elementos de la matriz B***");
        for (i=0; i<n; i++) {
            for (j=0;j<n;j++) {
                System.out.print("B["+i+"]["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        
        // Mostrar la matriz A
        System.out.println("Matriz A");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
        // Mostrar la matriz B
        System.out.println("Matriz B");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
        }
        
        // Determinar cuáles números terminan en 4 y promedio de los mismos (Matriz A)
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                
                dig = A[i][j]%10;
                
                if (dig == 4) {
                    System.out.println("A["+i+"]["+j+"] termina en 4");
                    k = k + 1;
                    suma = suma + A[i][j];
                }               
            }
        }
        
        prom = suma/k;
                
        // Si el promedio es decimal su operación con la función MOD 1
        // dará diferente de 0, por tanto solo tomaremos la parte entera.
                
        if (prom % 1 != 0) {
            Pdec = prom % 1;
            prom = prom - Pdec;
        }                           
        
        System.out.println("El promedio de los números terminados en 4 es "+prom);
        
        // Verificar si este promedio entero se encuentra al menos 3 veces en la matriz B
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (B[i][j] == prom) {
                    l = l + 1;
                }                              
            }
        }
        System.out.println("El promedio "+prom+" se ha encontrado "+l+" veces en la matriz B");
        
        if (l >= 3) {
            System.out.println("El promedio de los números terminados en 4 de la matriz A SÍ se repite al menos 3 veces");
        }
        else {
            System.out.println("El promedio de los números terminados en 4 de la matriz A NO se repite al menos 3 veces");
        }
    }
}
