/*15.	Con una única instrucción System.out.printf(), imprimir para cada uno de los siguientes casos los valores 
que se piden. Suponemos realizada previamente la declaración: 
int  n1=15, n2=2;
double x1=0.003433, x2=123.4172;
    a)	el valor de las variables  n1 y n2   justificadas a la derecha en un campo de 10 dígitos y cada una en una línea.

    b)	en una única línea y separados por una coma el valor de las variables n1 y n2   
    justificadas a la izquierda en un campo de 10 dígitos.

    c)	en líneas distintas,  el valor de la variables  x1 y x2   en notación exponencial y  
    con dos dígitos de precisión. Entre una línea y otro debe quedar una línea en blanco.

    d)	el valor de la variable  x2   en notación decimal en un campo de longitud 15 y con tres dígitos decimales.*/

public class Ejercicio6 { 
    public static void main(String[]args) { 
        int n1 = 15, n2 = 2;
        double x1 = 0.0034433, x2 = 123.4172;

        System.out.println("a)");
        System.out.printf("%10d\n%10d\n", n1, n2);
        System.out.println("\nb)");
        System.out.printf("%-10d, %-10d\n", n1, n2);
        System.out.println("\nc)");
        System.out.printf("%.2e\n\n%.2e\n", x1, x2);
        System.out.println("\nd)");
        System.out.printf("%15.3f\n", x2);

    }
}


