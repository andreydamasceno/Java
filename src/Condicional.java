public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Este é um lançamento recente!");
        } else {
            System.out.println("Esse é um filme antigo!");
        }

        if (tipoDoPlano.equals("Plus") || incluidoNoPlano) {
            System.out.println("Você pode assistir a esse filme a qualquer momento!");
        } else {
            System.out.println("Este filme não está incluso no seu plano!");
        }
    }
}
