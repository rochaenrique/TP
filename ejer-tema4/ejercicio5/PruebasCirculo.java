public class PruebasCirculo { 
    public static void main(String[] args) { 
        Punto p1 = new Punto();
        Punto p2 = new Punto(1.0, 1.0);

        System.out.println("p1 = " + p1 + "p2 = " + p2);
        System.out.println("Distancia entre p1 y p2 = " + p1.distancia(p2));

        Circulo circulo = new Circulo(new Punto(0.0, 0.0), 0.5);

        if (circulo.contiene(p1)) 
            System.out.printf("El punto %s esta dentro del circulo %s.", 
                    p1, circulo);

    }
}
