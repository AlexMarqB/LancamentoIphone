public class NavegadorInternet implements iPhone {

    void exibirPagina(String url) {
        System.out.println("Acesou a página " + url);
    }

    void adicionarNovaAba() {
        System.out.println("Adicionou uma aba");
    }

    void atualizarPagina() {
        System.out.println("Atualizou a página");
    }
}
