/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionalesfc;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declarar e inicializar las variables
        int i, n, j,np, ni;
        n = 0; np = 0; ni = 0; j = 0;
        
        // Ingreso de datos
        System.out.print("Ingrese el límite de números a evaluar: ");
        n = leer.nextInt();

        // Declarar el vector
        int [] A = new int [n];
        
        // Ingresar los elementos de A
        
        for (i=0; i<n; i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
            
            if (A[i]%2 == 0) {
                np = np + 1;
            }
            else {
                ni= ni+1;
            }
        }
        
        // Presentar cada elemento de A
        System.out.println("\n---VECTOR A--");
        for (i=0; i<n; i++) {
            System.out.println("A["+i+"]: "+A[i]);
        }  
        
        // Declarar el vector Par e Impar        
        
        int [] Par = new int [np];
        int [] Impar = new int [ni];
     
        // Establecer datos de los vectores
        
        for (i=0; i<n; i++) {
            if (A[i] % 2 == 0) {
                Par[j] = A[i];
                j = j + 1;                
            }
        }
        j = 0;
        for (i=0; i<n; i++) {
            if (A[i] % 2 != 0) {
                Impar[j] = A[i];
                j = j + 1;
            }
        }            
        
        
        // Presentar el vector Par
        System.out.println("\n---VECTOR PAR--");
        for (j=0; j<np; j++) {
            System.out.println("Par ["+j+"]: "+Par[j]);
        }         
        // Presentar el vector Impar
        System.out.println("\n---VECTOR IMPAR--");
        for (j=0; j<ni; j++) {
            System.out.println("Impar ["+j+"]: "+Impar[j]);
        }
    }
}

