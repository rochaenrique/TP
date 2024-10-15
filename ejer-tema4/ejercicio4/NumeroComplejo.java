public class NumeroComplejo { 
    private double real;
    private double imaginario;

    public NumeroComplejo() { 
        real = 0;
        imaginario = 0;
    }

    public NumeroComplejo(double real, double imaginario) { 
        this.real = real;
        this.imaginario = imaginario;
    }

    public void setReal(double real) { 
        this.real = real;
    };
    public void setImaginario(double imaginario) { 
        this.imaginario = imaginario;
    };
    public double getReal() { 
        return real;
    }
    public double getImaginario() { 
        return imaginario;
    }

    public NumeroComplejo suma(NumeroComplejo otro) { 
        return new NumeroComplejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }
    public NumeroComplejo resta(NumeroComplejo otro) { 
        return new NumeroComplejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }
    public NumeroComplejo multiplica(NumeroComplejo otro) { 
        double real = this.real * otro.real - this.imaginario * otro.imaginario;
        double imaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new NumeroComplejo(real, imaginario);
    }
    public NumeroComplejo divide(NumeroComplejo otro) {
        double real = this.real * otro.real + this.imaginario * otro.imaginario;
        double imaginario = this.imaginario * otro.real - this.real * otro.imaginario;
        double divisor = Math.pow(otro.real, 2) + Math.pow(otro.imaginario, 2);
        return new NumeroComplejo(real / divisor, imaginario / divisor);
    }
    public NumeroComplejo conjugado() { 
        return new NumeroComplejo(real, -imaginario);
    };
    public double modulo() { 
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginario, 2));
    }
    public String toString() { 
        return real + "+" + imaginario + "i";
    };

}
