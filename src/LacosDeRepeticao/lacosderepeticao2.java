package LacosDeRepeticao;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class lacosderepeticao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("\n Insira um número: \n");
        numero = ler.nextInt();

        for (int i = 0; i < numero; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
