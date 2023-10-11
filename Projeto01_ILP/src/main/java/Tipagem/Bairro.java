package Tipagem;

public class Bairro extends Cidade {

    Bairro(String nome_local, int habitatntes) {

        super(nome_local, habitatntes);
    }

    public void setNomeBairro(String nome_local) {

        this.nome_local = nome_local + "_area";
    }

    public String getNomeBairro() {

        return nome_local;
    }

    public void setHabitantesBairro(int habitatntes) {

        this.habitantes = habitatntes * 200;
    }

    public int getHabitantesBairro() {

        return habitantes;
    }
}
