import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un primer numero positivo: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce un segundo numero positivo: ");
        int n2 = sc.nextInt();


        System.out.printf("Los numeros perfectos entre %d y %d son:\n", n1, n2);
        while (n1++ < n2) { 
            if (Ejercicio6.numeroPerfecto(n1))
                System.out.println(n1);
        };
        sc.close();

    };
};
