/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionbimestral;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int n, m, i, j;
        n=0; 
        
        // Declarar la matriz Triángulo de Pascal
        int [][] TP = new int [50][50];
        
        System.out.print("Dígite el número de filas: ");
        m = leer.nextInt();
        
        n = 2 * m - 1;
        
        System.out.println("\n***TRIANGULO DE PASCAL***");
        
        for (i=1; i<=m; i++) {
            for (j=1; j<=n; j++) {
                cero(TP, m, n);
            }
        }
        
        TP[1][m] = Funcion_TP(TP, m);
        
        for (i=2; i<=m; i++) {
            for (j=m+1-i; j<=n-1; j++) {
                dif1(TP, m, n);
            }
        }
        
        TP[m][n] = Funcion_TP1(TP, m, n);        
        
        
        // Imprimir el Triángulo de Pascal
        Imprimir_TP(TP, m, n);
        
        // Almacenar el Triándulo de Pascal en un archivo
        Archivo(TP, m, n);
    }
    
    // procedimiento para convertir todos los valores en cero
    
    public static void cero(int TP [][],int m, int n) {
        int i, j;
        for (i=1; i<=m; i++) {
            for (j=1; j<=n; j++) {
                TP[i][j] = 0;
            }
        }        
    }
    
    // Procedimiento para los valores diferentes de 1
    
    public static void dif1(int TP [][],int m, int n) {
        int i, j;
        
        for (i=2; i<=m; i++) {
            for (j=m+1-i; j<=n-1; j++) {
                TP[i][j] = TP[i-1][j-1]+TP[i-1][j+1];
            }
        } 
    }
    
    public static int Funcion_TP(int TP[][], int m) {
        TP[1][m] = 1;
        
        return TP[1][m];
    }
    
    public static int Funcion_TP1(int TP[][], int m, int n) {    
        TP[m][n] = TP[m-1][n-1];
        
        return TP[m][n];
    }
    
    // Imprimir Triángulo de Pascal
    
    public static void Imprimir_TP(int TP[][], int m, int n) {
        int i, j;
        
        for (i=1; i<=m; i++) {
            for (j=1; j<=n; j++) {
                if (TP[i][j] == 0) {
                    System.out.print("");
                }
                else{
                    System.out.print(TP[i][j]+"  ");
                }
            }
            System.out.println("\n");
        }         
    }
    
    public static void Archivo(int TP[][], int m, int n) {
        int i, j;
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("TrianguloPascal.txt"));
            bw.write("***TRIÁNGULO DE PASCAL***\n");
            
            for (i=1; i<=m; i++) {
                for (j=1; j<=n; j++) {
                    if (TP[i][j] == 0) {
                        bw.write("");
                    }
                    else{
                        bw.write(String.valueOf(TP[i][j]+"  "));
                    }
                }
                bw.write("\n");
            }
            
            bw.close();
        }
        
        catch(IOException ioe) { // error en la escritura del archivo
            System.out.println("No se puede escribir en el archivo");
        }
    }            
}
