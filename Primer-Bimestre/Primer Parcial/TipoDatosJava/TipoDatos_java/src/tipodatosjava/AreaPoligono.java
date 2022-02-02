/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipodatosjava;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AreaPoligono {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        double A;
        double B;
        double C;
        double alTriag;
        double areaT, areaR, areaTotal;
        String nombre;
        
              
        //Ingrese los datos
        
        System.out.println("**Programa para calcular el área de un polígono *** \n");
        System.out.println("Ingrese el nombre del usuario: ");
        nombre = leer.next();
               
        System.out.println("Ingrese la altura del terreno (A): ");
        A = leer.nextDouble();
        
        System.out.println("Ingrese la base del terreno (B)");
        B = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectángulo del terreno (C)");
        C = leer.nextDouble();
        
        //Proceso
        alTriag = A - C;
        areaT = (B * alTriag)/2;
        areaR = B * C;
        areaTotal = areaT + areaR;
        
        System.out.println("El área del triángulo del terreno es: " +areaT+ "\n");
        System.out.println("El área del rectángulo del terreno es: " +areaR +"\n");
        System.out.println("El área total del terreno es: " +areaTotal +"\n");
        
               
    }
    
}
