import java.util.Scanner;

public class Sesion4 {
    public static void primosGemelos(int n1, int n2) {
        int gemelosImpresos = 1;
        System.out.println("Primos gemelos entre " + n1 + " y " + n2 + ": ");
        if (n1 < 2)
            n1 = 2;
        for (;n1 < n2 - 2; n1++) {
            if (Sesion3.esPrimo(n1) && Sesion3.esPrimo(n1 + 2))
                System.out.printf("\t%d. %3d    %3d %n", gemelosImpresos++, n1, n1 + 2);
        };
    };

    public static void mostrarSumaDePrimos(int n){
        int sumasImpresas = 1;
        for (int i = 2; i < n; i++) {
            if (n - i > i && Sesion3.esPrimo(i) && Sesion3.esPrimo(n - i)) {
                System.out.printf("\t%d. %3d + %3d = %d %n", sumasImpresas++, i, n - i, n);
            }
        };
    };

    public static boolean esPrimoRecursivo(int numero) {
        return esPrimoRecursivo(numero, 2);
    };

    private static boolean esPrimoRecursivo(int numero, int posibleDivisor) {
        boolean resultado = true;
        if (posibleDivisor <= numero / 2) { 
            resultado = false;
            if (numero % posibleDivisor != 0) 
                resultado = esPrimoRecursivo(numero, posibleDivisor + 1);
        };
        return resultado;
    };

    public static double potencia(double base, double exponente) {
        double resultado = 1;
        if (exponente != 0) { 
            resultado = base * potencia(base, exponente - 1);
        };
        return resultado;
    };


    public static int menu(Scanner sc) {
            System.out.println("""
                    \n
                    1. Comprobar si un numero es primo.
                    2. Escribir los n numeros primos.
                    3. Escribir numeros primos gemelos entre dos valores
                    4. Numero par como suma de dos primos.
                    5. Comprobar si un numero es primo de manera recursiva.
                    6. Calcular potencia.
                    0. Finalizar el programa.
                    """);
        System.out.print("Ingresa un numero: ");
        return sc.nextInt();
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = menu(sc);
        int n;
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    n = Sesion3.leerNumero(sc, 1, 1000);
                    System.out.println(n + (esPrimoRecursivo(n) ? "" : " no") + " es primo.");
                    break;
                case 2:
                    n = Sesion3.leerNumero(sc, 5, 20);
                    Sesion3.escribePrimos(n);
                    break;
                case 3:
                    n = Sesion3.leerNumero(sc, 1, 500);
                    if (n >= 1 && n <= 500) {
                        int n2 = Sesion3.leerNumero(sc, n, 500);
                        if (n2 >= 1 && n2 <= 500) {
                            primosGemelos(n, n2);
                        }
                    }
                    break;
                case 4:
                    n = Sesion3.leerNumero(sc, 4, 1000);
                    if (n % 2 == 0) {
                        mostrarSumaDePrimos(n);
                    }
                    ;
                    break;
                case 5:
                    n = Sesion3.leerNumero(sc, 1, 1000);
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
            }
            opcion = menu(sc);
        }
        System.out.println("TCHAU!!!");
        sc.close();
    };
}
