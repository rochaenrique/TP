//6. Realizar un programa en java que, dado el día, mes y año de una fecha, indique si la fecha es
//correcta (sin considerar años bisiestos). 

import java.util.Scanner;

public class Ejercicio6 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduce un mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce un ano: ");
        int ano = sc.nextInt();

        boolean diaCorrecto = dia >= 0 && dia <= 30;
        boolean mesCorrecto = mes >= 0 && mes <= 12;
        boolean anoCorrecto = ano >= 0 && ano <= 2024;

        if (diaCorrecto && mesCorrecto && anoCorrecto) 
            System.out.println("Fecha correcta!");
        else
            System.out.println("Fecha incorrecta");

        sc.close();

    };
};

