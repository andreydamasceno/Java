import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite seu filme favorto:");
        String filme = leitura.nextLine();

        System.out.println("digite o ano do filme:");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua nota para o filme de zero a 10?");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Nota: " + avaliacao);
    }
}
