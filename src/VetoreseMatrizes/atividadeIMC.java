package VetoreseMatrizes;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class atividadeIMC {
    public static void main(String[] args) {

        System.out.println(" \n ***  SEJA BEM VINDO ESTE, PROGRAMA IRÁ REALIZAR O CÁLCULO DO SEU IMC  ***");

        Scanner ler = new Scanner(System.in);

        System.out.println(" \n Favor digite a sua altura: ");
        double altura = ler.nextDouble();

        System.out.println(" \n Favor digite o seu peso: ");
        double peso = ler.nextDouble();

        double calculoIMC = peso/(altura * altura);

        calculoIMC = calculador(calculoIMC);
        System.out.println(" Seu IMC é " + calculoIMC);

    }

    static double calculador (double calculoIMC){
        if(calculoIMC < 18.5){
            System.out.println(" \n Você esta abaixo do peso normal. \n ");
        } else if (calculoIMC >= 18.5 && calculoIMC <= 24.9){
            System.out.println(" \n O seu IMC está dentro do peso normal PARABÉNS!!! \n ");
        } else if (calculoIMC >=25 && calculoIMC <= 29.9){
            System.out.println(" \n Você esta com excesso de peso. \n ");
        } else if (calculoIMC >= 30 && calculoIMC <= 34.9){
            System.out.println(" \n Você esta com obesidade classe | \n ");
        } else if (calculoIMC >=35 && calculoIMC <= 39.9){
            System.out.println(" \n Você esta com obesidade clase || \n ");
        } else if (calculoIMC >= 40){
            System.out.println(" \n Você esta com obesidade classe ||| \n ");
        }
        return calculoIMC;
    }
}

