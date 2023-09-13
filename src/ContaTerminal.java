import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência com digíto: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Qual seu saldo no banco?");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ". obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo +
                " já está disponnível para saque.");







    }
}
