import java.util.Scanner;

public class ContaTerminal
{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero;
        String agencia, nomeCliente;
        float saldo;

        System.out.print("Digite o número da conta: ");
        numero = leia.nextInt();

        System.out.print("Digite o número da agência: ");
        agencia = leia.next();
        leia = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = leia.nextLine();

        System.out.print("Digite o valor do saldo: ");
        saldo = leia.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}