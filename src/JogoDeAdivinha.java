import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Tente adivinhar o número entre 0 a 100:");
            int numeroPensado = leitura.nextInt();
            if (numeroPensado == numeroAleatorio){
                System.out.println("Parabéns, você acertou o número!");
                break;
            } else if (numeroPensado < numeroAleatorio){
                System.out.println("O número digitado é menor que o número gerado!");
            } else {
                System.out.println("O número digitado é maior que o número gerado!");
            }
        }

        System.out.println("Suas chances acabaram!");
    }
}
