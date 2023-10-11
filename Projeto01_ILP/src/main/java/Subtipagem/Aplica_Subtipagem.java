package Subtipagem;

public class Aplica_Subtipagem {

    public static void main(String[] args) {

        Define_Mamifero df = new Define_Mamifero();
        Mamifero f = null;

        f = df.tipo_mamifero("cachorro");
        df.verifica_instancia(f);

        f = df.tipo_mamifero("puma");
        df.verifica_instancia(f);

        f = df.tipo_mamifero("onça");
        df.verifica_instancia(f);
    }
}
