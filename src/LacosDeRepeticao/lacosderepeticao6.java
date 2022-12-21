package LacosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class lacosderepeticao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero=0;
        int vezes=0;
        int valorSorteado=0;

        System.out.println("\n Insira um número: ");
        numero = ler.nextInt();

        do{
            Random rng = new Random();
            valorSorteado = rng.nextInt(100)+1;
            System.out.println(" O número sorteado foi " + valorSorteado);
           // vezes=vezes+1;
            vezes++;

        }while(valorSorteado != numero);
        System.out.println(" \n Foram necessários " + vezes + " sorteios para que o número " + valorSorteado +
                " fosse sorteado.");
    }
}
