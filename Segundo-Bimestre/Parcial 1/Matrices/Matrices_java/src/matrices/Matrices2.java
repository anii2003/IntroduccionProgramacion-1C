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
public class Matrices2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);          
        
        // Declarar las variables
        int n, i, j;
        n=0; i=0; j=0;
        
        // Declarar el tamaño de la matriz
        System.out.println("---OPERACIONES SOBRE MATRICES CUADRADAS---");
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        // Recorrer la matriz e ingresar los elementos de la matriz
        
        int[][] A = new int [n][n];
        
        System.out.println("\nIngresar los elementos de la matriz");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Matriz Original");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Cambiar por cero la diagonal principal");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (i==j) {
                    A[i][j]=0;
                }
            }
        }
        
        System.out.println("Presentar la matriz nuevamente");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Cambiar por uno la diagonal secundaria");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (i+j == n-1) {
                    A[i][j]=1;
                }
            }
        }

        System.out.println("Presentar la matriz nuevamente");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("\nCambiar por 99 las esquinas de la matriz");
        A[0][0]=99;
        A[0][n-1]=99;
        A[n-1][0]=99;
        A[n-1][n-1]=99;
        
        System.out.println("Presentar la matriz nuevamente");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }        
    }
}
