public class Asiento {
    private int fila;
    private int butaca;
    private Pasajero pasajero;

    public Asiento(int fila, int butaca, Pasajero pasajero) {
        this.fila = fila;
        this.butaca = butaca;
        this.pasajero = pasajero;
    }

    public int getFila() {
        return fila;
    }

    public int getButaca() {
        return butaca;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String toString() {
        return "" + fila + (char)(butaca + 'A');
    }
}
