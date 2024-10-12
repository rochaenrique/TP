//2. Realizar un método estático en java que, a partir de un número entero positivo mayor que 1,
//devuelva el mayor divisor del número distinto de él mismo. Verificar su funcionalidad en el
//método main.

import java.util.Scanner;

public class Ejercicio2 { 
    public static int mayorDivisor(int num) { 
        int div = num;
        while (num % --div != 0);  
        return div;
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero positivo mayor que 1: ");
        int n = sc.nextInt();

        if (n > 1) { 
            System.out.printf("El mayor divisor de %d es %d\n", n, mayorDivisor(n));
        };

        sc.close();

    };
};
