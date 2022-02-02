/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Tarea3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        //Declaración e inicialización de las variables
        int num1, num2, dif; 
        num1 = 0; num2 = 0; dif = 0;
        
        //Datos de entrada
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        System.out.println("");
        
        //Proceso
        
        if (num1 >= num2) {
            dif = num1 - num2;
            System.out.println("El resultado de la diferencia es: " +dif);
            System.out.println("");
        }
        else {
            if (num2 > num1) {
                dif = num2 - num1;
                System.out.println("El resultado de la diferencia es: " +dif);
                System.out.println("");
            }
        }
        if (dif > 0) {
            dif = num1 - num2;
        }
        else {
            if (dif == 0) {
            System.out.println("***Los valores ingresados generan indeterminaciones, por favor vuelva a ingresar***");
            System.out.println("");
            }
        }
        if ((num1 % dif == 0) && (num2 % dif == 0)) {
            System.out.println("Dicha diferencia es divisor exacto de " +num1 +" y " +num2);
            System.out.println("");
        }
        else {
            if (num1 % dif == 0) {
                System.out.println("Dicha diferencia es un divisor exacto de " +num1);
                System.out.println("");
            }
            else {
                if (num2 % dif == 0){
                    System.out.println("Dicha diferencia es un divisor exacto de " +num2);
                    System.out.println("");
                }
                else {
                    System.out.println("Dicha diferencia NO es un divisor exacto ni de " +num1 +" ni de " +num2);
                    System.out.println("");
                }
            }
        }
    }   
}


