package VariaveisOperadoresMatematicosEntradaeSaida;

import java.sql.SQLOutput;

public class calculoQuantaPessoasCabemNaSalaDeCinema {
    public static void main(String[] args) {
        int fileira = 10;
        int sala = 8;
        int cont = fileira * sala;
        System.out.println(" Cabem nesta sala de cinema " + cont + " pessoas. ");

        int especial = cont / 10;
        System.out.println(" Destes " + especial + " lugares são destinados a pessoas com defiência, o que corresponde"
                + " a 10% da capacidade da sala. " );
    }

}
