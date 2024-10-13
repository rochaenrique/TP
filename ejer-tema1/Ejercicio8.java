/*
17.	Escribir un programa en java que utilice tres variables lógicas (x, a y b, de tipo boolean), 
    y muestre por pantalla los resultados de las posibles operaciones booleanas. 
    El resultado será similar al siguiente:
    •	Los valores de cada variable se escribirán en 8 posiciones justificado a la derecha.
    •	Para poner las filas de títulos se utilizarán los tabuladores necesarios.
*/

public class Ejercicio8 { 
    public static void main(String[] args) { 
        boolean x = true, a = true, b = true;

        System.out.println("\t  x\t  !x");
        System.out.printf("\t%b\t%b\n", x, !x);
        x = !x;
        System.out.printf("\t%5b\t%5b\n", x, !x);

        System.out.println('\n');

        System.out.println("\t  a\t  b\t a&&b\t a||b");
        System.out.printf("\t%5b\t%5b\t%5b\t%5b\n", a, b, a && b, a || b);
        b = false;
        System.out.printf("\t%5b\t%5b\t%5b\t%5b\n", a, b, a && b, a || b);
        a = false;
        System.out.printf("\t%5b\t%5b\t%5b\t%5b\n", a, b, a && b, a || b);
        b = true;
        System.out.printf("\t%5b\t%5b\t%5b\t%5b\n", a, b, a && b, a || b);
    }
}

