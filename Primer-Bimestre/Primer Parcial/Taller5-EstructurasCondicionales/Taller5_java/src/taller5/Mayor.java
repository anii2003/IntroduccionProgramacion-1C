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
public class Mayor {
    
    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
    
            //Declaración e inicialización de variables
            double a, b, c, mayor;
            a = 0; b = 0; c = 0; mayor = 0;
            
            //Entrada de datos
            System.out.println("Ingrese el primer número: ");
            a = leer.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            b = leer.nextDouble();
            System.out.println("Ingrese el tercer número: ");
            c = leer.nextDouble();
            System.out.println("");
            
            //Proceso
            if ((a >= b) && (a >= c)) 
            {
                mayor = a;
                System.out.println("El número mayor es: " +mayor);
            }
            else 
            {
                if (b > c) 
                {
                mayor = b;
                System.out.println("El número mayor es: " +mayor);
                }
                else {
                        mayor = c;
                        System.out.println("El número mayor es: " +mayor);
                        System.out.println("");
                    }  
                }
            }
        }
    
        
