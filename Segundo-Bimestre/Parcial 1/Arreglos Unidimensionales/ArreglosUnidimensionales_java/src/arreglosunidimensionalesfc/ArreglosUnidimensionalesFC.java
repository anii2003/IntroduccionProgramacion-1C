/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosunidimensionalesfc;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ArreglosUnidimensionalesFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int i, n;        
        i=0; n=5;
        
        // Declaramos los vectores
        int [] A = new int [n];
        int [] B = new int [n];
        
        System.out.println("\t***INGRESE LOS DATOS DEL VECTOR A***");
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
        System.out.println("\t***INGRESE LOS DATOS DEL VECTOR B***");
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento B["+i+"]: ");
            B[i] = leer.nextInt();
        }
        
        // Comparar ambos vectores
        System.out.println("\t****RESULTADOS****");
        for (i=0;i<n;i++) {
            if (A[i] == B[i]) {
                System.out.println("El vector A y B en la posición "+i+" tienen el mismo número ("+A[i]+")");
            }
            else {
                System.out.println("El vector A["+i+"]"+" y el vector B ["+i+"] no tienen el mismo número.");
                System.out.println("A = "+A[i]+" y B = "+B[i]);
            }
        }        
        
    }
    
}
