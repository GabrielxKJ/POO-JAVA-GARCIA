package com.exercicioGarcia;

public class Car {
    int velocidadeAtual = 0;

    void aceleraAe() {
        if (velocidadeAtual >= 300) {
            System.out.println("Vai com calma calabreso, tá muito rápido.. velocidade:" + velocidadeAtual);
        }
        velocidadeAtual += 15;
        System.out.println("Eu sou a velocidade!!! acelerando:" + velocidadeAtual + "km/h");
    }

    void freiaAe() {
        if (velocidadeAtual == 0) {
            System.out.println("O carro tá parando anta!!, acelera nessa p*&#... Velocidade:" + velocidadeAtual + "km/h");
        }
        velocidadeAtual -= 5;
        System.out.println("FREIA, FREIA VAI BATER CARAIO!! FREIANDO:" + velocidadeAtual + "km/h");
    }

    void mostraAvelocidadeAe() {
        System.out.println("Sua velocidade é atual é de:" + velocidadeAtual + "km/h");
    }
}
