//5. Desarrollar los siguientes apartados:
//  a. Realizar un método estático en java que reciba como argumento un número entero
//  positivo y devuelva la suma de sus cifras.
//  b. Escribir un programa que:
//      - Calcule e imprima los 10 primeros números enteros positivos que cumplan la
//      condición de que la suma de sus cifras sea mayor que 10, utilizando la función del
//      apartado a.
//      - Calcule e imprima los números comprendidos entre 200 y 300 que cumplan que la
//      suma de sus cifras sea 9, utilizando la función del apartado a. 

public class Ejercicio5 { 
    public static int sumaCifras(int n) { 
        int resultado = 0;
        while (n > 0) { 
            resultado += n % 10;
            n /= 10;
        };
        return resultado;
    };

    public static void main(String[] args) { 
        System.out.println("10 primeros que la suma de sus cifras es mayor que 10: ");

        int impresos = 0;
        for (int i = 1; impresos < 10; i++) { 
            if (sumaCifras(i) > 10) { 
                System.out.printf("\t%3d\n", i);
                impresos++;
            }
        }

        System.out.println("Numeros entre 200 y 300 que la suma de sus cifras es 9: ");
        for (int i = 200; i <= 300; i++) { 
            if (sumaCifras(i) == 9)
                System.out.printf("\t%3d\n", i);
        }

    };
};

