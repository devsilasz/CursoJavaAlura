package br.com.desafio03;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int result;
        System.out.println("Digite um numero inteiro para fazer a tabuada");
        n1 = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
        result = n1 * i;
        System.out.println(n1 + " * " + i + " = " + result);
        }


    }
}
