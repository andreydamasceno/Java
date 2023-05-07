import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Tente adivinhar o número:");
            int numeroPensado = leitura.nextInt();
            if (numeroPensado == numeroAleatorio){
                System.out.println("Parabéns, você acertou o número!");
                break;
            } else {
                System.out.println("Número errado!");
            }
        }

        System.out.println("Suas chances acabaram!");
    }
}
