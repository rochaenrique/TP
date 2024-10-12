//4. Realizar un programa que, dado un número entero entre 0 y 99.999, indique cuantas cifras
//tiene

import java.util.Scanner;

public class Ejercicio4 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entre 0 y 99999: ");
        int n = sc.nextInt();

        if (n >= 0 && n <= 99_999) { 
            System.out.print(n + " tiene ");
            int cifras = 0;
            while (n > 0) {
                n /= 10;
                cifras++;
            };

            System.out.println(cifras + " cifra(s)");
        };
        sc.close();
    };
};
