/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class VectorPorEscalar {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        // Declarar e inicializar las variables
        int i, n, escalar;
        i = 0; n = 0; escalar = 0;
        
        // Ingreso de datos
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        // Declarar vectores
        int [] A = new int [n];
        int [] B = new int [n];
        
        System.out.print("Ingrese el escalar: ");
        escalar = leer.nextInt();
        
        // Ingresar los elementos del vector
        for (i=0; i<n; i++) {
            System.out.print("Ingrese el elemento A ["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
        // Multiplicar por el escalar
        for (i=0; i<n; i++) {
            B[i] = A[i]*escalar;
        }
        
        // Presentar el vector B
        
        for(i=0; i<n; i++) {
            System.out.println("B ["+i+"] = "+B[i]);
        }
    }
}
