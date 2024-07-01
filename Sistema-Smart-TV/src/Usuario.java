import java.util.Scanner;

public class Usuario
{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.print("Digite para qual canal deseja mudar: ");
        smartTV.mudarCanal(leia.nextInt());
        
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        
        smartTV.ligar();
        smartTV.desligar();
        smartTV.ligar();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);
    }
}