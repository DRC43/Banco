package VetoreseMatrizes;

public class atividadeVetor {
    public static void main(String[] args) {

        String [] nomes = {"João", "Pedro", "Luis", "Kalel", "Otávio"};
        int [] idades = {15,25,96,102,2};

        int maisVelho = idades[0];
        int maisNovo = idades[0];
        int somatorio = 0;

        for(int i = 0; i < idades.length; i++) {

            if(idades[i] > maisVelho) {
                maisVelho = i;
            }
            if(idades[i] < maisNovo) {
                maisNovo = i;
            }
            // somatorio = somatorio + idades [i];
        }
        somatorio += idades[1];
        System.out.println("o mais novo é: " + nomes[maisNovo] + " com " + idades[maisNovo] + " anos.");
        System.out.println("o mais velho é: " + nomes[maisVelho] + " com " + idades[maisVelho] + " anos.");
    }
}
