import java.util.Scanner;

public class PruebasIntervalo { 
    public static Intervalo temperaturasDia(Scanner sc) { 

        double min = 0.0, max = 0.0;
        System.out.print("Introduze la temperatura minima del dia: ");
        min = sc.nextDouble();
        System.out.print("Introduze la temperatura maxima del dia: ");
        max = sc.nextDouble();
        System.out.print('\n');

        return new Intervalo(min, max);
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        final int NDIAS = 7;
        int diasTemplados = 0;
        double suma = 0;
        for (int i = 0; i < NDIAS; i++) { 
            Intervalo inter = temperaturasDia(sc);
            suma += inter.puntoMedio();
            if (inter.incluye(15)) 
                diasTemplados++;
        };

        System.out.println("Media de temperatura: " + suma / (double)NDIAS + ", Dias templados: " + 
                diasTemplados);
        sc.close();
    }
}
