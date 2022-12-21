package LacosDeRepeticao;

import java.util.Scanner;

public class lacosderepeticao4 {
    public static void main(String[] args) {

        Scanner DRC = new Scanner(System.in);
        int [] valor = new int [4];
        int maior = 0;

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º preço: ");
            valor[i] = DRC.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        System.out.println("\nO maior preço inserido foi: " + maior);
    }
}
