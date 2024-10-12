//3. Realizar un programa que lea tres números de teclado y a continuación los muestre
//ordenados de mayor a menor.
import java.util.Scanner;

public class Ejercicio3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce un segun numero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce un tercer numero: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) 
            System.out.printf("%d > %d > %d\n", n1, n2, n3);
        if (n1 > n2 && n3 > n2) 
            System.out.printf("%d > %d > %d\n", n1, n3, n2);
        if (n2 > n1 && n1 > n3) 
            System.out.printf("%d > %d > %d\n", n2, n1, n3);
        if (n2 > n3 && n3 > n1) 
            System.out.printf("%d > %d > %d\n", n2, n3, n1);
        if (n3 > n2 && n2 > n1) 
            System.out.printf("%d > %d > %d\n", n3, n2, n1);
        if (n3 > n1 && n1 > n2) 
            System.out.printf("%d > %d > %d\n", n3, n1, n2);

        System.out.println("Tchau");

        sc.close();
    };
};
