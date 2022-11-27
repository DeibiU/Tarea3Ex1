package Modelos;

import java.nio.DoubleBuffer;

public class Triangulo extends Figura{

    private Double altura;
    private Double base;
    private Double lado1;
    private Double lado2;
    private Double lado3;


    public Triangulo(String nombre, Double altura, Double base, Double lado1, Double lado2, Double lado3) {
        super(nombre);
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", area="+calcularArea()+
                ", perimetro="+calcularPerimetro()+
                '}';
    }
}
