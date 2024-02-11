package br.com.desafio03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        n1 = scanner.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
