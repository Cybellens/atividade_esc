import java.util.Scanner;

public class Verao {
    public static void main(String[] args) {
        System.out.println("Como está o clima?");

        Scanner Entrada = new Scanner(System.in);

        String tempo = Entrada.nextLine();
        if (tempo .equals("ensolarado") ){
            System.out.println("Leve seu guarda-sol!");
        }else {
            System.out.println("Não leve seu guarda-sol");
        }
    }
}
