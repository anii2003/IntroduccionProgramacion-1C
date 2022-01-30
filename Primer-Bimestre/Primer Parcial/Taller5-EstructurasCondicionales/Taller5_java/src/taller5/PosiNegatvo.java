/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PosiNegatvo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //Declaración de variables
        double a;
        a = 0;
        
        //Datos de entrada
        
        System.out.println("Ingrese el número: ");
        a = leer.nextDouble();
        
        //Proceso
        
        if (a == 0) {
            System.out.println("El número que ingresó es un número neutro");           
        }
        else {
            if (a > 0) {
                System.out.println("El número " +a +" es positivo");
            }
            else {
                System.out.println("EL número " +a +" es negativo");
                System.out.println("");
            }    
        }
    }
}