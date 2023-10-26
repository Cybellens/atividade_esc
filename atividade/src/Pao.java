import java.util.Scanner;

public class Pao {
    public static void main(String[] args) {
        System.out.println("Quanto reais de pão você quer comprar??");

        Scanner Entrada = new Scanner(System.in);

        double dinheiro = Entrada.nextFloat();
        double pao = 0.30;

        if (dinheiro>pao){
            System.out.println("Você pode comprar pão");
        }else {
            System.out.println("Você não pode comprar pão");
        }

    }
}
