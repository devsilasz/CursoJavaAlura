package br.com.desafio03;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1;
        int fatorial = 1;
        System.out.println("Digite um numero para calcularmos o fatorial");
        n1 = scanner.nextInt();
        for (int i = 1; i <= n1 ; i++) {
        fatorial *= i;
        }
        System.out.println("O fatorial de " + n1 + " é: " + fatorial);
    }
}
