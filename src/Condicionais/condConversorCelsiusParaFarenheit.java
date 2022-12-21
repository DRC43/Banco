package Condicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class condConversorCelsiusParaFarenheit {
    public condConversorCelsiusParaFarenheit() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean lValidaTemperatura = true;

        System.out.println("Insira a temperatura que deseja converter:");
        double temperatura = ler.nextDouble();
        while (lValidaTemperatura) {

            System.out.println("A temperatura informada esta em Cº ou Fª ?");
            String tipoDeTemperatura = ler.next();

            if (tipoDeTemperatura.equals("C") || tipoDeTemperatura.equals("c")) {
                temperatura = (temperatura * 1.8) + 32;
                System.out.println(" A conversão de temperatura de celsius para farenheit é: " + temperatura);
                lValidaTemperatura = false;

            } else if (tipoDeTemperatura.equals("F") || tipoDeTemperatura.equals("f")) {
                temperatura = (temperatura - 32) / 1.8;
                System.out.println(" A conversão de temperatura de farenheit para celsius é: " + temperatura);
                lValidaTemperatura = false;

            } else {
                System.out.println(" A letra informada não corresponde a uma unidade de medida de temperatura. ");
            }
        }
    }
}
