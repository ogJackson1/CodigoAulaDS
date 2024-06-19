public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
    }



    public void getAltura(double altura) {
        this.altura = altura;
    }

    public void getBase(double base) {
        this.base = base;
    }

    public double area() {
        return base*altura/2;
    }


    public String toString() {
        return super.toString();
    }

}

