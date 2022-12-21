package ClassesOrientadaObjetos;

import java.util.Scanner;

public class PrincipalBoletim {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        boletim calcnota = new boletim();
        do{
            calcnota.notas();
            System.out.println( " Deseja continuar calculando média ? S/N ");
        } while (ler.nextLine().equalsIgnoreCase("s"));
    }
}
