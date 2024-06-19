public class Circulo {
    private double raio;

    public Circulo (double raio, String cor){};

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area(){
        return raio*raio*3.14;
    }

    public double getDiametro(){
        return raio*2;
    }

    public String toString() {
        return super.toString();
    }

}

