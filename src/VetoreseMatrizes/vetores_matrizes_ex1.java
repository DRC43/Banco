package VetoreseMatrizes;

import java.util.Scanner;

public class vetores_matrizes_ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean continuar;
        int num;

        do {
            continuar = false;
            try {
                System.out.println(" \n Por favor insira 5 números positivos: ");
                num = ler.nextInt();
                if (num < 0){
                    System.out.println(" LEMBRE-SE QUE O PROGRAMA SÓ ACEITA NÚMEROS POSITIVOS !!! ");
                    continuar = false;
                } else{
                    continuar = true;
                }
            }

            catch (Exception e){
            }
        } while (! continuar);

        int [] numLista = new int[4];
        int maior = numLista [0], menor = Integer.MAX_VALUE;

        for (int i = 0 ; i < numLista.length; i++){
            numLista [i] = ler.nextInt();
            if (numLista [i] > maior){
                maior =  numLista [i];
            }
        }

        for (int j = 0; j < numLista.length; j++){
            if (numLista [j] < menor){
                menor = numLista [j];
            }
        }

        System.out.println(" \n O maior valor informado foi = " + maior);
        System.out.println(" O menor valor informado foi = " + menor);

    }
}
