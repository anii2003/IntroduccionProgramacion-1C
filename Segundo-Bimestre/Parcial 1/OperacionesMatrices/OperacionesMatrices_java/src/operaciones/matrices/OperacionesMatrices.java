/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones.matrices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class OperacionesMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int n, m, i, j;
        n = 0; m = 0; i = 0; j = 0;
        
        //Ingresar el tamaño de la matriz
        System.out.println("---OPERACIONES CON MATRICES---");
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

        // Matriz Transpuesta
        System.out.println("\nLa matriz transpuesta es: ");
        for (j=0; j<m; j++) {
            for (i=0; i<n; i++) {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("");
        } 

        
        
    }
    
}
