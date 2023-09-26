// Interface para a funcionalidade de Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void iniciarCorreioVoz();
    void vivaVoz();
    void silenciar();
    void colocarEmEspera();
    void adicionarChamada();
    void encerrarChamada();
}

// Classe que representa o iPhone e implementa as interfaces
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação das funcionalidades do Reprodutor Musical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música interrompida.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume.");
    }

    @Override
    public void abaixarVolume() {
        System.out.println("Abaixando o volume.");
    }

    // Implementação das funcionalidades do Aparelho Telefônico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Ativando viva-voz.");
    }

    @Override
    public void silenciar() {
        System.out.println("Silenciando chamada.");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Colocando chamada em espera.");
    }

    @Override
    public void adicionarChamada() {
        System.out.println("Adicionando nova chamada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    // Implementação das funcionalidades do Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador.");
    }

    @Override
    public void fecharAbaNavegador() {
        System.out.println("Fechando aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página.");
    }
}

// Exemplo de uso
class ExemploIPhone {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Testando as funcionalidades do iPhone
        iphone.tocarMusica("Música 1");
        iphone.aumentarVolume();
        iphone.fazerChamada("123-456-789");
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.exemplo.com");
    }
}
