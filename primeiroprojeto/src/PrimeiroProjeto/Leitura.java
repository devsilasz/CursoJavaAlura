package PrimeiroProjeto;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.next();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
        System.out.println("Digite agora sua avaliação para o filme" + filme);
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);




    }
}
