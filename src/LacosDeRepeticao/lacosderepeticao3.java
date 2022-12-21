package LacosDeRepeticao;

import java.util.Random;

public class lacosderepeticao3 {

    public static void main(String[] args) {
       int numeroDeSorteios = Integer.parseInt(args[0]);
       Random random = new Random();
       int soma = 0;

        System.out.println("\n    JOGO DO SORTEIO     \n");

        for(int i = 0; i < numeroDeSorteios; i++){
            int numeroSorteado = random.nextInt(6 ) +1;
            soma += numeroSorteado;
            System.out.println(" O número sorteado foi " +  numeroSorteado);
        }

        System.out.println(" \n A soma dos números sorteados é " + soma);
    }
}
