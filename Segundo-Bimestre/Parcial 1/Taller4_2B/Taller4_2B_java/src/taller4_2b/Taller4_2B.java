/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4_2b;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Taller4_2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int n, i;
        n = 0;
        
        // Ingresar datos
        System.out.print("Ingrese el número de elementos del vector: ");
        n = leer.nextInt();
        
        i = n;
        
        // Declarar los vectores V y C
        int [] V = new int [50];
        int [] C = new int [50];
        
        for (i=0; i<n; i++) {
            System.out.print("Ingrese el elemento V["+i+"]: ");
            V[i] = leer.nextInt();
        }
        
        // Llamado de la función que calcula los cuadrados de los números
        for (i=0; i<n; i++) {
            C[i] = Cuadrado_Suc(V[i]);
        }
        
        // Impresión de los cuadrados sucesivos contenidos en el vector C
        i = 0;
        
        while (i<n) {
            System.out.println("El número contenido en la posición "+i+" del vector");
            System.out.println(V[i]+" tiene cuadrado "+C[i]);
            i = i + 1;
        }        
    }
    
    public static int Cuadrado_Suc(int m) {
        int r, j;
        r = 0;
        j = m;
        do {
            r = r + m;
            j = j - 1;
        } while (j!=0);
        return r;
    }
    
}
