/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial2b_ip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int i, j, n, l, k;
        double suma1, suma2, prom1, prom2, Pdec1, Pdec2;
        n = 3; suma1 = 0; suma2 = 0; l = 0; k = 0;
        prom1 = 0; prom2 = 0; Pdec1 = 0; Pdec2 = 0;
        
        // Declarar la matrices
        int [][] A = new int [n][n];
        int [][] B = new int [n][n];
        
        // Ingresar los datos de la matriz A
        System.out.println("***Ingresar los elementos de la matriz A***");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        // Ingresar los datos de la matriz B
        System.out.println("\n***Ingresar los elementos de la matriz B***");
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                System.out.print("B ["+i+"] ["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }

        // Sacar promedio de la diagonal secundaria de la matriz A
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (i+j == n-1) {
                   suma1 = suma1 + A[i][j];
                   k = k + 1;
                }
                
                prom1 = suma1 / k;
                
                // Si el promedio es decimal su operación con la función MOD
                // dará diferente de 0, por tanto solo tomaremos la parte entera.
                
                if (prom1 % 1 != 0) {
                    Pdec1 = prom1 % 1;
                    prom1 = prom1 - Pdec1;
                }                 
            }            
        }
        System.out.println("\nPromedio entero Diagonal Secundaria Matriz A: "+prom1);
        
        // Sacar promedio de la diagonal secundaria de la matriz B
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (i+j == n-1) {
                   suma2 = suma2 + B[i][j];
                   l = l + 1;
                }
                prom2 = suma2 / l;
                
                // Si el promedio es decimal su operación con la función MOD
                // dará diferente de 0, por tanto solo tomaremos la parte entera.
                
                if (prom2 % 1 != 0) {
                    Pdec2 = prom2 % 1;
                    prom2 = prom2 - Pdec2;
                }                 
            }            
        }
        System.out.println("\nPromedio entero Diagonal Secundaria Matriz B: "+prom2);
        
        if (prom1 == prom2) {
            System.out.println("\nLos promedios de las diagonales secundarias de las matrices son iguales");
        }
        else {
            System.out.println("\nLos promedios de las diagonales secundarias de las matrices NO son iguales");
        }
    }
}
