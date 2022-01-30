/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Aprob_Reprob {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
       // Declarar e inicializar las variables
       int aprob, reprob, i, n;
       double nota;
       
       aprob = 0; reprob = 0; nota = 0; n = 0; i = 1;
       
       // Ingrese los datos
        System.out.println("Programa para calcular alumnos reprobados y aprobados");
        System.out.print("Ingrese un límite: ");
        n = leer.nextInt();
        System.out.println("***A continuación ingrese únicamente calificaciones de 0 a 10 puntos***");
        System.out.println("Si ingresa valores menores a 0 o mayores a 10 el proceso se interrumpirá");
       // Proceso
        do{
            System.out.print("Ingrese una calificación: ");
            nota = leer.nextInt();

            if ((nota>=7) && (nota<=10)) {
                System.out.println("Alumno aprobado");
                aprob = aprob + 1;
                i = i + 1;
            }
            else {
                if ((nota >= 0) && (nota < 7)) {
                    System.out.println("Alumno reprobado");
                    reprob = reprob + 1;
                    i = i + 1;
                }        
            }
            
        }while((i <= n)&&(nota >= 0)&&(nota <= 10));       
        
        System.out.println("-------------");
        System.out.println("Resultados: ");
        System.out.println("Existen "+aprob+" alumnos aprobados");
        System.out.println("Existen "+reprob+" alumnos reprobados");         
    }
}

        
    

