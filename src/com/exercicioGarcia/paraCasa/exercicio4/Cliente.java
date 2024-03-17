package com.exercicioGarcia.paraCasa.exercicio4;

//Implemente a classe Cliente que possua os atributos nome,
//saldo, e limite. Esta deve possuir também os métodos sacar(), depositar(),
//checarSaldo(), e obterNome(). Sabe-se que só é possı́vel sacar se o saldo+limite
//forem superiores à quantia. Os métodos sacar() e depositar() necessitam de
//parâmetros. O método checarSaldo deve retornar o valor saldo+limite. O
//método obterNome() deve retornar o nome do Cliente.
public class Cliente {

    String nome;
    double saldo;
    double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }


    public void sacar(double saque) {
        if(saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else if(saque > limite) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= saque;
            System.out.println("Você sacou:" + saque + "R$");
        }
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("foi depositado:"+ deposito + "R$");
    }

    public void checarSaldo() {
        System.out.println("Seu saldo atual é de: " + saldo + "R$");
    }

    public void obterNome() {
        System.out.println("O nome do Cliente é: "+ nome);
    }
}
