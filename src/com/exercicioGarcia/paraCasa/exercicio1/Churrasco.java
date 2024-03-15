package com.exercicioGarcia.paraCasa.exercicio1;


//Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
//carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
//vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
//de 13 anos em diante 2 kilos de carne.

public class Churrasco {
    double qtdCarne;
    int qtdPessoas = 0;

    public void verificarConsumo(Pessoa pessoa) {

        qtdPessoas += 1;

        if(pessoa.idade >= 0 && pessoa.idade <= 3) {
            System.out.println("Nada foi consumido por " + pessoa.nome);
        } else if (pessoa.idade >= 4 && pessoa.idade <= 12) {
            qtdCarne += 1;
            System.out.println("foi consumido 1kg de carne por: " + pessoa.nome);
        } else {
            qtdCarne += 2;
            System.out.println("foi consumido 2kg de carne por: " + pessoa.nome);
        }

        if (pessoa.vegetariana) {
            System.out.println( pessoa.nome + "é vegetariana, nada foi consumido");
        }

        System.out.println("Em média foram consumidos " + qtdCarne + "kg de carne no churras");
        System.out.println("Total de pessoas no churras é: " + qtdPessoas);
    }
}
