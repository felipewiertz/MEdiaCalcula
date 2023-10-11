package Receita;

public class Dados_Contribuinte {
    private String nome;
    private String CPF;
    private String CNPJ;
    private String cartao;

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartao() {
        return cartao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
}
