//1. Desarrollar un programa que contenga un método de clase (estático) que recibe como
//argumentos dos números enteros y muestra todos los números enteros comprendidos entre ellos,
//ambos incluidos.
//Se deberán realizar dos llamadas en el programa principal, una para el rango [-10,10] y otra
//para un rango cuyos límites se solicitarán por teclado.

import java.util.Scanner;

public class Ejercicio1 { 
    public static void mostrarNumerosEntre(int n1, int n2) { 
        for (; n1 <= n2; n1++)  
           System.out.printf("%d, ", n1); 

        System.out.print('\n');
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numeros en [-10, 10]:");
        mostrarNumerosEntre(-10, 10);

        System.out.println("\nIntroduce el un limite inferior: ");
        int n1 = sc.nextInt();
        System.out.println("\nIntroduce el un limite superior: ");
        int n2 = sc.nextInt();

        if (n1 <= n2) { 
            System.out.printf("Numeros en [%d, %d]:", n1, n2);
            mostrarNumerosEntre(n1, n2);
        } else 
            System.out.println("Has introducido los limites incorrectamente");

        sc.close();

    };
};
