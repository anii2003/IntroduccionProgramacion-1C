/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio25_literalE {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
        int total, icnt;
        total = 1; icnt = 1;
        // Proceso
        System.out.println("Ejercicio 25, pág 197-Mancilla");
        System.out.println("Literal E");
        while(icnt <= 8){
            total = total*icnt;
            icnt = icnt + 1;
        }
        System.out.println("e) Variable total = "+total);            
    }
}        

