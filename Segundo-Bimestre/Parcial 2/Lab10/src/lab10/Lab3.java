/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n = 0;
        
        // Ingresar el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = leer.nextInt();
        
        int [][] A = new int [n][n]; // Crear la matriz
        
        // Ingresar los datos de la matriz
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                A[i][j] = (int)(Math.random()*50);
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
