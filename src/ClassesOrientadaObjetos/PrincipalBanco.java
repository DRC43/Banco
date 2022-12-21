package ClassesOrientadaObjetos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalBanco {

    public  static  void main ( String [] args ) {
        banco Santander = new banco();
        Scanner input = new Scanner(System.in);

        Santander.setConta("2602-9");
        Santander.setSaldo(4259.56);
        Santander.setDebito(248.89);
        Santander.setCredito(1579.78);

        System.out.printf(" \n *** BEM VINDO AO BANCO SANTANDER ***");
        System.out.println(" \n Conta: " + Santander.getConta());
        Santander.calcular();
        System.out.printf(" O seu saldo é: %.2f. ", Santander.calcular());
        if (Santander.getSaldoAtual() < 0){
            System.out.println(" \n Seu saldo é negativo. ");
        } else {
            System.out.println(" \n Seu saldo é positivo. ");
        }

    }
}



