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
public class NumMayorVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int i, n, mayor;
        mayor = 0; n = 0;
        
        // Ingresar datos
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();        
        
        // Declarar el vector
        
        int [] A = new int [n];
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
            if (i==0) {
                mayor = A[i];
            }
            
            if (mayor < A[i]) {
                mayor = A[i];
            }
        }        
        
        for (i=0;i<n;i++) {
            if (mayor == A[i]) {
                System.out.println("A ["+i+"] contiene el número mayor y es: "+mayor);
            }
        }         
    }
}
