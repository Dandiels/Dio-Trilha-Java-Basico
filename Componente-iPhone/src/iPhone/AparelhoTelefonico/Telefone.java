package iPhone.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico
{
    public void ligar(String numero)
    {
        System.out.println("Ligando para " + numero + ".");
    }

    public void atender()
    {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz()
    {
        System.out.println("Iniciando Correio de Voz.\n");
    }
}