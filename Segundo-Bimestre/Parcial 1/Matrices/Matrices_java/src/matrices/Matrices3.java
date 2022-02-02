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
public class Matrices3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int n, i, j;
        n = 0;
        
        // Ingresar el tamaño de la matriz
        System.out.println("---EJERCICIO 4-MATRICES---");
        System.out.print("Ingrese el tamaño de la matriz: ");
        n=leer.nextInt();
        
        // Declarar la matriz
        
        int [][] A= new int[n][n];
        
        // Recorrer la matriz e ingresar los elementos de la matriz
        System.out.println("\nIngresar los elementos de la matriz");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        // Presentar los elementos de la matriz
        System.out.println("Matriz A Original");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz con elementos pares reemplazados");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (A[i][j] % 2 == 0) {
                    A[i][j]=0;
                }
            }
        }

        System.out.println("Presentar la matriz A cambiando números pares por 0");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }

        System.out.println("\nMatriz cuando i o j sea n-1");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if ((i==n-1)||(j==n-1)) {
                    A[i][j]=1;
                }
            }
        }
        
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }        
        
        System.out.println("\nLa matriz A según su posición es: ");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("("+i+")("+j+")"+" ");
            }
            System.out.println("");
        }        

        System.out.println("Presentar la matriz A cambiando números pares por 0");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        }        
    }
}
