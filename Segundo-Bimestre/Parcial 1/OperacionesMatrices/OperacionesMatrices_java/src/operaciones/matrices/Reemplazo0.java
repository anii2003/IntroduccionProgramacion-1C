/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.matrices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Reemplazo0 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int n, m, i, j;
        n = 0; m = 0; i = 0; j = 0;
        
        //Ingresar el tamaño de la matriz
        System.out.println("---OPERACIONES CON MATRICES---");
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = leer.nextInt();

        
        int[][] A = new int[n][n];
        
        // Recorrer la matriz e ingresar los elementos de la matriz
        System.out.println("\nIngresar los elementos de la matriz");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\nLa matriz A es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }

        System.out.println("\nMatriz reemplazada con ceros (valores por encima de la diagonal principal");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (j>i) {
                    A[i][j]=0;
                }
            }
        }        
        
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }
        
    }
}
