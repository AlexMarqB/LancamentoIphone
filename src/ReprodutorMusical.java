public class ReprodutorMusical implements iPhone{

    private String musica;

    void selecionarMusica(String musica) {
        this.musica = musica;
    }

    void tocar() {
        System.out.println("Tocando musica..." + musica);
    }

    void pausar() {
        System.out.println("Pausou a musica..." + musica);
    }
}
