package ClassesOrientadaObjetos;

import java.util.Scanner;

public class boletim{
    Scanner ent = new Scanner(System.in);
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    int i;
    int contAluno = 0;

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public void notas(){

        System.out.println(" \n BEM VINDO AO BOLETIM ESCOLAR ");
        System.out.println(" \n Para iniciarmos insira a seu nome completo: \n ");
        String nome = ent.nextLine();

        double contaAluno = 0;
        contaAluno++;

        // recebe a 1ª nota
        System.out.println(" \n Digite sua 1ª nota: \n ");
        nota1 = ent.nextDouble();

        // recebe a 2ª nota
        System.out.println(" Digite sua 2ª nota: \n ");
        nota2 = ent.nextDouble();

        // recebe a 3ª nota
        System.out.println(" Digite sua 3ª nota: \n ");
        nota3 = ent.nextDouble();

        // calcula a média
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("\n A MÉDIA DO ALUNO É: " + media + "\n");

        // mostra a nota do aluno
        if (media >= 7) {
            System.out.println(" \n O aluno foi aprovado !!! \n ");

        } else if (media == 6 | media == 6.9) {
                System.out.println(" \n O aluno esta em recuperação !!! \n ");

        } else if (media < 6 ) {
                System.out.println(" O aluno esta reprovado !!! \n ");
        }
    }
}