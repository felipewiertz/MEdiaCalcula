package Padaria_abstracao;


public class Produto {
    private int cod;
    private int preco;

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setPreco(int preco) {
        this.preco = this.preco + preco;
    }

    public int getPreco() {
        return preco;
    }

}
