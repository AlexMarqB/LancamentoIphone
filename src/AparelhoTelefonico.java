public class AparelhoTelefonico implements iPhone {

    void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    void atender() {
        System.out.println("Atendeu a ligação");
    }

    void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz...");
    }
}
