import java.util.Scanner;

public class Sesion2 {
    static boolean esPrimo(long numero) {
        if (numero == 1)
            return false;
        boolean esPrimo = true;
        for (long i = 2; i < numero; i++)
        {
            //System.out.println("Divisor: " + i + ", Numero " + numero);
            if (numero % i == 0)
            {
                esPrimo = false;
                break;
            };
        };

        return esPrimo;
    };

    public static void main(String[] args) {
         System.out.println("Hola!\n1. Introduce a un numero entere 0 y 1000: ");
         Scanner sc = new Scanner(System.in);
         long numero = sc.nextLong();

         if (esPrimo(numero))
             System.out.println(numero + " es primo");
         else
             System.out.println(numero + " no es un primo");

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
                 if (esPrimo(i)) {
                     System.out.print("\t" + i);
                     if (contadorDePrimos++ != 0 && contadorDePrimos % 4 == 0)
                         System.out.print('\n');
                 }
             };
         };
    };
}
