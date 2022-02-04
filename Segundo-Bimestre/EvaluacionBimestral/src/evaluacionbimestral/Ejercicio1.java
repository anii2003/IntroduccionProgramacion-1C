/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionbimestral;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer  = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        
        int i, j, n,cont, contn;
        double porc;
        n=0; cont=0; contn=0; porc=0;
        
        // Ingresar los datos
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = leer.nextInt();
        
        int [][] RALA = new int [n][n];
        
        // Recorrer la matriz A e ingresar sus datos
        
        System.out.println("***Ingresar los datos de la matriz A***");
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A ["+i+"]["+j+"]: ");
                RALA[i][j] = leer.nextInt();
                if(RALA[i][j]==0){
                    cont = cont+1;
                }
                else{
                    contn = contn+1;
                }
            }
        }
        
        // Imprimir la matriz RALA
        
        System.out.println("Matriz Rala");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(RALA[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
        porc = (cont*100)/(n*n);
        
        System.out.println("Porcentaje de valores nulos: "+porc);
        
        // Determinar si la matriz es rala o no
        
        if(porc>=75){            
            matrizRala(RALA,n,cont,contn);          
        }
        else{
            System.out.println("***LA MATRIZ NO ES RALA***");
        }
                
    }
    public static void matrizRala(int [][] RALA,int n,int cont,int contn){
        
        int k,l,z;
        k=0;l=0;z = 0;
        
        // Se declara la matriz reducida
        
        int [][] RED =new int [contn+1][3];
        
        System.out.println("\nMatriz RED");
        for (int i = 0; i < n; i++) {
            
            if(i==0){
                
            // Imprimir la primera fila cuando i vale 0
            
            System.out.print(n + "   "+ n  +"    "+ contn);
            System.out.println(" ");
            }
            
            for (int j = 0; j < n; j++) {
                
                if(RALA[i][j] != 0){
                    
                    z = z + 1;
                    RED[z][2] = RALA[i][j];
                    k = i;
                    l=j;
                    
                    // Imprimir la matriz Reducida de acuerdo a las posiciones
                    
                    System.out.print(k + "   "+ l  +"    "+ RED[z][2]);
                    System.out.println(" ");                                                 
                }
            }
        }       
    }           
}
