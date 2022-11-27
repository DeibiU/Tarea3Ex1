package Modelos;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}

    @Override
    public double calcularArea() {return (radio*radio)*3.14;}
    public double calcularPerimetro() {return (radio*2)*3.14;}

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
