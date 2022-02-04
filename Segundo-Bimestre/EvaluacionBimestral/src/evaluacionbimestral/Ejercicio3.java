/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionbimestral;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int num, adiv, cont, numint;
        num = 0; adiv = 0; cont = 0; numint = 3;
        
        num = (int)(Math.random()*10);
        
        System.out.println(num+" es el número secreto");
        
        
        System.out.println("**Estimado usuario, usted tiene 3 oportunidades "
                + "para adivinar el número correcto***");
        
        do{
            System.out.print("\nPor favor, ingrese un número: ");
            adiv = leer.nextInt();
            
            if (adiv == num) {
                System.out.println("\n***Felicidades, usted ha adivinado el número :) ***\n");
            }
            
            else{
                cont = cont+1;
                numint = numint - 1;
                                
                if (adiv > num) {
                    System.out.println("\n*El número intoducido ("+adiv+") es mayor al número secreto*");
                }
                else {
                    System.out.println("\n*El número introducido ("+adiv+") es menor al número secreto*");
                }
                               
                System.out.println("\n***A usted le quedan "+numint+" intentos***");
                
                if (numint == 0) {
                    System.out.println("\n***SUS INTENTOS SE HAN AGOTADO***");
                }                
            }
            
        }while((num != adiv) && (cont<3));
    }
}
