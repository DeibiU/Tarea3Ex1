package Modelos;

public class Hexagono extends Figura{

    private double lado;
    private double apotema;

    public Hexagono(String nombre, double lado, double apotema) {
        super(nombre);
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {return (lado*apotema*6)/2;}
    public double calcularPerimetro() {return lado*6;}

    @Override
    public String toString() {
        return "Hexagono{" +
                "lado=" + lado +
                ", apotema=" + apotema +
                '}';
    }
}
