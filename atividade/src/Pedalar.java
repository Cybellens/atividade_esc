import java.util.Scanner;

public class Pedalar {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Qual a distancia você percorre diariamente? ");
        int distancia = Entrada.nextInt();
        int total = distancia * 7;
        System.out.println("A distância percorrida em uma semana foi de: "+total);
    }
}
