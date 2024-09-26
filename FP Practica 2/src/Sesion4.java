import java.util.Scanner;
import java.lang.Math;

public class Sesion4 {
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

    static void primosGemelos(int n1, int n2) {
        boolean primo;
        int gemelosImpresos = 1;
        if (n1 < 2)
            n1 = 2;
        for (;n1 < n2 - 2; n1++) {
            if (esPrimo(n1) && esPrimo(n1 + 2))
                System.out.printf("%d. %3d    %3d %n", gemelosImpresos++, n1, n1 + 2);
        };
    };

    static void mostrarSumaDePrimos(int n){
        int sumasImpresas = 0;
        for (int i = 2; i <= n; i++) {
            if (n - i > i && esPrimo(i) && esPrimo(n - i)) {
                System.out.printf("%d. %3d + %3d = %d %n", sumasImpresas++, i, n - i, n);
            }
        };
    };

    static boolean esPrimoRecursivo(int n) {
        return esPrimo(n);
    };

    static double potencia(double base, double exponente) {
       return Math.pow(base, exponente);
    };

    static void menu(Scanner sc) {
        boolean activado = true;
        int n, opcion;

        while (activado) {
            System.out.print("""
                    \n
                    1. Comprobar si un numero es primo.
                    2. Escribir los n numeros primos.
                    3. Escribir numeros primos gemelos entre dos valores
                    4. Numero par como suma de dos primos.
                    5. Comprobar si un numero es primo de manera recursiva.
                    6. Calcular potencia.
                    0. Finalizar el programa.
                    """);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca un numero entre 1 y 1000: ");
                    n = sc.nextInt();
                    if (n >= 1 && n <= 1000) {
                        System.out.println(n + (esPrimoRecursivo(n) ? "" : " no") + " es primo.");
                    };
                    break;
                case 2:
                    System.out.print("Introduze un numero entre 5 y 20: ");
                    //usar sesion 2 aqui
                    break;
                case 3:
                    System.out.print("Introduzca un numero entre 1 y 500: ");
                    n = sc.nextInt();
                    if (n >= 1 && n <= 500) {
                        System.out.print("Introduzca un segundo numero entre " + n + " y 500: ");
                        int n2 = sc.nextInt();
                        if (n2 >= 1 && n2 <= 500) {
                            primosGemelos(n, n2);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Introduzca un numero par entre 4 y 1000: ");
                    n = sc.nextInt();
                    if (n >= 4 && n <= 1000 && n % 2 == 0) {
                        mostrarSumaDePrimos(n);
                    }
                    ;
                    break;
                case 5:
                    System.out.print("Introduzca un numero entre 1 y 1000: ");
                    n = sc.nextInt();
                    if (n >= 1 && n <= 1000) {
                        System.out.println(n + (esPrimoRecursivo(n) ? "" : " no") + " es primo.");
                    };
                    break;
                case 6:
                    System.out.print("Introduzca una base entre -100 y 100: ");
                    double base = sc.nextDouble();

                    if (base >= -100 && base <= 100) {
                        System.out.print("Introduzca un expoente entre 0 y 10: ");
                        double exponente = sc.nextInt();
                        if (exponente >= 0 && exponente <= 100) {
                            System.out.println(base + " ^ " + exponente + " = " + potencia(base, exponente));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Adios!");
                    activado = false;
                    break;
            }
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu(sc);
    };
}
