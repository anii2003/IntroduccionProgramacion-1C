/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1ip;
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        double nota_trab;
        double nota_lecc;
        double nota_parti;
        double nota_examfi;
        double T;
        double L;
        double P;
        double E;
        double nota_final;
        String nombre;
        
        System.out.println("***Programa para calcular la nota final de un alumno***");
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        
        //Ingrese la información requerida (Todo sobre 10 puntos)
        
        System.out.println("Ingrese la nota de trabajos: ");
        nota_trab = leer.nextDouble();
        if (nota_trab > 10) {
            System.out.println("Ojo: La nota no puede ser mayor a 10 puntos");
            System.out.println("***Ingrese la nota de trabajos nuevamente***");
        }
        
        System.out.println("Ingrese la nota de lecciones: ");
        nota_lecc = leer.nextDouble();
        if (nota_lecc > 10) {
            System.out.println("Ojo: La nota no puede ser mayor a 10 puntos");
            System.out.println("***Ingrese la nota de lecciones nuevamente***");
        }
        
        System.out.println("Ingrese la nota de participación: ");
        nota_parti = leer.nextDouble();
        if (nota_parti > 10) {
            System.out.println("Ojo: La nota no puede ser mayor a 10 puntos");
            System.out.println("***Ingrese la nota de participación nuevamente***");
        }
        
        System.out.println("Ingrese la nota del examen final: ");
        nota_examfi = leer.nextDouble();
        if (nota_examfi > 10) {
            System.out.println("Ojo: La nota no puede ser mayor a 10 puntos");
            System.out.println("***Ingrese la nota del examen final nuevamente***");
        }
        
        //Proceso
        
         T = (nota_trab * 20)/100;
         L = (nota_lecc * 30)/100;
         P = (nota_parti * 10)/100;
         E = (nota_examfi * 40)/100;
         
         nota_final = (T + L + P + E);
         
        System.out.println("La nota de trabajos ponderada al 20% es: \n" +T + "\n");
        System.out.println("La nota de lecciones ponderada al 30% es: \n" +L + "\n");
        System.out.println("La nota de participación ponderada al 10% es: \n" +P + "\n");
        System.out.println("La nota del examen final ponderada al 40% es: \n" +E + "\n");
        
        System.out.println("La nota final del alumno es: \n" +nota_final + "\n");
                            
               
        }
    
}
