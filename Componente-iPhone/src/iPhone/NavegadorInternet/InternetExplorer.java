package iPhone.NavegadorInternet;

public class InternetExplorer implements NavegadorInternet
{ 
    public void exibirPagina(String url)
    {
        System.out.println("Exibindo a página com a URL: " + url + ".");
    }
    
    public void adicionarNovaAba()
    {
        System.out.println("Adicionando nova aba.");
    }
    
    public void atualizarPagina()
    {
        System.out.println("Atualizando a página.");
    }   
}