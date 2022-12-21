package VariaveisOperadoresMatematicosEntradaeSaida;

import java.util.Scanner;
public class CalculandoVolumeDaPiscina {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira Largura:");
        double largura = ler.nextDouble();

        System.out.println("Insira Altura:");
        double altura = ler.nextDouble();

        System.out.println("Insira profundidade inicial:");
        double profundidadeI = ler.nextDouble();

        System.out.println("Insira profundidade final:");
        double profundidadeF = ler.nextDouble();

        double calculo = (profundidadeI + profundidadeF) / 2;
        calculo = calculo + largura + altura * 1000;

        System.out.println("Cabem nesta piscina " + calculo + " litros de água. ");


    }
}
