/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int n, i, aux;
        n = 10; aux = 0;
               
        // Declarar el vector
        int [] A = new int [n];
        
        // Ingresar los datos en el vector
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
        // Crear la función
        aux = Pos_Mdig(A, n);
        
        System.out.println("\nEl número con mayor cantidad de dígitos se"
                + "encuentra en la posición A["+aux+"]");
        System.out.println("");        
    }
    
    public static int Pos_Mdig(int A[], int n) {
        int i, nd, mayor, aux;
        nd = 0; mayor = 0; aux = 0;

        // Determinar el número de cifras de cada valor almacenado
        for (i=0;i<n;i++) {
            
            if (A[i]<0) {
                A[i] = -A[i];
            }
            
            if (A[i] == 0) {
                nd = 1;
            }
            nd = 0;
            
            while (A[i]>0) {
                A[i] = A[i]/10;
                nd = nd + 1;               
            }           
            
            if (nd > mayor) {
                mayor = nd;
                aux = i;
            }            
        }
        return aux;        
    }
}
