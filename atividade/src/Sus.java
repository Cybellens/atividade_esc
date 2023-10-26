import java.util.Scanner;

public class Sus {
    public static void main(String[] args) {
        System.out.println("Quantos anos você tem?");
        Scanner Entrada = new Scanner(System.in);

        int idade = Entrada.nextInt();

        if (idade > 15 && idade < 70){
            System.out.println("Parabéns, você pode doar sangue :)");
        }else {
            System.out.println("Você não pode doar sangue :(");
        }
    }
}
