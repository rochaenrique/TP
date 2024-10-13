//13.	Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) 
//y calcule su número de la suerte. (No es necesario comprobar si los datos son válidos).
//El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento 
//y a continuación sumando las cifras obtenidas en la suma.
//Por ejemplo, si la fecha de nacimiento es 13/11/2004, calcularemos así el número de la suerte:
//13+11+2004 = 2028 2+0+2+8 = 12
//El número de la suerte sería 12.
import java.util.Scanner;

public class Ejercicio4 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduzca el ano: ");
        int ano = sc.nextInt();

        boolean valido = dia <= 30 && mes <= 12;
        if (valido) { 
            int resultado = 0;
            int suma = dia + mes + ano;
            System.out.println("Suma = " + suma);
            while (suma > 0) { 
                resultado += suma % 10;
                suma /= 10;
            };
            System.out.println("Numero de la suerte: " + resultado);
        } else 
            System.out.println("Fechas no valida!");;
        sc.close();
    };
}
