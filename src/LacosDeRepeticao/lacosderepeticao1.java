package LacosDeRepeticao;

import java.util.Scanner;
public class lacosderepeticao1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = ler.nextInt();


        for (int f = 1; num >= f; f = f + 2) {
            System.out.println(f);
        }
    }
}
