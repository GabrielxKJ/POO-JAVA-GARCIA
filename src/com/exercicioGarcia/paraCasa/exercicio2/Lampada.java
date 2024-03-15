package com.exercicioGarcia.paraCasa.exercicio2;

public class Lampada {
Estado estado = Estado.ACESA;
int qtdAcesa = 0;

    public void click() {

        switch (estado) {
            case APAGADA:
                estado = Estado.ACESA;
                System.out.println("A lampada foi " + estado);
                qtdAcendimentos();
                break;
            case ACESA:
                estado = Estado.APAGADA;
                qtdAcesa += 1;
                System.out.println("A lampada foi " + estado);
                break;
        }
    }

    public void qtdAcendimentos() {
        System.out.println("Total de vezes acesa: " + qtdAcesa);
    }

    public void checaEstado() {
        System.out.println("Atualmente a lâmpada está: " + estado);
    }
}
