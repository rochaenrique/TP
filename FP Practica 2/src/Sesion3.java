import java.util.Scanner;


public class Sesion3 {
    static int menu(Scanner sc) {
        System.out.println("\nAqui puedes:\n1. Escribir un numero entre dos valores.\n2. Comprobar si un numero entre 0 y 1000 es primo.\n3. Escribir numeros primos.\n0. Encerrar el programa.");
        System.out.print("Ingresa un numero: ");
        return sc.nextInt();
    };


    static int leerNumero(Scanner sc, int n1, int n2) {
        System.out.print("Ingresa un numero entre " + n1 + " y " + n2 + ": ");
        int numero = sc.nextInt();
        while (numero < n1 || numero > n2) { 
            System.out.println(numero + " no es valido.");

            System.out.print("Ingresa un numero entre " + n1 + " y " + n2 + ": ");
            numero = sc.nextInt();
        }
        return numero;
    };

    static boolean esPrimo(int n) {
        boolean primo = true;
        if (n < 2)
            n = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    };

    static void escribePrimos(int cantidad)
    {
        int contadorDePrimos = 0;
        for (int i = 0; contadorDePrimos < cantidad; i++)
        {
            if (esPrimo(i)) {
                System.out.printf("%5d", i);
                if (contadorDePrimos++ != 0 && contadorDePrimos % 4 == 0)
                    System.out.print('\n');
            }
        };
        System.out.println();
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = menu(sc);
        while (numero != 0)
        {
            switch (numero) {
                case 1:
                    leerNumero(sc, 0, 10);
                    break;
                case 2:
                    System.out.print("Ingresa un numero entre 0 y 1000: ");
                    int posiblePrimo = sc.nextInt();
                    if (posiblePrimo <= 0 && posiblePrimo > 1000)
                        System.out.println(posiblePrimo + " no es valido.");
                    else {
                        System.out.println(posiblePrimo + (esPrimo(posiblePrimo) ? "" : " no" ) + " es primo.");
                    }
                    break;
                case 3:
                    System.out.print("Cuantos numeros primos te gustaria ver (entre 5 y 20)? ");
                    numero = sc.nextInt();
                    if (numero < 1)
                        System.out.println(numero + " es menor que 1.");
                    else if (numero > 20)
                        System.out.println(numero + " es mayor que 20.");
                    else {
                        escribePrimos(numero);
                    };
                    break;
            };
            numero = menu(sc);
        };
        System.out.println("TCHAU!!!");
        sc.close();
    };
}
