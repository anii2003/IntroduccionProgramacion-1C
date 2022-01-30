/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructurasCondicionales;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner leer = new Scanner (System.in); 
        
        //Declaración e inicialización de variables
        
        int num = 0;
        
        //Entrada de datos
        
        System.out.println("Estructuras lógicas condicionales simples");
        System.out.println("Programa para verificar si un número es par\n");
        
        System.out.print("Ingrese un número para verificar: ");
        
        num = leer.nextInt();
        
        //Proceso
        
        //Verificar si un número es par o impar
        /*if (num % 2 == 0) {
            
            System.out.println("El número " +num +" es par");
        }
        else {
            System.out.println("El número " +num +" es impar");
        }*/
         
        //Verificar si un número es par y positivo, o sino es impar
        /*if (num % 2 == 0) {
            
            if (num > 0){
                System.out.println("El número " +num +" es par y positivo");
            }
        }
        else {
            System.out.println("El número " +num +" es impar");
        }*/
        
        if ((num % 2 == 0) && (num > 0)) {
            
                System.out.println("El número " +num +" es par y positivo");
        }
        else {
                if (num % 2 == 0){
                    System.out.println("El número " +num +" es par");
                }
                else {
                    System.out.println("El número " +num +" es impar");
                } 
        }
    }
}
