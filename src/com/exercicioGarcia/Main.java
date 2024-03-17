package com.exercicioGarcia;

import com.exercicioGarcia.paraCasa.exercicio1.Pessoa;
import com.exercicioGarcia.paraCasa.exercicio1.Churrasco;
import com.exercicioGarcia.paraCasa.exercicio2.Lampada;
import com.exercicioGarcia.paraCasa.exercicio5.TrianguloEquilatero;
import com.exercicioGarcia.paraCasa.exercicio6.RandomNumber;

import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        RandomNumber game = new RandomNumber();

        game.sortear();
        game.adivinhar();


    }
}