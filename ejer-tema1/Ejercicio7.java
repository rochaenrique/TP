/*
 *  16.	Escribir un programa en java que lea una fecha (día, mes y año, este último con cuatro cifras), 
 *  y la escriba con formato dd-mm-aa. Si alguno de los tres números tiene menos de dos cifras, se rellenará con un cero.
 *      Si se lee el día 18, mes 2 y año 2012 se escribirá 18-02-12
 *      En el caso del día 1 de enero de 2000 se escribiría 01-01-00
 *      Para el 30 de octubre de 1999 se escribiría 30-10-99
*/

import java.util.Scanner;

public class Ejercicio7 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dia (2 cifras): ");
        int dia = sc.nextInt();
        System.out.print("Introduzca el mes (2 cifras): ");
        int mes = sc.nextInt();
        System.out.print("Introduzca el ano (2 cifras): ");
        int ano = sc.nextInt();
        ano = ano % 100;

        System.out.printf("%02d-%02d-%02d\n", dia, mes, ano);
        sc.close();
    }
}
