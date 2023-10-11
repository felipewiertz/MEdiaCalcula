package Tipagem;

public class Cidade extends Municipio {

    protected String nome_local;
    protected int habitantes;

    Cidade(String nome_local, int habitantes) {

        super(nome_local, habitantes);
    }

    public void setNome_local(String nome_local) {

        this.nome_local = nome_local;
    }

    public void setHabitantes(int habitantes) {

        this.habitantes = habitantes;
    }

    public String getNome_local() {

        return nome_local;
    }

    public int getHabitantes() {

        return habitantes;
    }
}
