package Abstracao;

public class Aplicacao {

    public static void main(String[] args) {

        Classe_Abstrata a = new Classe_Filha();

        a.set_menssagem("Demonstrando classe abstrata");
        a.mostra_mensagem();
    }
}
