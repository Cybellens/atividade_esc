import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Diga a distancia entre as cidades: ");
        double distancia = Entrada.nextDouble();
        System.out.println("Diga qual é a sua velocidade: ");
        double velocidade = Entrada.nextDouble();
        double horario =distancia/velocidade;
        System.out.println("Seu tempo de viagem é de "+ horario);
        if (horario <= 3){
            System.out.println("Faça uma parada para descansar");
        }
    }
}
