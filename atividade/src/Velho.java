import java.util.Scanner;

public class Velho {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = Entrada.nextInt();
        System.out.println("Quantos anos de contribuição você tem?");
        int anos = Entrada.nextInt();
        if (idade >= 70 && anos >= 50){
            System.out.println("Você pode se aposentar!");
        }else {
            System.out.println("Infelizmente você não pode se aposentar");
        }

    }


}
