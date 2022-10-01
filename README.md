# EJERCICIO-2-Hoja-3
Función de Entrada SCANNER de JAVA y métodos de MATH, para sumar, multiplicar..

![231](https://user-images.githubusercontent.com/80227002/193427353-22498f27-7c34-4b99-98ab-f8e9887ca81c.png)

```java

/**

2. Escribe un programa que tome como entrada un número entero e indique
   que cantidad hay que sumarle para que el resultado sea múltiplo de 7. 
  
   Un ejemplo:

   • A 2 hay que sumarle 5 para que el resultado sea múltiplo de 7.
   • A 13 hay que sumarle 1 para que el resultado sea múltiplo de 7.

   Si proporcionas el número 2 o el número 13, la salida de la aplicación 
   debe ser 5 0 1, respectivamente.

   PISTA: El operador módulo puede ser útil para solucionar la actividad.
   
 */
 
package com.solomongo.ejercicio2_hoja3;
import java.util.Scanner;
public class Ejercicio2_Hoja3 {
    public static void main(String[] args) {      
        int entero, suma, resto;      
        Scanner entrada = new Scanner(System.in); 
        System.out.print("\n\tEscribe un numero: " );
        entero=entrada.nextInt(); 
        resto=entero%7;
        suma=7-resto;  
        System.out.print("\nHay que añadir "+suma+" para que sea multiplo de 7..\n");    
        }
}

```
![232](https://user-images.githubusercontent.com/80227002/193427359-5a541351-6673-4b47-9bda-71d5d9e4a7c5.png)

