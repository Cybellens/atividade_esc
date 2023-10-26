import java.util.Scanner;

public class Onibus {
    public static void main(String[] args) {
        System.out.println("Qual a sua idade?");
        Scanner Entrada = new Scanner(System.in);

        int idade = Entrada.nextInt();

        if (idade < 3){
            System.out.println("Entrada gratuita");
        } else if (idade > 3 && idade < 19 ) {
            System.out.println("O valor do seu ingresso é de 25,00");

        }else {
            System.out.println("O valor do seu ingresso é de 50,00");
        }
    }
}
