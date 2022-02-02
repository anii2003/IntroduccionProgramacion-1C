/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_2b;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio5_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int k, n, i, j, q, g, rd;
        k = 0; n = 0; i = 0; j = 0; q = 0; g = 0; rd = 0;
        
        int[][] Disp = new int [50][50];
        
        System.out.print("Ingrese el número de góndolas: ");
        k = leer.nextInt();
        System.out.print("Ingrese el número de anaqueles: ");
        n = leer.nextInt();
        
        i = 0; j = 0;
        
        for (i=0; i<k; i++) {
            for (j=0; j<n; j++) {
                System.out.print("Disp["+i+"]["+j+"]: ");
                Disp[i][j] = leer.nextInt();
            }
        }
        // Se hace el chequeo de la disponibilidad
        // del anaquel q en la góndola g
        
        System.out.print("Ingrese el anaquel (q) a evaluar: ");
        q = leer.nextInt();
        System.out.print("Ingrese la góndola (g) que necesita comprobar: ");
        g = leer.nextInt();
        
        rd = FunDisp(Disp, g, q);
        
        if (rd == 0) {
            System.out.println("El anaquel "+q+" en la góndola "+g+" está disponible");
        }
        else {
            System.out.println("El anaquel "+q+" en la góndola "+g+" no está disponible");
        }
    }
    
    public static int FunDisp(int Disp[][], int g, int q) {
        if (Disp[g][q] == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
