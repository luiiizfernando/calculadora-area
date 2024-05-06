import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao < 1 || opcao > 2)
        {
            System.out.println("1. Calcular área do quadrado.");
            System.out.println("2. Calcular área do círculo.");
            System.out.print("Digite a opcao desejada: ");
            opcao = leitura.nextInt();
        }
        if (opcao == 1)
        {
            System.out.print("Digite o lado do quadrado: ");
            int lado = leitura.nextInt();
            System.out.println("A área do quadrado é: " + (lado * lado));
        }
        else
        {
            System.out.print("Digite o raio do círculo: ");
            double raio = leitura.nextDouble();
            System.out.println("A área do circulo é: " + (Math.PI * Math.pow(raio, 2)));
        }
    }
}