public class Avion {
    private final String MARCA;
    private final String MODELO;
    private String matricula;
    private int numeroDeAsientos;
    private double combustible;
    private final double MAX_COMBUSTIBLE;


    public Avion(String marca, String modelo, String matricula, int numeroDeAsientos, double máximoCombustible) {
        MARCA = marca;
        MODELO = modelo;
        this.matricula = matricula;
        if (numeroDeAsientos > 0)
            this.numeroDeAsientos = numeroDeAsientos;
        else this.numeroDeAsientos = 0;
        combustible = 0;
        MAX_COMBUSTIBLE = máximoCombustible;
    }

    public String getMarca() {
        return MARCA;
    }

    public String getModelo() {
        return MODELO;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        if (numeroDeAsientos > 0)
            this.numeroDeAsientos = numeroDeAsientos;
        else numeroDeAsientos = 0;
    }

    public double getCapacidad() {
        return MAX_COMBUSTIBLE;
    }
	
    public double getCombustible() {
        return combustible;
    }

    public boolean sinCombustible(){
        return combustible == 0;
    }

    public void llenarDepostio(){
        combustible = MAX_COMBUSTIBLE;
    }

    public void vaciarDeposito(){
        combustible = 0;
    }

    public void gastarCombustible(double numeroLitros){
        if (numeroLitros < combustible)
            combustible -= numeroLitros;
        else combustible = 0;
    }

    public void repostarCombustible(double numeroLitros){
        if (numeroLitros < MAX_COMBUSTIBLE - combustible)
            combustible += numeroLitros;
        else combustible = MAX_COMBUSTIBLE;
    }
	
    public String toString(){
        return MARCA + MODELO + "(" + matricula +"): " + numeroDeAsientos + " asientos, " + combustible + " kg de fuel";
    }
}
