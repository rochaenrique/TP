//2. Realizar un programa que lea dos números por teclado y a continuación los muestre
//ordenados de menor a mayor.
import java.util.Scanner;

class Ejercicio2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un primer numero: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduce un segun numero: ");
        int n2 = sc.nextInt();

        if (n1 < n2)
            System.out.printf("%d <  %d\n", n1, n2);
        if (n1 > n2)
            System.out.printf("%d >  %d\n", n1, n2);

        System.out.println("Tchau");

        sc.close();
    };
};
