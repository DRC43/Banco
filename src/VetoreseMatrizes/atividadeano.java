package VetoreseMatrizes;
import java.util.Scanner;

public class atividadeano {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean continuar;
        int mes = 0;
        int dias = 0;
        int ano = 0;

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.println(" Digite o número do mês que você deseja: ");
                mes = ler.nextInt();
                if(mes <= 0 || mes > 12){
                    continuar = false;
                } else{
                    continuar = true;
                }
            } catch (Exception d){

            }
        }while(!continuar);


        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.println(" Digite o ano que você deseja: ");
                ano = ler.nextInt();
                if(ano <= 0 ){
                    continuar = false;
                } else{
                    continuar = true;
                }
            } catch (Exception d){

            }
        } while(!continuar); mesAno(mes, dias, ano);

    }
        public static void mesAno (int mes, int dias, int ano){

            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                case 2:
                    if((ano % 4 == 0) && ! (ano % 100 == 0) || (ano % 400 == 0))
                        dias = 29;
                    else
                        dias = 28;
                    break;
                default:
                    System.out.println("Esse mês é invalido, tente novamente.");
                    break;
            }
            System.out.println("Número de dias é: " + dias + ".");
        }
}
