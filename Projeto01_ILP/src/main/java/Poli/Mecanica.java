package Poli;

import javax.swing.JOptionPane;

public class Mecanica {

    public static void main(String args[]) {

        Ordem_Servico mecanico = new Ordem_Servico();

        int tipo_marca = Integer.parseInt(JOptionPane.showInputDialog("""
                Informe a marca do carro:
                1 - VOLKSWAGEM
                2 - FORD"""));

        mecanico.concessionaria(tipo_marca);

        int tipo_servico = Integer.parseInt(JOptionPane.showInputDialog("""
                Digite o servico desejado:
                1 - FUNILARIA
                2 - PINTURA
                3 - ELETRICA
                4 - TODOS OS SERVICOS"""));

        mecanico.servico(tipo_servico);

    }
}
