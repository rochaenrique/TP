//Hacer un programa que escriba el área de un triángulo (a partir de su base y altura) y 
//de un circulo (a partir del radio), para ello pedirá que se introduzcan por teclado 
//los valores de correspondientes a cada figura. 
import java.util.Scanner;

public class Ejercicio2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base de un triangulo: ");
        int base = sc.nextInt();
        System.out.print("Introduce la altura de un triangulo: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el radio de un circulo: ");
        int radio = sc.nextInt();

        int areaTriangulo =  (base * altura) / 2;
        double areaCirculo = Math.PI * radio * radio;

        System.out.printf("Area del triangulo: %d, Area del circulo: %2f\n", areaTriangulo, areaCirculo);
        sc.close();
    };
};
