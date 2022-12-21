package Condicionais;

import java.util.Scanner;
public class CondCalculoINSS {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("________________________________________________________");
        System.out.println("           *** SEJA BEM VINDO AO INSS ***");
        System.out.println("________________________________________________________\n");
        System.out.println("Este programa fará o cálculo, do valor que será recolhido, do seu salário para " +
                "o INSS\n\n" + "Por favor informe qual o seu salário:\n");

        double valorDoSalario = Input.nextDouble();

        if (valorDoSalario <= 1212) {
            double calculo1 = valorDoSalario * 0.075;
            System.out.printf("\n O valor que deverá ser recolhido do seu salário é R$ %.2f.", calculo1);
        }
        else if (valorDoSalario <= 2427.35) {
            double calculo2 = (valorDoSalario - 1212) * 0.09 + 90.90;
            System.out.printf("\n O valor que deverá ser recolhido do seu salário é R$ %.2f.", calculo2);
        }
        else if (valorDoSalario <= 3641.03) {
            double calculo3 = (valorDoSalario - 2427.35) * 0.12 + 90.90 + 109.38;
            System.out.printf("\n O valor que deverá ser recolhido do seu salário é R$ %.2f.", calculo3);
        }
        else if (valorDoSalario <= 7087.22) {
            double calculo4 = (valorDoSalario - 3641.03) * 0.14 + 90.90 + 109.38 + 145.64;
            System.out.printf("\n O valor que deverá ser recolhido do seu salário é R$ %.2f.", calculo4);
        }
        else {
            System.out.println("\n O valor que deverá ser recolhido do seu salário é R$828,38.");
        }

    }
}
