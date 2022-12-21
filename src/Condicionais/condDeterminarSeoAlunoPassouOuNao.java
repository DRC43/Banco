package Condicionais;

public class condDeterminarSeoAlunoPassouOuNao {
    public static void main(String[] args) {
        double nota1 = 5;
        double nota2 = 8;
        double nota3 = 6;
        double nota4 = 7;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6.5) {
            System.out.println(" O aluno foi aprovado. ");
        } else {
            System.out.println(" O aluno não foi aprovado.");
        }
    }
}


