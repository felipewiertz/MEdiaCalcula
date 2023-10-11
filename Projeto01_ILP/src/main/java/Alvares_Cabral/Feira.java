package Alvares_Cabral;

public abstract class Feira {

    Fazer_feira comprar;
    Fiscaliza_Feira fiscal;

    public Feira() {
    }

    public void set_fruta(Fazer_feira f) {

        comprar = f;
    }

    public void set_verdura(Fazer_feira v) {

        comprar = v;
    }

    public void set_fiscal(Fiscaliza_Feira g) {

        fiscal = g;
    }

    public void chama_comprar_fruta() {

        comprar.comprar_na_barraca();
    }

    public void chama_comprar_verdura() {

        comprar.comprar_na_barraca();
    }

    public void chama_fiscal_feira() {

        fiscal.fizcalizar_feira();
    }

}
