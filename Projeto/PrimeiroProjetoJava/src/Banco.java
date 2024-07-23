import java.util.Random;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String Conta = "Sofia";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("\n******************************");
        System.out.println("Nome do Cliente: " + Conta);
        System.out.println("Tipo da Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n******************************");

        String menu = """
                    Digite sua opção!
                    
                    1 - Consulte seu saldo!
                    2 - Fazer transferência
                    3 - Receber valor
                    4 - Encerrar
                """;
        Scanner entradaDeValores = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = entradaDeValores.nextInt();
        }

        if (opcao == 1) {
            System.out.println("Seu saldo em conta é: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Qual valor você deseja transferir?");
            double valor = entradaDeValores.nextDouble();
            if (valor > saldo) {
                System.out.println("Não pode ser realizado a transferência!");
            } else {
                saldo = saldo - valor;
                System.out.println("Transferência realizado! " + saldo);
            } /*else if (opcao == 3) {
                System.out.println("Você recebeu uma transferência de ");
                double valorSaldo = entradaDeValores.nextDouble();
                saldo = saldo + valorSaldo;
                System.out.println("Transferência realizado! " + saldo);
            }*/
        } else if (opcao != 4) {
                System.out.println("Opção Invalida");

            }
        }
    }
