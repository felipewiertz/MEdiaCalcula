package Matrizes;

import javax.swing.*;

public class MatrizEx02 {

    public static void main(String[] args) {

        int tam = 10;
        int codFunc[] = new int[tam];
        float salarFunc[] = new float[tam];

        String Func[] = new String[tam];
        String saida = "Codigo\tFuncionario\tSalario\n";

        // Entrada de Dados
        for (int i = 0; i < tam; i++) {

            String aux;

            aux = JOptionPane.showInputDialog("Informe o Codigo do " + (i + 1) + " Funcionario");
            codFunc[i] = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Informe o Nome do " + (i + 1) + " Funcionario");
            Func[i] = String.valueOf(aux);

            aux = JOptionPane.showInputDialog("Informe o Salario do " + (i + 1) + " Funcionario");
            salarFunc[i] = Float.parseFloat(aux);
        }

        // Saida de Dados
        for (int i = 0; i < tam; i++) {

            saida += codFunc[i] + "\t" + Func[i] + "\t" + "R$" + salarFunc[i] + "\n";

        }

        JTextArea saidaDados = new JTextArea();
        saidaDados.setText(saida);

        JOptionPane.showMessageDialog(null, saidaDados,
                "Funcionario e Salarios", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
