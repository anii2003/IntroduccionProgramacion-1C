/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;

/**
 *
 * @author DELL
 */
public class Ejercicio22_literalb {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
       int i,j,k;
       i = 3; j = 1;
       
        do {
            while(j==i) {                
                for(k=i; k==j;k--){
                    System.out.println(i+" "+j+" "+k);
                }
                j = j +1;
            }
            i = i - 1;
       } while (i >= 1);
    }    
}

