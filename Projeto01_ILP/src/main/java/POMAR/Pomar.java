package POMAR;

public class Pomar {

    private String arvore;
    private String fruta;

    public Pomar() {

        arvore = "macieira";
        fruta = "maça";
    }

    public void set_arvore(String arvore) {

        this.arvore = arvore;
    }

    public void set_fruta(String fruta) {

        this.fruta = fruta;
    }

    public String get_arvore() {

        return arvore;
    }

    public String get_fruta() {

        return fruta;
    }

    public double area_pomar() {

        return 390.26;
    }
}
