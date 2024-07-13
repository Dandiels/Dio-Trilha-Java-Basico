import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador
{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args)
    {
        int parametroUm, parametroDois;

        try
        {
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = leia.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = leia.nextInt();
            
            contar(parametroUm, parametroDois);
        }
        catch (InputMismatchException e)
        {
            System.err.println("O parâmetro deve ser um número inteiro.");
        }
        catch (ParametrosInvalidosException e)
        {
            System.err.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        if (parametroUm >= parametroDois)
        {
            throw new ParametrosInvalidosException();
        }            
        
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++)
        {
            System.out.println("Imprimindo o número " + i + ".");
        }
    }
}

class ParametrosInvalidosException extends Exception
{
    public ParametrosInvalidosException()
    {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}