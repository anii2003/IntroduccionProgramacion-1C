/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,n;
        double suma, prom, mayor;
                
        n = 0; suma = 0; prom = 0; mayor = 0;
        
        // Ingresar los datos
        
        System.out.print("Ingrese el número de notas: ");
        n = leer.nextInt();
        
        double[] Notas = new double [n]; // Declarar vector
        String [] Nombres = new String [n];
        
        // Ingresa las notas al vector   
        
        for (i=0; i<n; i++) {
            System.out.print("Ingrese el nombre "+i+": ");
            Nombres[i] = leer.next();            
            System.out.print("Ingrese la nota de "+Nombres[i]+": ");            
            Notas[i] = leer.nextDouble();            
        }
        
        // Calcular la suma de las notas
        
        for (i=0; i<n; i++) {
            suma = suma + Notas[i];
        }
        
        // Promedio de las notas
        
        for (i=0; i<n; i++) {
            prom = suma/(n-1);
        }
        
        // Presentar los elementos del vector Notas
        
        System.out.println("***Las notas son:****");
        for (i=0; i<n; i++) {
            System.out.println("Notas ["+i+"] = "+Notas[i]);
        }
        System.out.println("");
        System.out.println("El promedio de las notas es: "+prom);
        
        // Nota más alta
        
        mayor = Notas[0];
        
        for (i=1; i<n; i++) {
            if (Notas[i] > mayor) {
                mayor = Notas[i];                
            }
            //System.out.println("----"+mayor);
        }
        System.out.println("La nota mayor del arreglo es: "+mayor);
        
        System.out.println("----Las notas en las posiciones impares son: ");
        for (i=0; i<n; i++) {
            if (i % 2 != 0) {
                System.out.println("Notas ["+i+"] = "+Notas[i]);
            }
        }         
        
        System.out.println("\nNOTAS Y NOMBRES DE ESTUDIANTES\n");
        for (i=0; i<n; i++) {
            System.out.println(Nombres[i]+" tiene una nota de: "+Notas[i]);
        }
    }    
}
