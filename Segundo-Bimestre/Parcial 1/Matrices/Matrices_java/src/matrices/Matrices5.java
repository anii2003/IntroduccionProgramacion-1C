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
public class Matrices5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // declarar e inicializar las variables
        int i, j, m, bandera;
        m = 0; i = 0; j = 0; bandera = 0;
        
        
        //Ingresar el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        m = leer.nextInt();
        
        // Declarar las matrices
        int [][] A = new int [m][m];
        
        // Ingresar los elementos de la matriz A
        System.out.println("***Ingrese los elementos de la matriz A[i][j]****");
        for (i=0; i<m; i++) {
            for (j=0;j<m;j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        // Determinar si la matriz es simétrica o no
        for (i=0; i<m; i++) {
            for (j=0;j<m;j++) {
                if (A[i][j] != A[j][i]) {
                    bandera = 1;
                }                  
            }
        }
        if (bandera == 1) {
            System.out.println("La matriz no es simétrica");
        }
        else {
            if (bandera == 0) {
                System.out.println("La matriz es simétrica");
            }
        }
    }    
}

