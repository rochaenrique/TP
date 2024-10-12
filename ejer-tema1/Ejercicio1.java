//Escribe un programa en java que lea dos números enteros de teclado y los muestre por pantalla,
import java.util.Scanner;

public class Ejercicio1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un primer numero entero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce un segundo numero entero: ");
        int n2 = sc.nextInt();

        System.out.println("\nPrimer Numero: " + n1 + " Segundo Numero: " + n2);
        sc.close();
    };
};
