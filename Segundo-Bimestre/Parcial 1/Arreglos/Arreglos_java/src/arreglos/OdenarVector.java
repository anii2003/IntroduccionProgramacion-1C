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
public class OdenarVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int i,j,n, aux;
        n = 0; aux = 0;
        
        // Pedir el límite del vector
        System.out.println("***ORDENAR UN VECTOR DE N ELEMENTOS***");
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        // Declarar el vector
        int [] A = new int [n];
        
        // Ingresar los datos en el vector
        
        for (i=0; i<n; i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
        // Presentar el vector
        System.out.println("\n \t ---VECTOR ORIGINAL---");
        
        for (i=0; i<n; i++) {
            System.out.println("A["+i+"]: "+A[i]);
        }
        
        System.out.println("\n \t ---VECTOR ORDENADO DE FORMA ASCENDENTE---");
        
        for (i=0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if (A[i] > A[j]) {
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        
        // Presentar el vector ordenado
        for (i=0; i<n; i++) {
            System.out.println("A["+i+"]: "+A[i]);
        }
       
        System.out.println("\n \t ---VECTOR ORDENADO DE FORMA DESCENDENTE---");
        
        for (i=0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if (A[i] < A[j]) {
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        
        // Presentar el vector ordenado
        for (i=0; i<n; i++) {
            System.out.println("A["+i+"]: "+A[i]);
        }
    }
}


