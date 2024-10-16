public class Maleta {
    private final double PESO_MAXIMO = 23;
    private double peso;
    private final int MEDIDA_TOTAL_MAXIMA = 190;
    private int ancho;
    private int alto;
    private int fondo;

    public Maleta(double peso, int ancho, int alto, int fondo) {
        this.peso = peso;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public double getPeso() {
        return peso;
    }

    public int getMedidaTotal() {
        return ancho + alto + fondo;
    }

    public boolean excedeDePeso() {
        return peso > PESO_MAXIMO;
    }

    public boolean excedeDeMedidas() {
        return ancho + alto + fondo > MEDIDA_TOTAL_MAXIMA;
    }
}
