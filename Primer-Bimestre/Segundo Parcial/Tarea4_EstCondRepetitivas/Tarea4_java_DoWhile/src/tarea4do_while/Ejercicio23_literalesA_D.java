/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio23_literalesA_D {
    public static void main(String[] args) {
        System.out.println("Ejercicio 23_pág 197_LiteralesA-D");
        System.out.println("a)");
        // Declarar e inicializar las variables
        int i;
        i = 1;
        // Proceso
        while (i <= 20) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Se ejecutó: "+i+" veces");
        
        System.out.println("------");
        System.out.println("b)");
        // Declarar e inicializar las variables
        int icuenta, cont;
        icuenta = 0; cont = 1;
        // Proceso
        while(icuenta <= 20) {
            System.out.println(icuenta);
            icuenta = icuenta + 2;
            cont = cont + 1;
        }
        System.out.println("Se ejecutó: "+cont+" veces");
        
        System.out.println("------");
        System.out.println("c)");
        // Declarar e inicializar las variables
        int j, k;
        j = 0; k = 1;
        // Proceso
        while(j <= 100) {
            System.out.println(j);
            j=j + 5;
            k = k + 1;
        }      
        System.out.println("Se ejecutó: "+i+" veces");

        System.out.println("------");
        System.out.println("d)");
        // Declarar e inicializar las variables        
        int icuent, contador;
        icuent = 20; contador = 1;
        // Proceso
        while(icuent>=1) {
            System.out.println(icuent);
            icuent=icuent - 1;
            contador = contador + 1;
        }
        System.out.println("Se ejecutó: "+cont+" veces");
    }
}
