import java.util.Scanner;

public class Ejercicio6 { 
    public static int sumaDivisores(int n) { 
        int resultado = 1;
        for (int posibleDivisor = 2; posibleDivisor <= n / 2; posibleDivisor ++) { 
            if (n % posibleDivisor == 0) 
                resultado += posibleDivisor;
        };
        return resultado;
    };
    
    public static boolean numeroPerfecto(int n) { 
        return sumaDivisores(n) == n;
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una serie de numeros positivos (indica el ultimo con 0)");
        int n = sc.nextInt();
        do { 
            if (numeroPerfecto(n))
                System.out.println(" es un numero perfecto.");
        } while ((n = sc.nextInt()) > 0);

        System.out.println("TCHAU!!");
        sc.close();
    };
};
