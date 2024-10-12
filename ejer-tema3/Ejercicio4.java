import java.util.Scanner;

public class Ejercicio4 { 
    public static int sumarCifras(int n) { 
        int resultado = 0;
        while (n > 0) {
            resultado += n % 10;
            n /= 10;
        };

        return resultado;
    };

    public static int sumarCifrasRecursivo(int n) { 
        int resultado = 0;
        if (n > 0) 
            resultado = n % 10 + sumarCifrasRecursivo(n / 10);
        return resultado;
    };

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeros 10 que la suma de las cifras es mayor que 10.");
        int contador = 10;
        for (int i = 0; contador > 0; i++) { 
            if (sumarCifras(i) > 10) { 
                System.out.println(i); 
                contador--;
            };
        };

        System.out.println("Entre 200 y 300 que la suma de las cifras es 9.");
        contador = 10;
        for (int i = 200; contador > 0; i++) { 
            if (sumarCifras(i) == 9) { 
                System.out.println(i); 
                contador--;
            };
        };

        sc.close();
    };
};
