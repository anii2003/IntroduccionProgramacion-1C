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
public class SumaMatrices {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        // Declarar e inicializar las variables
        int i, j, n;
        n = 0; 
        
        // Ingresar el tamaño de las matrices
        System.out.println("***SUMA DE MATRICES***");
        System.out.print("Ingrese el tamaño de las matrices a ingresar: ");
        n = leer.nextInt();
        
        // Declarar la matriz e ingresar sus valores
        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
        
        System.out.println("\nIngresar los elementos de la matriz A");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }

        System.out.println("\nIngresar los elementos de la matriz B");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("B ["+i+"] ["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\nLa matriz A es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        } 

        System.out.println("\nLa matriz B es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(B[i][j]+"   ");
            }
            System.out.println("");
        }
        
        // Suma de matrices

        int [][] C = new int [n][n];
        
        for (i=0;i<n;i++) {
            for (j=0;j<n;j++) {
                C[i][j] = A[i][j] + B [i][j];
            }
        }
        
        System.out.println("\n***La matriz C (suma de la matriz A y B) es: ***");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(C[i][j]+"   ");
            }
            System.out.println("");
        } 
    }
}
