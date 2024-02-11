package br.com.desafio03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Agora digite dois numeros");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Números diferentes: Primeiro número maior que o segundo");
        } else if (n2 > n1) {
            System.out.println("Números diferentes: Segundo numero maior que o primeiro");
        } else {
            System.out.println("Números iguais");
        }





    }
}
