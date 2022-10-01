/**
 * @author Daw120
 * 
 * 2. Escribe un programa que tome como entrada un número entero e indique
      que cantidad hay que sumarle para que el resultado sea múltiplo de 7. 
Un ejemplo:

• A 2 hay que sumarle 5 para que el resultado sea múltiplo de 7.

• A 13 hay que sumarle 1 para que el resultado sea múltiplo de 7.

Si proporcionas el número 2 o el número 13, la salida de la aplicación debe 
ser 5 0 1, respectivamente.

       Pista: El operador módulo puede ser útil para solucionar la actividad.
 */
 
package com.solomongo.ejercicio2_hoja3;
import java.util.Scanner;
public class Ejercicio2_Hoja3 {
    public static void main(String[] args) {
        
        int entero, suma, resto;
        
        Scanner entrada = new Scanner(System.in); // con new nuevo elemento
        System.out.print("\n\tEscribe un numero: " );
        entero=entrada.nextInt(); // conversion del tipo String (E) a Int
   
        resto=entero%7; // si el resto YA es cero... SE SUMA 7 y da!!
        suma=7-resto;   // igual: lo que necesita sumarle para dar 7..
        System.out.print("\nHay que anadir "+suma+" para que sea multiplo de 7..\n");    
        }
}
