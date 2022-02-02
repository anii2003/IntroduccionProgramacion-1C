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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int i, j, m, n;
        m = 0; n = 0;
        
        // Ingresar el tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        m = leer.nextInt();
        
        System.out.print("Ingrese el número de columnas: ");
        n = leer.nextInt();
        
        // Declarar la matriz A
        int [][] A = new int [m][n];
        
        // Recorrer la matriz e ingresar sus datos

        System.out.println("\nIngresar los elementos de la matriz");
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\n***MATRIZ ORIGINAL***");
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
        // Voltear la matriz de izquierda a derecha
        
        System.out.println("\n***MATRIZ VOLTEADA DE IZQUIERDA A DERECHA***");
        for (i=0; i<m; i++) {
            for (j=n-1; j>=0; j--) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }        
}


