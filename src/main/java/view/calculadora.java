package view;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.Rectangulo;
import Modelos.Triangulo;
import Modelos.Hexagono;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadora {
    @FXML
    TextField ladoCuadrado;
    @FXML
    Label areaCuadrado;
    @FXML
    Label perimetroCuadrado;

    @FXML
    TextField baseTriangulo;
    @FXML
    TextField altoTriangulo;
    @FXML
    TextField lado1triangulo;
    @FXML
    TextField lado2triangulo;
    @FXML
    TextField lado3triangulo;
    @FXML
    Label areaTriangulo;
    @FXML
    Label perimetroTriangulo;

    @FXML
    TextField anchoRectangulo;
    @FXML
    TextField largoRectangulo;
    @FXML
    Label areaRectangulo;
    @FXML
    Label perimetroRectangulo;
    @FXML
    TextField radioCirculo;
    @FXML
    Label areaCirculo;
    @FXML
    Label perimetroCirculo;
    @FXML
    TextField ladoHexagono;
    @FXML
    TextField apotemaHexagono;
    @FXML
    Label areaHexagono;
    @FXML
    Label perimetroHexagono;

    public void calcularCuadrado(){
        Cuadrado cuadrado = new Cuadrado("cuadrado", Double.parseDouble(ladoCuadrado.getText()));
        areaCuadrado.setText( String.valueOf(cuadrado.calcularArea()));
        perimetroCuadrado.setText(String.valueOf(cuadrado.calcularPerimetro()));
    }
    public void calcularTriangulo(){
        Triangulo triangulo = new Triangulo("triangulo",Double.parseDouble(altoTriangulo.getText()),Double.parseDouble(baseTriangulo.getText()), Double.parseDouble(lado1triangulo.getText()),Double.parseDouble(lado2triangulo.getText()),Double.parseDouble(lado3triangulo.getText()));
        areaTriangulo.setText( String.valueOf(triangulo.calcularArea()));
        perimetroTriangulo.setText(String.valueOf(triangulo.calcularPerimetro()));
    }
    public void calcularRectangulo(){
        Rectangulo rectangulo = new Rectangulo("rectangulo",Double.parseDouble(largoRectangulo.getText()),Double.parseDouble(anchoRectangulo.getText()));
        areaRectangulo.setText( String.valueOf(rectangulo.calcularArea()));
        perimetroRectangulo.setText(String.valueOf(rectangulo.calcularPerimetro()));
    }

    public void calcularCirculo(){
        Circulo circulo = new Circulo("circulo",Double.parseDouble(radioCirculo.getText()));
        areaCirculo.setText( String.valueOf(circulo.calcularArea()));
        perimetroCirculo.setText(String.valueOf(circulo.calcularPerimetro()));
    }

    public void calcularHexagono(){
        Hexagono hexagono = new Hexagono("hexagono",Double.parseDouble(ladoHexagono.getText()),Double.parseDouble(apotemaHexagono.getText()));
        areaHexagono.setText( String.valueOf(hexagono.calcularArea()));
        perimetroHexagono.setText(String.valueOf(hexagono.calcularPerimetro()));
    }

}
