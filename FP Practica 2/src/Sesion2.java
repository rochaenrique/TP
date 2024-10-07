import java.util.Scanner;

public class Sesion2 {

    public static void main(String[] args) {
         System.out.println("Hola!\n1. Introduce a un numero entere 0 y 1000: ");
         Scanner sc = new Scanner(System.in);
         int numero = sc.nextInt();

         boolean esPrimo = true;
         if (numero != 1) { 
             for (int i = 2; i < numero; i++)
             {
                 if (numero % i == 0)
                 {
                     esPrimo = false;
                     break;
                 };
             };
         };

         System.out.println(numero + (esPrimo ? "" : " no") + " es un primo");

         System.out.print("2. Cuantos numeros primos te gustaria ver (entre 5 y 20)? "); 
         numero = sc.nextInt();

         if (numero < 5)
             System.out.println(numero + " es menor que 5.");
         else if (numero > 20)
             System.out.println(numero + " es mayor que 20.");
         else {
             int contadorDePrimos = 0;
             for (int i = 0; contadorDePrimos < numero; i++)
             {
                 esPrimo = true;
                 if (numero != 1) { 
                     for (int j = 2; j < numero; j++)
                     {
                         if (numero % j == 0)
                         {
                             esPrimo = false;
                             break;
                         };
                     };
                 };

                 if (esPrimo) {
                     System.out.printf("%5d", i);
                     if (contadorDePrimos++ != 0 && contadorDePrimos % 4 == 0)
                         System.out.print('\n');
                 }
             };
         };
         sc.close();
    };
}
