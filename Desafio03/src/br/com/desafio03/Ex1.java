package br.com.desafio03;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.println("Digite o primeiro numero");
        n1 = scanner.nextInt();

        if (n1 < 0) {
            System.out.println("Número negativo");
        } else if (n1 > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número neutro");
        }





    }
}
