package Tipagem;

public class Distrito extends Cidade {

    Distrito(String nome_local, int habitantes) {

        super(nome_local, habitantes);
    }

    public void setNomeDistrito(String nome_local) {

        this.nome_local = nome_local + "_District";
    }

    public String getNomeDistrito() {

        return nome_local;
    }

    public void setHabitanteDistrito(int habitantes) {

        this.habitantes = habitantes * 300;
    }

    public int getHabitanteDistrito() {

        return habitantes;
    }
}
