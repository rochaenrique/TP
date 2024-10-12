public class Ejercicio1 { 
    Ejercicio1(int n, int s) { 
        number = n;
        size = s;
        for (int i = 0; i < size; i++) { 
            names[i] = "";
        };
    };

    public final int getNumero() { 
        return number;
    };

    public void setNumero(int n) { 
        number = n;
    };

    public String getIndex(int i) { 
        String resultado = "";
        if (i <  size)
            resultado = names[i];
    
        return resultado;
    };

    int number;
    int size;
    String[] names;

    public static void main(String[] args) { 
        Ejercicio1 e1 = new Ejercicio1(0, 10);

        System.out.println(e1.getNumero());
        e1.setNumero(1);
        System.out.println(e1.getNumero());
    }

}
