package com.aula12.demo;

public class Calculadora {
    
    private int n1, n2;

    public Calculadora(){

    }

    public int getN1(){
        return n1;
    }

    public int getN2(){
        return n2;
    }

    public int setN1(int n1){
        return this.n1 = n1;
    }

    public int setN2(int n2){
        return this.n2 = n2;
    }

    public int somar(){
        return n1 + n2;
    }

    public int multiplicar() {
        return n1 * n2;
    }

}
