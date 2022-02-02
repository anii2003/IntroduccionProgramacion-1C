/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4do_while;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio3_126 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    // Declarar e inicializar las variables
	int sdn, nd, n, cn;

	sdn=0; nd=0;

    // Ingreso de datos
        System.out.println("Número de cifras y la suma de las mismas");
	System.out.print("Por favor, digite un número: ");
	n = leer.nextInt();

	cn = n;

	if(cn < 0) {
           cn = -cn;
        }

	if (cn == 0) {
	// Si el número es 0, entonces n tiene 1 dígito
	// y la suma de sus cifras es cero
            sdn = 0;
            nd = 1;
        }
        else {
		do{
			// Se acumulan la suma de las cifras
			sdn = sdn + (cn % 10);
			nd = nd + 1;

			// Se descarta la cifra sumada
			cn = cn/10;
                } while (cn > 0);
        }
        
        System.out.println(n+" tiene "+nd+" dígitos y la suma de los dígitos de "+n+" es: "+sdn);
    }      
}         
