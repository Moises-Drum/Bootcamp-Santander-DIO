import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Por favor, digite o numero da agência: ");
        String agencia = scan.next();
        scan.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Por favor, um valor a ser depositado: ");
        double saldo = scan.nextDouble();

        ContaTerminal usuario = new ContaTerminal(numero, agencia, nome, saldo);

        usuario.dadosDoCliente();
    }
}
