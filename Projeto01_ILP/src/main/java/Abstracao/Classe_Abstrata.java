package Abstracao;

public abstract class Classe_Abstrata {

    private String mensagem;

    protected void set_menssagem(String mensagem) {

        this.mensagem = mensagem;
    }

    protected String get_menssagem() {

        return mensagem;
    }

    protected abstract void mostra_mensagem();

}
