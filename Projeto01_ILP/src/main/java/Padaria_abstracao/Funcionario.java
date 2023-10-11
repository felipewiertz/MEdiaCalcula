package Padaria_abstracao;

public class Funcionario extends Pessoa{
    private String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
