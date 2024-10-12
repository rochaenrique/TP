import java.util.Scanner;

public class Ejercicio7 {
    public static int leerNumeroPositivo(Scanner sc, String msg) { 
        System.out.print(msg);
        int n = sc.nextInt();
        while (n < 0) { 
            System.out.printf("Numero invalido. Intenta otra vez: ");
            n = sc.nextInt();
        };
        return n;
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int n1 = leerNumeroPositivo(sc, "Introduce un primer numero positivo: ");
        int n2 = leerNumeroPositivo(sc, "Introduce un segundo numero positivo: ");

        System.out.printf("Los numeros perfectos entre %d y %d son:\n", n1, n2);
        while (n1++ < n2) { 
            if (Ejercicio6.numeroPerfecto(n1))
                System.out.printf("\t%3d%n", n1);
        };
        sc.close();

    };
};
