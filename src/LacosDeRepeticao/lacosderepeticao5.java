package LacosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class lacosderepeticao5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num=0;

        System.out.println("\n Informe um número:");
        num= ler.nextInt();

        for(int i=0; i<num; i++){
            Random rng=new Random();
            System.out.println(" Foi sorteado o número " + (rng.nextInt(6) + 1));

        }
    }
}