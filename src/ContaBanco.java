import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome ="";
        String sobrenome = "";
        String nomeCliente = nome + sobrenome;
        String agencia = "";
        int numeroConta;
        double saldo;

        System.out.println("Bem vindo ao sistema bancário, " +
                "vamos realizar o seu cadastro a seguir");

        System.out.println("Digite seu nome: ");
        nome = leitura.next();

        System.out.println("Digite seu sobrenome:");
        sobrenome = leitura.next();

        System.out.println("Digite a agência");
        agencia = leitura.next();

        System.out.println("Digite o número da conta");
        numeroConta = leitura.nextInt();

        System.out.println("Digite o seu saldo atual: ");
        saldo = leitura.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, " +
                        "sua agência é "+ agencia + " conta: " + numeroConta + " e seu saldo é: "+ saldo + "já " +
                        "está disponível para saque.");
    }
}