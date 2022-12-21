package Condicionais;

import java.util.Random;
import java.util.Scanner;
public class condSorteio {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("\n*** SEJA BEM VINDO AO SORTEIO 123 ***\n");
        ler = new Scanner(System.in);

            Random random = new Random();
        int numeroInteiro_0_a_6 = random. nextInt(7);

        System.out.println("Para iniciarmos o sorteio digite um número entre 1 a 6:");
        Scanner numero = new Scanner(System.in);
        int numeroEscolhidoUsuario = 0;

        boolean lValidanumeroEscolhidoUsuario = true;
        while (lValidanumeroEscolhidoUsuario) {
            numeroEscolhidoUsuario = numero.nextInt();

            if (numeroEscolhidoUsuario >= 0 && numeroEscolhidoUsuario <= 6) {
                lValidanumeroEscolhidoUsuario = false;
            } else {
                System.out.println("O número informado não corresponde as regras do programa, tente novamente:");
            }
        }

            if (numeroEscolhidoUsuario == numeroInteiro_0_a_6) {
                System.out.println("Parabéns você acertou");
            } else {
                System.out.println("Você errou tente novamente.");
            }
            System.out.println("O número sorteado foi: " + numeroInteiro_0_a_6);

    }

}
