package com.exercicioGarcia.aula1;
public class MassaCorporal {

    double imc = 0;

    void calculo(double peso, double altura) {
        imc = peso/(altura * altura);
        System.out.println(imc);
    };

    void aboveBelowOrMiddle() {
        if(imc >= 25) {
            System.out.println("Você esta acima do peso, vá para academia safado!!!");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Você está no peso ideal, continue se exercitando Renato Cariano!!");
        } else if (imc < 18) {
            System.out.println("Você está abaixo do peso, bora se alimentar direito vagabundo!!");
        }

    }

}
