/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Edadperson {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        int anioN, mesN, diaN, anioA, mesA, diaA, anios, meses, dias, opc;
 
        anioN = 0; mesN = 0; diaN = 0; anioA = 0; mesA = 0; diaA = 0; anios = 0; meses = 0; dias = 0; opc = 0;
        
        System.out.println("Ingrese año de nacimiento: ");
        anioN = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        mesN =leer.nextInt();
        System.out.println("Ingrese dia de nacimiento: ");
        diaN = leer.nextInt();
        
        System.out.println("Ingrese el año actual: ");
        anioA = leer.nextInt();
        System.out.println("Ingrese el mes actual: ");
        mesA = leer.nextInt();
        System.out.println("Ingrese el dia actual: ");
        diaA = leer.nextInt();
        
        //proceso
        
        if(((mesN > mesA)&&(mesA<=12)&&(mesN<=12))){
            anios = (anioA - anioN)-1;
        }
        else{
            anios = anioA - anioN;
        }
        if(mesN <= mesA){
            meses = (mesA - mesN);
        }
        else{
            meses = 12 - (mesN - mesA);
        }
        if(diaN > diaA){
            
            System.out.println("Escoja una opcion del siguiente menú: ");
            System.out.println("1. Mi mes de nacimiento tiene 30 días");
            System.out.println("2. Mi mes de nacimiento tiene 31 días");
            System.out.println("Ingrese una opción: ");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1: {
                    dias = 30 - (diaN - diaA); 
                }
                break;
                case 2: {
                    dias = 31 - (diaN - diaA);  
                }
                break;
                default: {
                    System.out.println("La opción que ingresó no es válida");
                }
                break;
            }
        }
        else {
            
            dias = diaA - diaN ;
        }
        if(meses > 12){
            anios = anios + 1;
        }
        if(dias > 30){
           dias = meses - 1;
        }
        System.out.println("");
        
        //salida
        System.out.println("Estimado/a usuario: \nSu edad equivale a "+anios + " años, " +meses + " meses y " + dias + " días." );
        System.out.println("");
    }
    
}

