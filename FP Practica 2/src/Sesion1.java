import java.util.Scanner;

public class Sesion1 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Menu de la Sesion1.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Aqui puedes:\n1. Comprobar si un numero es primo.\n2. Escribir los numeros primos gemelos entre dos valores.\n3. Escribir numeros primos gemelos entre dos valores.\n4. Numero par como suma de dos primos.\n0. Finalizar la ejecucion.");
        System.out.print("Ingresa un numero: ");
        int opcion = sc.nextInt();

        if (opcion >= 0 && opcion < 4) {
            System.out.println("Se ha elegido la opcion " + opcion + ".");
            System.out.print("Ingresa un numero entre 0 y 1000: ");
            opcion = sc.nextInt();
            if (opcion < 0) {
               System.out.println("El numero " + opcion + " es menor que 0.");
            }
            else if (opcion > 1000) {
               System.out.println("El numero " + opcion + " es mayor que 1001");
            } else
                System.out.println("El numero " + opcion + " es correcto");

            System.out.print("Indica el primer numero: ");
            opcion = sc.nextInt();

            System.out.print("Indica el segundo numero: ");
            int opcion2 = sc.nextInt();

            System.out.println("El primer numero " + opcion + ((opcion <= opcion2) ? "" : " no") + " es menor que " + opcion2);
            System.out.println("El segundo numero " + opcion2 + ((opcion2 % 2 == 0) ? "" : " no")+ " es divisible por " + opcion);
        } else { 
            System.out.println("Opcion incorrecta");
        };

        sc.close();
    };
}
