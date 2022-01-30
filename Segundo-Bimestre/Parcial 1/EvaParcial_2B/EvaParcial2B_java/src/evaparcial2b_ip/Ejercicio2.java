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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // declarar e inicializar las variables
        int i, j, n;
        boolean EsSime;
        n = 0; i = 0; j = 0; 
        
        
        //Ingresar el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        // Declarar las matrices
        int [][] A = new int [n][n];
        
        // Ingresar los elementos de la matriz A
        System.out.println("***Ingrese los elementos de la matriz A****");
        for (i=0; i<n; i++) {
            for (j=0;j<n;j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        // Determinar si la matriz es simétrica o no através de una función
        EsSime = Simetrica(A, n);
        
        if (EsSime == false) {
            System.out.println("La matriz no es simétrica");
        }
        else {
            if (EsSime == true) {
                System.out.println("La matriz es simétrica");
            }
        }
    }
    
    public static boolean Simetrica(int A[][], int n) {
        int i, j, band;
        band = 0;
        
        // Determinar si la matriz es simétrica o no
        for (i=0; i<n; i++) {
            for (j=0;j<n;j++) {
                if (A[i][j] != A[j][i]) {
                    band = 1;
                }                  
            }
        }
        if (band == 1) {
            return false;
        }
        else {
            return true;            
        }
    }
}


