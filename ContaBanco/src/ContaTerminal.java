import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ". digite sua agência:");
        String agencia = scanner.next();

        System.out.println("agora, digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("digite seu saldo atual: ");
        double saldo = scanner.nextDouble();


        System.out.println(
            "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia +". conta "
            + numero + ". Seu saldo "
            + saldo + " já está disponível para saque."


        );
    }
}
