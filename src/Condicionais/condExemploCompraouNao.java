package Condicionais;

public class condExemploCompraouNao {
    public static void main(String[] args){
        double valor = 1989;
        String marca = "Motorola";
        int memoria = 4;

        // && e
        // || ou

        if (valor <= 1500 || marca.equals("iPhone")){
            if(memoria >= 6);
            System.out.println("comprei");
        } else {
            System.out.println("não comprei, esta muito caro.");
        }
    }
}
