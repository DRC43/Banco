package Condicionais;

import java.util.Scanner;
public class condPassaOuNao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a nota 1");
        double nota1 = ler.nextDouble();
        System.out.println("Insira a nota 2");
        double nota2 = ler.nextDouble();
        System.out.println("Insira a nota 3");
        double nota3 = ler.nextDouble();
        System.out.println("Insira a nota 4");
        double nota4 = ler.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >=6) {
            System.out.println(" Você foi aprovado, parabéns ");
        }
        else{
            System.out.println(" Você foi reprovado, estude mais. ");
        }
    }
}
