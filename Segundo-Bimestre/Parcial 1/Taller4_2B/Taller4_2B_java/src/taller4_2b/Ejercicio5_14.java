/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_2b;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio5_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int n, m, k;
        k = 50;
        int [][] A = new int [50][50];
        int [][] B = new int [50][50];
        int [] C = new int [50];
        
        System.out.print("Ingrese el número de filas: ");
        n = leer.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        m = leer.nextInt();
        
        leer_Matriz(n, m, A);
        System.out.println("***Matriz Original***");
        escribir_Matriz(n, m, A);
        mayor (n, m, A);
        System.out.println("***Matriz Transpuesta***");        
        transpuesta (n, m, A, B);
        // escribir_matriz (n, m, B)
        k = impar(n, m, A, C, k);
        
        if (k > 0) {
            escribir_Vector(k, C);
        }
        else {
            System.out.println("La matriz no tiene números impares");
        }
    }
    
    public static void leer_Matriz(int fila,int columna,int M[][]) {
        Scanner leer = new Scanner (System.in);
        
        int i, j;
        
        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                System.out.print("Digite el elemento de la posición ["+i+"]["+j+"]: ");
                M[i][j] = leer.nextInt();
            }
        }
    }
    
    public static void mayor(int fila, int columna, int M[][]) {
        int May, i, j;
        May = 0;

        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                if (M[i][j] > May) {
                    May = M[i][j];
                }
            }
        }
        System.out.println("El elemento mayor de la matriz es: "+May+"\n");
    }
    
    public static void transpuesta(int fila, int columna, int M1[][], int M2[][]) {
        int i, j;
        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                M2[i][j] = M1[j][i];
            }
        }
        escribir_Matriz(fila, columna, M2);
    }
    
    public static int impar (int fila, int columna, int M[][], int V[], int tam) {
        int i, j;
        tam = 0;
        
        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                if (M[i][j] % 2 != 0) {
                    V[tam] = M[i][j];
                    tam = tam + 1;                    
                }
            }
        }
        System.out.println("Tam ← "+tam);
        return (tam-1);
    }
    
    public static void escribir_Matriz(int fila, int columna, int M[][]) {
        int i, j;
        for (i=0; i<fila; i++) {
            for (j=0; j<columna; j++) {
                System.out.print("   "+M[i][j]);
            }
            System.out.println("  ");
        }
    }
    
    public static void escribir_Vector(int tam, int v[]) {
        int i;
        for (i=0; i<=tam; i++) {
            System.out.println("El elemento en la posición "+i+" es: "+v[i]);
        }
    }
}
