public class Retangulo  {
    private double lado1;
    private double lado2;
    public Retangulo(){
        super();

    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    double area(){
        return lado1*lado2;
    }


    public String toString() {
        return super.toString();
    }
}


