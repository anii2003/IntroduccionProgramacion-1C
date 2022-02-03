/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Lab9 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\OneDrive\\Escritorio\\Uni\\"
                    + "Fundamentos Computacionales\\Actividades\\Parcial 1_2B\\ArchivodePrueba\\numeros.txt"));
            
            bw.write("Números aleatorios en rango de 0 a 10\n");
            
            for(int i=0;i<30;i++) {
                double random = (Math.random()*10);
                System.out.println(random);
                
                bw.write(String.valueOf(random) + "\n");
            }
            
            bw.write("\nMatriz de números aleatorios en rango de 0 al 50\n");
            // Declarar la matriz
            int [][] A = new int [20][20];
            
            for (int i=0; i<20; i++) {
                for (int j=0; j<20; j++) {
                    A[i][j] = (int)(Math.random()*50);
                    bw.write(String.valueOf(A[i][j])+"\t");
                }
                bw.write("\n");
            }            
            
            bw.close();
        }
        
        catch(IOException ioe) { // error en la escritura del archivo
            System.out.println("No se puede escribir en el archivo");
        }
        
        // leer el archivo
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\OneDrive\\Escritorio\\Uni"
                    + "\\Fundamentos Computacionales\\Actividades\\Parcial 1_2B\\ArchivodePrueba\\numeros.txt"));
            
            String linea = "";
            
            System.out.println("--- LECTURA DESDE EL ARCHIVO \n");
            
            while(linea != null) {
                System.out.println(linea); // Presentar lo que se almacena en línea
                linea = br.readLine();
            }
            
            br.close();
        }
        
        catch(FileNotFoundException fnfe){ //no se encuentra el archivo
            System.out.println("No se encuentra el archivo");
        }
        
        catch(IOException ioe) { // error en la lectura del archivo
            System.out.println("No se puede leer en el archivo");
        }        
    }
}
