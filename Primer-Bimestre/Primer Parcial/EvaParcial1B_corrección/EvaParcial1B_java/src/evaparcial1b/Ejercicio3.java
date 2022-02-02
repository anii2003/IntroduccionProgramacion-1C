/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial1b;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        // Declaración e inicialización de variables
        
        double n;
        n = 0;
        
        // Datos de entrada
        
        System.out.print("Ingrese su calificación: ");
        n = leer.nextDouble();
        
        // Condiciones que cualifican la nota del alumno
        
        if (n >= 3.0) { //La nota es válida como aprobada
            if ((n >= 4.6) && (n <= 5.0)) {
            System.out.println("Estudiante excelente");
            System.out.println("");
            }
            else {
                if ((n >= 4.1) && (n <= 4.5)) {
                    System.out.println("El alumno es muy bueno");
                    System.out.println("");
                }
                else {
                    if ((n >= 3.6) && (n <= 4.0)) {
                        System.out.println("El estudiante es bueno");
                        System.out.println("");
                    }
                    else {
                        if ((n >= 3.3) && (n <= 3.5)) {
                            System.out.println("El alumno registró un desempeño aceptable");
                            System.out.println("");
                        }
                        else {
                            if ((n >= 3.0) && (n <= 3.2)) {
                                System.out.println("Alumno aprobado");
                                System.out.println("");
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("El alumno registra una calificación no aprobatoria");
            System.out.println("");
        }
    }
}