//12.	Hacer un programa que lea por teclado un número de 2 cifras y escriba el número inverso 
//(el que resulta de colocar las cifras en orden contrario). Si se lee el 45 se escribirá el 54

import java.util.Scanner; 

public class Ejercicio3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de dos cifras: ");
        int n = sc.nextInt();

        if (n <= 99) { 
            int nInvertido = 0;
            nInvertido += n % 10;
            n /= 10;
            nInvertido = nInvertido * 10 + n % 10;

            System.out.println("Numero invertido: " + nInvertido);
        } else
            System.out.println("Numero invalido!");

        sc.close();
    };
}


