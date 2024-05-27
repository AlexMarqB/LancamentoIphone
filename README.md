classDiagram

    class ReprodutorMusical {
    ReprodutorMusical : -String musica
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +atender()
        +iniciarCorreioVoz()
        +ligar(String exemplo)
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String exemplo)
    }

    class iPhone {
        #bloquear()
        #desbloquear()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
