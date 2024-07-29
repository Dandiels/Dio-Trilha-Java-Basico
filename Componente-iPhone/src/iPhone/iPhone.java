package iPhone;

import iPhone.AparelhoTelefonico.*;
import iPhone.NavegadorInternet.*;
import iPhone.ReprodutorMusical.*;

public class iPhone
{
    public static void main(String[] args)
    {
        ReprodutorMusical iPod = new iPod();
        AparelhoTelefonico telefone = new Telefone();
        NavegadorInternet internetExplorer = new InternetExplorer();

        iPod.tocar();
        iPod.pausar();
        iPod.selecionarMusica("Stairway To Heaven");

        telefone.ligar("+55 (77) 3383-4766");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        internetExplorer.exibirPagina("https://github.com");
        internetExplorer.adicionarNovaAba();
        internetExplorer.atualizarPagina();
    }
}