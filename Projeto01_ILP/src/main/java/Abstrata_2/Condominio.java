package Abstrata_2;

public class Condominio extends Conceito {

    protected String getNome_Condominio() {

        return "Vila Nova";
    }

    protected double calcula_condominio(double a) {

        return a * 1.066;
    }

    public void endereco_condominio() {

        System.out.println("Rua A, n: 22");
    }
}
