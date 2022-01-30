/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio23_literalesE_G {
    public static void main(String[] args) {
        System.out.println("Ejercicio 23_pág 197_LiteralesA-D");
        System.out.println("e)");
        // Declarar e inicializar las variables
        int icuenta, cont;
        icuenta = 20; cont = 1;
        // Proceso
        while(icuenta >= 1) {
            System.out.println(icuenta);
            icuenta = icuenta - 2;
            cont = cont + 1;
        }
        System.out.println("Se ejecutó: "+cont+" veces");
        
        System.out.println("------");
        System.out.println("f)");
        // Declarar e inicializar las variables
        int j;
        double cuenta;
        cuenta = 1; j = 1;
        // Proceso
        while(cuenta <= 16.2) {
            System.out.println(cuenta);
            cuenta = cuenta + 0.2;
            j = j + 1;
        }
        System.out.println("Se ejecutó: "+j+" veces");

        System.out.println("------");
        System.out.println("g)");
        // Declarar e inicializar las variables
        int xcnt, i;
        xcnt = 20; i = 1;
        // Proceso
        while(xcnt >= 10) {
            System.out.println(xcnt);
            xcnt = xcnt - 1;
            i = i + 1;
        }        
        System.out.println("Se ejecutó: "+i+" veces");
    }
    
}
