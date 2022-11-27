package Modelos;

public class Rectangulo extends Figura{
    private Double largo;
    private double ancho;

    public Rectangulo(String nombre, Double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public double calcularPerimetro() {
        return largo+largo+ancho+ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", area="+calcularArea()+
                ", perimetro="+calcularPerimetro()+
                '}';
    }
}
