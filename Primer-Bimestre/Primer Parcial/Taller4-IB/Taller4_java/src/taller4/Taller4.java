/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("***Programa para calcular el área de un polígono compuesto*** \n");
        
        //Declarar e inicializar las variables 
        
        double lc, at, ar, A, B, D;
        double ats, area;
        
        lc=0; at=0; ar=0; A=0; B=0; D=0;
        ats=0; area=0;
        
        //Ingresar los datos
        
        System.out.println("Ingrese el lado del cuadrado: ");
        lc = leer.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        at = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        ar = leer.nextDouble();
        
        //Proceso
        
        A = Math.pow(lc, 2);
        B = (lc * at)/2;
        ats = (B * 3);
        D = lc * ar;
        area = A + ats + B;
        
        //Salida de datos
        System.out.println("El área total del polígono compuesto es: \n" +area +" \ncon un cuadrado "
                + "de área: \n" +A +" \ncon tres triángulos rectángulos de área: \n" +ats +" \ny un rectángulo "
                + "de área: \n" +D +"\n");
        
    }
    
}
