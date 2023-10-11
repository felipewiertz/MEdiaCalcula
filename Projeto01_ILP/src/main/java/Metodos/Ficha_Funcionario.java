package Metodos;

public class Ficha_Funcionario {

    private String nome;
    private int idade;
    private String profissao;
    private double salario;

    Ficha_Funcionario e;

    Ficha_Funcionario(String nome, String profissao, int idade, double salario) {

        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.salario = salario;

    }

    Ficha_Funcionario(int idade, double salario, String nome, String profissao) {

        this.idade = idade;
        this.salario = salario;
        this.nome = nome;
        this.profissao = profissao;
    }

    Ficha_Funcionario(Ficha_Funcionario e) {

        this.e = e;
        mostra_funcionario(e);
    }

    public void mostra_funcionario(Ficha_Funcionario f) {

        System.out.println(
                "Nome: " + f.nome + "\nIdade: " + f.idade + "\nProfissao: " + f.profissao + "\nSalario: " + f.salario);
    }

    public String mostra_funcionario() {

        return ("Nome: " + nome + "\nIdade: " + idade + "\nProfissao: " + profissao + "\nSalario: " + salario);
    }
}
