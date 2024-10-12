//1. Realizar un programa que, lea de teclado un número entero entre 0 y 9.999 lo muestre con
//las cifras al revés. Si el número introducido no es correcto, mostrará un mensaje de error.
import java.util.Scanner;

public class Ejercicio1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entre 0 y 9999: ");

        int n = sc.nextInt();

        if (n >= 0 && n <= 9999) {
            int resultado = 0;
            while (n > 0) { 
                resultado = resultado * 10 + n % 10;
                n /= 10;
            };

            System.out.println("Numero al reves: " + resultado);
        } else  
            System.out.println("El numero introducido no es valido.");
        sc.close();

    };
};
