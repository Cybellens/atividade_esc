import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        System.out.println("Quantos anos você tem?");

        Scanner Entrada = new Scanner(System.in);

        int idade = Entrada.nextInt();
        if (idade < 16){
            System.out.println("Você não pode participar da quadrilha :(");
        }else {
            System.out.println("Parabéns, você pode participar da quadrilha :)");
        }
    }
}
