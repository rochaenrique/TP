//5. Realizar un programa que, dada la nota numérica de la asignatura, un valor entero
//comprendido entre 0 y 10, muestre la nota cualitativa de la forma: Suspenso, Aprobado,
//Notable, Sobresaliente.
import java.util.Scanner;

public class Ejercicio5 { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota numerica de la asignatura: ");

        int n = sc.nextInt();
        
        if (n >= 0 && n <= 10) { 
            if (n >= 8)
                System.out.println("Sobresaliente!!");
            else if (n >= 6)
                System.out.println("Notable!");
            else if (n >= 5)
                System.out.println("Aprobado");
            else
                System.out.println("Suspenso");
        };
        sc.close();
    };
};
