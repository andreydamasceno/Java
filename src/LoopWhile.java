import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua nota para o filme de zero a 10, ou -1 para encerrar:");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else if (nota == -1){
                System.out.println("Você não deu nenhuma nota!");
            }
        }

        if (nota != -1){
            System.out.println("Média de avaliação " + mediaAvaliacao / totalDeNotas);
        }
    }
}
