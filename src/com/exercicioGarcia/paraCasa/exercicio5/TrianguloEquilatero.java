package com.exercicioGarcia.paraCasa.exercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TrianguloEquilatero {
    double lado;
    private double perimetro;
    private double area;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public void calcArea() {
        area = (lado * lado) * Math.sqrt(3) / 4;
        BigDecimal bd = new BigDecimal(area).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("A area do triagulo: " + bd + "m²");
    }

    public void calcPerimetro() {
        perimetro = 3 * lado;
        System.out.println("O perimetro desse triangulo é: " + perimetro + "m²");
    }

    public double getTarea() {
        return area;
    }

    public double getTperimetro() {
      return perimetro;
    };
}
