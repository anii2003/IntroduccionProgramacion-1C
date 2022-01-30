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
public class NumEnteroVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int i, n, num, cont;
        n = 0; num = 0; cont = 0;
        
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        
        // Declarar el vector
        int [] A = new int [n];
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
            if (A[i] == num) {
                cont = cont + 1;                
            }
        }
        
        for (i=0;i<n;i++) {
            if (A[i] == num) {
                System.out.println("El número entero "+num+" se ha repetido en la posición: A["+i+"]");
            }
        }        
        System.out.println("El número entero " +num+ " se ha repetido "+cont+" veces.");        
    }
}

