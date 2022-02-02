/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Matrices6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Declarar e inicializar las variables
        int i, j, m, n, k, selec;
        double suma, mayor, aux;
        m = 0; n = 0; k = 0; suma = 0; selec = 0; mayor = 0; aux = 0;
        
        // Ingresar los datos
        System.out.print("Ingrese el número de trabajadores: ");
        m = leer.nextInt();
        System.out.print("Ingrese el número de criterios a evaluar: ");
        k = leer.nextInt();
        System.out.print("Número de aspirantes a seleccionar: ");
        n = leer.nextInt();
        
        // Declarar el vector de trabajadores
        String [] codigo = new String [m];
        
        // Ingresar los datos del vector codigo
        for (i=0;i<m;i++) {
            System.out.print("Ingrese el nombre "+i+": ");
            codigo[i] = leer.next();
        }
        
        // Declarar la matriz
        int [][] C = new int [m][k];
        
        
        for (i=0;i<m;i++) {
            System.out.println("***Calificación criterios de "+codigo[i]+"***");
            for (j=0; j<k; j++) {
                System.out.print("Ingrese la calificación del criterio "+j+" de "+codigo[i]+": ");
                C[i][j] = leer.nextInt();
                if ((C[i][j]>10) || (C[i][j]<0)) {
                    System.out.println("\t****Ingrese calificaciones dentro del rango de 0 a 10 puntos*****");
                    System.out.println("\t***EL PROCESO HA FINALIZADO***");
                    System.out.println("\t****REINICIE EL PROGRAMA***");
                    System.out.println("Los datos se obtendrán hasta antes de error detectado");
                    j = k;
                    i = m;
                }
            }
        }
        
        // Declarar el arreglo de media
        double [] Media = new double [m];
        
        System.out.println("***Media***");
        for (i=0;i<m;i++) {
            for (j=0;j<k;j++) {                
                suma = suma + C[i][j];
                Media[i] = suma/k;
            }
            System.out.println(codigo[i]+": "+Media[i]+"   ");
            suma = 0;
        }
        
        // Ordenar el vector media
                
        for (i=0;i<m;i++) {
            for (j=i+1;j<k;j++) {
                if (Media[i]>Media[j]) {
                    mayor = Media[i];
                }
            }
        }        
        
        // Seleccionar los aspirantes para n puestos
        double [] Selec = new double [n];
        String aux1;
        
        for (i=0;i<m;i++) {
            for (j=0;j<k;j++) {
                if (Media [i] > Media[j]) {
                    aux = Media[i];
                    Media [i] = Media[j];
                    Media [j] = aux;
                    // Ordenar también los nombres de los aspirantes
                    aux1 = codigo[i];
                    codigo[i] = codigo[j];
                    codigo[j] = aux1;
                }
            }
        }
        
        System.out.println("***ASPIRANTES SELECCIONADOS***");
        System.out.println("Para "+n+" puestos de trabajo: ");
        for (i=0; i<n; i++) {
                System.out.println(codigo[i]+" es apirante seleccionado con una media de: "+Media[i]);
        }        
    }
}
