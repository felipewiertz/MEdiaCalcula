package Metodos;

import javax.swing.JOptionPane;

public class Funciona_Sobrecarga {

    public static void main(String[] args) {

        Ficha_Funcionario funcionario = new Ficha_Funcionario(22, 2889.09, "Gisele", "Pedagoga");

        JOptionPane.showMessageDialog(null, funcionario.mostra_funcionario());

        concatena_aplicacao();
    }

    public static void concatena_aplicacao() {

        Acesso_Secundario a = new Acesso_Secundario();
    }
}