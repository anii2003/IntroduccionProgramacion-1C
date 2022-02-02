/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad9.exceptions;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.print("Ingrese el valor 1: ");
            int valor1 = leer.nextInt();
            
            System.out.print("Ingrese el valor 2: ");
            int valor2 = leer.nextInt();

            int resultado = valor1/valor2;
            
            System.out.println("El resultado es: "+resultado);            
        }
        
        /**catch(ArithmeticException ExpresionAritmetica) {
            System.out.println("Lo sentimos hay un error");
            System.out.println("de tipo "+ExpresionAritmetica);
        }*/
        
        /**catch(InputMismatchException ExcepcionErrorEntrada){
            System.out.println("Lo sentimos hay un error de entrada");
            System.out.println("de tipo "+ExcepcionErrorEntrada);
        }  */
        
        catch(Exception e){
            System.out.println("Lo sentimos hay un error de tipo "+e);
        }
    }    
}
