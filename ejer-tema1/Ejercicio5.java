//14.	Escribir un programa que pida al usuario una cantidad de segundos, 
//y muestre a cuántas horas, minutos y segundos equivale. 

import java.util.Scanner;

public class Ejercicio5 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cantidad de segundos: ");
        int segundos = sc.nextInt();
        
        int horas = segundos / (60 * 60);
        int minutos = (segundos - (horas * 60 * 60)) / 60;
        segundos = segundos - (horas * 60 * 60) - (minutos * 60);

        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        sc.close();
    }
}
