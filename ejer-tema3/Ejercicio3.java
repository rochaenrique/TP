import java.util.Scanner;

public class Ejercicio3 { 
    //ejercicio 3 (iterativo)
    public static int invertir(int numero) { 
        int resultado = 0;
        while (numero > 0) { 
            resultado = resultado * 10 + numero % 10;
            numero /= 10;
        };
        return resultado;
    };

    //ejercicio 3 (recursivo)
    public static int invertirRecursivo(int numero) { 
        return invertirRecursivo(numero, 0);
    };

    private static int invertirRecursivo(int numero, int resultado) { 
        if (numero > 0) { 
            resultado = resultado * 10 + numero % 10;
            resultado = invertirRecursivo(numero / 10, resultado);
        };
        return resultado;
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero positivo hasta 4 cifras: ");
        int n = sc.nextInt();
        while (n <= 0 || n > 9999) { 
            System.out.print("Invalido, intenta otra vez: ");
            n = sc.nextInt();
        };

        System.out.println("Invertido: " + invertir(n));
        System.out.println("Invertido Recursivo: " + invertirRecursivo(n));
        sc.close();
    };
};
