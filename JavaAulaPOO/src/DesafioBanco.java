import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        String nome = "Jorge";
        String tipoConta = "Corrente";
        double saldo = 1000;
        int opcao = 0;

        System.out.println("*************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************");

        String menu = """
                ** Digite sua opção **
                1 - Consulta saldo
                2 - Enviar
                3 - Depositar
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            }else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não a saldo para realizar envio");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor depositado: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }

    }
}
