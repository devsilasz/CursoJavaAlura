package PrimeiroProjeto;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {

            System.out.println("Liberado");

        } else {
            System.out.println("Deve pagar a locação");
        }





    }
}
