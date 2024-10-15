import java.util.Scanner;

public class PruebasAvion { 
    public static Avion leerAvion(Scanner sc) { 
        System.out.print("Introduzca la marca: ");
		String marca = sc.nextLine();
        System.out.print("Introduzca la modelo: ");
		String modelo = sc.nextLine();
        System.out.print("Introduzca la matricula: ");
		String matricula = sc.nextLine();

        int numeroDeAsientos; 
        do { 
            System.out.print("Introduzca la numeroDeAsientos: ");
            numeroDeAsientos = sc.nextInt();
        } while (numeroDeAsientos < 0);

        double maxCombustible;
        do { 
            System.out.print("Introduzca la maxCombustible: ");
            maxCombustible = sc.nextDouble();
        } while (maxCombustible < 0);
        System.out.print('\n');

        return new Avion(marca, modelo, matricula, numeroDeAsientos, maxCombustible);
    }

    public static double traspasoCombustible(Avion a1, Avion a2) { 
        double comb1 = a1.getCombustible(); 
        double comb2 = a2.getCombustible();

        double media = (comb1 + comb2) / 2; 
        double diff, capacidad, reposicion;

        if (comb1 > comb2) { 
            diff = (comb1 - comb2) / 2;
            a1.gastarCombustible(diff);
            a2.repostarCombustible(diff);
            capacidad = a2.getCapacidad();
            if (media > capacidad) { 
                reposicion = media - capacidad;
                a1.repostarCombustible(reposicion);
                diff -= reposicion;
            }
        } else { 
            diff = (comb2 - comb1) / 2;
            a2.gastarCombustible(diff);
            a1.repostarCombustible(diff);

            diff *= -1;
            capacidad = a1.getCapacidad();
            if (media > capacidad) { 
                reposicion = media - capacidad;
                a2.repostarCombustible(media - capacidad);
                diff += reposicion;
            }
        }
        return diff;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        Avion a1 = leerAvion(sc);
        Avion a2 = leerAvion(sc);
        Avion a3 = leerAvion(sc);

        a1.llenarDepostio();
        a2.llenarDepostio();
        System.out.print("Retirar del segundo avion: ");
        a2.gastarCombustible(sc.nextInt());

        System.out.println("Antes del traspaso:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.printf("Se traspasan %.2f del avion 1 al avion 2.\n", traspasoCombustible(a1, a2));
        System.out.printf("Se traspasan %.2f del avion 1 al avion 3.\n", traspasoCombustible(a1, a3));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        sc.close();
    }
}
