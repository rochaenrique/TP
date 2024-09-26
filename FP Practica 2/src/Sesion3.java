import java.util.Scanner;


public class Sesion3 {
    static int menu(Scanner sc) {
        System.out.println("Aqui puedes:\n1. Escribir un numero entre dos valores.\n2. Comprobar si un numero entre 0 y 1000 es primo.\n3. Escribir numeros primos.\n0. Encerrar el programa.");
        System.out.print("Ingresa un numero: ");
        return sc.nextInt();
    };


    static int leerNumero(Scanner sc, int n1, int n2) {
        int numero;
        while (true)
        {
            System.out.print("Ingresa un numero entre " + n1 + " y " + n2 + ": ");
            numero = sc.nextInt();

            if (numero >= n1 && numero <= n2) {
                return numero;
            };

            System.out.println(numero + " no es valido.");
        }
    };

    static boolean esPrimo(int numero) {
        if (numero == 1)
            return false;
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++)
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

    static void escribePrimos(int cantidad)
    {
        int contadorDePrimos = 0;
        for (int i = 0; contadorDePrimos < cantidad; i++)
        {
            if (esPrimo(i)) {
                System.out.print("\t" + i);
                if (contadorDePrimos++ != 0 && contadorDePrimos % 4 == 0)
                    System.out.print('\n');
            }
        };
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        int numero;
        mainloop:
        while (rodando)
        {
            switch (menu(sc)) {
                case 1:
                    numero = sc.nextInt();
                    if (numero <= 0 && numero > 1000)
                        System.out.println(numero + " no es valido.");
                    else {
                        if (esPrimo(numero))
                            System.out.println(numero + " es primo.");
                    }
                    break;
                case 2:
                    leerNumero(sc, 0, 10);
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
                case 0:
                    break mainloop;
                default:
                    continue;
            };
        };
    };
}
