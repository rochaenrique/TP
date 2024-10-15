import java.lang.Math;

public class Punto {
    private double x; 
    private double y; 

    Punto() { 
        x = 0;
        y = 0;
    }

    Punto(double x, double y) { 
        this.x = x;
        this.y = y;
    }

    public String toString() { 
        return "(" + x + "," + y + ")";
    }

    public double distancia(Punto punto) { 
        return Math.sqrt(Math.pow(this.x - punto.x, 2) + Math.pow(this.y - punto.y, 2));
    }
}
