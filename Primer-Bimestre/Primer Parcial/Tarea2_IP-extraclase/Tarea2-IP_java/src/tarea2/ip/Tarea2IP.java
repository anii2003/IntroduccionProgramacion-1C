/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2.ip;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Tarea2IP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("***Programa para calcular conversiones de unidades***" +"\n");
        
       // Declaración de variables
       
       double m;
       double cm, km, pies, pulg;
       
       // Inicializar las variables
       
       m=0;
       cm=0; km=0; pies=0; pulg=0;
       
       //Ingresar los datos
       
        System.out.println("Ingrese la cantidad en metros: ");
        m = leer.nextDouble();
        System.out.println("");
       
       // Proceso
       
       cm = m*100;
       km = m/1000;
       pies = m*3.28084;
       pulg = m*39.3701;
       
       //Salida de datos
       System.out.println("La cantidad " +m+ " metros, convertida a centímetros es: " +"\n" +cm +"\n");
       System.out.println("La cantidad " +m+ " metros, convertida a kilómetros es: " +"\n" +km +"\n");
       System.out.println("La cantidad " +m+ " metros, convertida a pies es: " +"\n" +pies +"\n");
       System.out.println("La cantidad " +m+ " metros, convertida a pulgadas es: " +"\n" +pulg +"\n");
                     
              
    }
    
}
