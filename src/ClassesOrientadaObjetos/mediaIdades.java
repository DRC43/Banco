package ClassesOrientadaObjetos;

import java.util.Scanner;

public  class mediaIdades {
    public String[] nomes;
    public int[] idades;

    public void entradaUsuario() {
         nomes = new String[5];
         idades = new int [5];
        int i = 0;

        do{
            try{
                String testeN="";
                int testeI=0;

                Scanner ler = new Scanner(System.in);
                System.out.println(" Insira o seu nome: ");
                testeN = ler.nextLine();
                System.out.println(" Insira a sua idade: ");
                testeI = ler.nextInt();
                if (testeI <=0 || testeI >=120) {
                    System.out.println(" IDADE INVALIDA, DIGITE NOVAMENTE ");
                } else {
                    nomes[i] = testeN;
                    idades[i] = testeI;
                    i++;
                }
            } catch(Exception e){
                System.out.println(" VALOR INVÁLIDO DIGITE NOVAMENTE ");
            }
        } while (i < 5);
    }

    public void mediaidades(){
        Scanner ent = new Scanner(System.in);
        double resultado =  (idades[0] + idades[4] + idades[3] + idades[4]) / 5;
        System.out.println(" A média das idades é:  " + resultado);
    }

    public void maisNovo(){
        int temp = idades [0];
        int coordenada = 0;
        for (int i = 0; i < idades.length; i++){
            if (temp < idades[i]){
                coordenada = i;
            }
        }
        System.out.println(" O mais novo que é: " + nomes [coordenada] + " tem " + idades [coordenada] + " anos. " );
    }
    public void maisVelho(){
        int temp = idades [0];
        int coordenada = 0;
        for (int i = 0; i < idades.length; i++){
            if (temp > idades[i]){
                coordenada = i;
            }
        }
        System.out.println(" o mais velho que é: " + nomes [coordenada] + " tem " + idades [coordenada] + " anos. ");
    }
}

