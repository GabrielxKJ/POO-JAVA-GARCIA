package com.exercicioGarcia.paraCasa.exercicio6;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    int nSorteado;



    public void sortear() {
        Random rand = new Random();
        nSorteado  = rand.nextInt(0, 99);
    }

    public void adivinhar() {
        boolean running = true;
        while (running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero entre 0 e 99");
            System.out.println("OU digite 'sair' se quiser sair");
            String userInput = scanner.next();

            int i = Integer.parseInt(userInput);

            if (i != nSorteado) {
                System.out.println("Numero incorreto, Tente novamente");
            } else {
                System.out.println("Parabéns!!! Você adivinhou o numero. \n");
                running = false;
                scanner.close();
            }

        }

    }
}
