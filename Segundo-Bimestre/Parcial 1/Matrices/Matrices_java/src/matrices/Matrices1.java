/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Matrices1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declarar e inicializar las variables (filas, columnas, e índices)
        
        int n, m, i, j;
        n = 0; m = 0; i = 0; j = 0;
        
        //Ingresar el tamaño de la matriz
        System.out.println("---EJERCICIOS CON MATRICES---");
        System.out.print("Ingrese el número de filas: ");
        n = leer.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        m = leer.nextInt();
        
        int[][] A = new int[n][m];
        
        // Recorrer la matriz e ingresar los elementos de la matriz
        System.out.println("\nIngresar los elementos de la matriz");
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\nLa matriz A es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }

        System.out.println("\nLa matriz A según su posición es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                System.out.print("("+i+")("+j+")"+" ");
            }
            System.out.println("");
        }
        
        int suma = 0;
        int[] B = new int[n];
        
        for (i=0;i<n;i++) {
            for (j=0;j<m;j++) {                
                suma = suma + A[i][j];              
            }
            B[i] = suma;
            suma = 0;            
        }
        
        System.out.println("\n**El vector B (sumatoria de filas) es:");
        for (i=0; i<n; i++) {
            System.out.println(B[i]+"   ");
        }
    }
    
}
