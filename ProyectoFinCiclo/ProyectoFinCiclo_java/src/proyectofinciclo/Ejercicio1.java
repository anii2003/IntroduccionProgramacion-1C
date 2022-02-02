/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int n, i, nd, mayor, aux;
        n = 0; nd = 0; mayor = 0; aux = 0;
        
        // Solicitar el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        // Declarar el vector
        int [] A = new int [n];
        
        // Ingresar los datos en el vector
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
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
            
            System.out.println("A["+i+"] tiene "+nd+" dígitos");
            
            if (nd > mayor) {
                mayor = nd;
                aux = i;
            }            
        }
        System.out.println("El número con mayor cantidad de dígitos se encuentra en la posición A["+aux+"]");
    }    
}
