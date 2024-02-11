package br.com.desafio03;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        double n1;
        double n2;
        double result;

        System.out.println("""
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """);

        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite dois valores para calcular a área do quadrado (em cm)");
                n1 = scanner.nextDouble();
                n2 = scanner.nextDouble();
                result = n1 * n2;
                System.out.println("Resultado: " + result + "cm²\n");
                break;
            case 2:
                System.out.println("Digite o valor do raio em cm");
                n1 = scanner.nextDouble();
                result = n1 * 3.14;
                System.out.println("Resultado: " + result + "cm²\n");
        }

    }
}
