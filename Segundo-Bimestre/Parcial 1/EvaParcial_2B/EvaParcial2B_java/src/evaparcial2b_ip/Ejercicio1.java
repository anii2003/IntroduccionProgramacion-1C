/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial2b_ip;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int n, i, np, Nneg, Primo;
        double Pnp, Pneg, Pprimo;
        n = 0; np = 0;
        Nneg = 0; Primo = 0;
        
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        // Declarar el arreglo A e ingresar sus valores
        int [] A = new int [n];
        
        for (i=0; i<n; i++) {
            System.out.print("A ["+i+"]: ");
            A[i] = leer.nextInt();            
        }
        
        np = esPar(A, n);
        Nneg = esNeg(A, n);
        Primo = Primo(A, n);
        
        // Obtener los porcentajes
        Pnp = (np*100)/n;
        Pneg = (Nneg*100)/n;
        Pprimo = (Primo*100)/n;
        
        System.out.println("");
        System.out.println("Hay "+np+" números pares que son el "+Pnp+" del total de números");
        System.out.println("Hay "+Nneg+" números negativos que son el "+Pneg+" del total de números");
        System.out.println("Hay "+Primo+" números primos que son el "+Pprimo+" del total de números");
        
        Vector_Par(A, n, np);
        Vector_Neg(A, n,Nneg);
        Vector_Primos(A, n, Primo);
    }   
    
    public static int esPar(int A[], int n){        
        int i, np;
        np = 0;
        
        for (i=0; i<n; i++) {
            
            if (A[i] % 2 == 0) {
              np = np + 1;  
            }
        }
        return np;              
    }
    
    public static int esNeg(int A[], int n){
        int i, Nneg;
        Nneg = 0;
        
        for (i=0; i<n; i++) {
            if (A[i]<0) {
                Nneg = Nneg + 1;
            }
        }
        return Nneg;
    }
    
    public static int Primo(int A[], int n){
        int i, j, Primo, div;
        Primo = 0; div = 0;
        
        for (i=0; i<n; i++) {            
            for (j=1; j<=A[i]; j++) {
                if (A[i] % j == 0) {
                    div = div + 1;
                }                
            }
            
            if (div == 2) {
                Primo = Primo + 1;
            }
            div = 0;
        }
        return Primo;
    }

    // Almacenar los valores pares en el vector PAR
    public static void Vector_Par(int A[], int n, int np){
        // Declarar el vector PAR
        int [] PAR = new int [np];
        int i, j;
        j = 0;
        
        for (i=0; i<n; i++) {
            if (A[i] % 2 == 0) {
                PAR[j] = A[i];
                j = j + 1;                
            }
        }
        
        System.out.println("\n---VECTOR PAR--");
        for (j=0; j<np; j++) {
            System.out.println("PAR ["+j+"]: "+PAR[j]);
        }      
    }
    
    // Almacenar los valores negativos en el vector NEG
    public static void Vector_Neg(int A[], int n, int Nneg){
        // Declarar el vector NEG
        int [] NEG = new int [Nneg];
        int i, j;
        j = 0;
        
        for (i=0; i<n; i++) {
            if (A[i]<0) {
                NEG[j] = A[i];
                j = j + 1;
            }
        }
        
        System.out.println("\n---VECTOR NEG--");
        for (j=0; j<Nneg; j++) {
            System.out.println("NEG ["+j+"]: "+NEG[j]);
        }      
    }
    
    // Almacenar los valores primos en el vector PRIMOS
    public static void Vector_Primos(int A[], int n, int Primo) {
       // Declarar el vector PRIMOS
       int [] Primos = new int [Primo];
       int i, j, k, div;
       k = 0; div = 0;
       
        for (i=0; i<n; i++) {
            for (j=1; j<=A[i]; j++) {
                if (A[i] % j == 0) {
                    div = div + 1;
                }                
            }
            
            if (div == 2) {
                Primos[k] = A[i];
                k = k + 1;
            } 
            div = 0;
        }
        
        // Presentar el vector PRIMOS
        System.out.println("\n---VECTOR PRIMO--");
        for (k=0; k<Primo; k++) {
            System.out.println("PRIMOS ["+k+"]: "+Primos[k]);
        } 
    }           
}

