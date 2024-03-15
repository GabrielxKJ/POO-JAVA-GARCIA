package com.exercicioGarcia.paraCasa.exercicio3;

public class Complexo {
    double a; // parte real
    double b; // parte imaginária;

    Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void soma(Complexo outro) {
        System.out.println("Soma real:" + (this.a + outro.a));
        System.out.println("Soma imaginaria: " + (this.b + outro.b));
    }

    public void multiplica(Complexo outro) {
        double calculo1 = this.a * outro.a;
        double calculo2 = this.b * outro.b;
        System.out.println("Multiplicação real: " + (calculo1 - calculo2) );
        System.out.println("Multiplicação imaginaria " + (calculo1 + calculo2));
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

    public double modulo() {
        return Math.sqrt(a * a + b * b);
    }

    public double argumentoPrincipal() {
        return Math.atan2(b, a);
    }
}
