import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite um número de 0 a 100");
            int chute = entrada.nextInt();
            if (chute < numeroAleatorio){
                System.out.println("O número é maior que " + chute);
            } else if (chute > numeroAleatorio) {
                System.out.println("O número é menor que " + chute);
            }   else {
                System.out.println("Parabéns você acertou!");
                break;
            }
        }
    }
}
