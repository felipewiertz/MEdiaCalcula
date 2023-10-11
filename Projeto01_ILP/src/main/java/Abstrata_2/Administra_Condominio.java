package Abstrata_2;

public class Administra_Condominio {

    public static void main(String[] args) {

        Condominio b = new Condominio();
        Conceito c = new Condominio();

        final double a = 234.08;

        System.out.println("NOME DO CONDOMINIO: " + b.getNome_Condominio());
        System.out.println("VALOR DO CONDOMINIO: " + b.calcula_condominio(a));

        c.endereco_condominio();

    }
}