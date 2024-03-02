package com.exercicioGarcia;

import java.util.Scanner;

public class peopleCount {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println(
                    """
                            Digite 'entrar' para contar uma entrada,\s
                            Digite 'remover' para contar uma saída,\s
                            Digite 'total' para ver o total,\s
                            Digite 'zerar' para zerar o recinto\s
                            ou Digite 'sair' para sair do programa""");
            String status = scanner.next();
            switch (status) {
                case "entrar":
                    counter++;
                    System.out.println("Entrada registrada. Total:" + counter);
                    break;
                case "remover":
                    counter--;
                    System.out.println("Saída registrada. Total:" + counter);
                    break;
                case "total":
                    System.out.println("Total de pessoas no recinto:" + counter);
                    break;
                case "zerar":
                    counter = 0;
                    System.out.println("Zerando recinto..." + counter);
                case "sair":
                    running = false;
                    break;
                default:
                    System.out.println("Comando inválido, Tente novamente");
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
