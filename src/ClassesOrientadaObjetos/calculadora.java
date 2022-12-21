package ClassesOrientadaObjetos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculadora {

    Scanner ler = new Scanner(System.in);
    int num1;
    int num2;

    String operacao = "";

    public void  calculadora() {

       switch (operacao) {
           case "+":
               System.out.println("o resultado é " + (num1 + num2));
               break;

           case "-":
               System.out.println("o resultado é " + (num1 - num2));
               break;

           case "*":
               System.out.println("o resultado é " + (num1 * num2));
               break;

           case "/":
               System.out.println("o resultado é " + (num1 / num2));
               break;
       }
    }

    public void entrada(){
        System.out.println(" Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.println(" Digite o segundo número: ");
        num2 = ler.nextInt();

        System.out.println(" Qual operação você deseja? Ex (+,-,/,*) ");
        operacao = ler.next();
    }
}

