import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite a distância percorrida do dia: ");
        int diaria = Entrada.nextInt();
        System.out.println("Qual a distâcia total a ser percorrida: ");
        int total = Entrada.nextInt();
        int compl = total/diaria;
        System.out.println("Você vai completar a sua corrida em "+compl+ " dias");
    }
}
