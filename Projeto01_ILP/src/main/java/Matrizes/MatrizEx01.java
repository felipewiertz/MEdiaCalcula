package Matrizes;

import javax.swing.*;

public class MatrizEx01 {

    public static void main(String[] args) {

        int linha, coluna;
        int matrizA[][] = new int[3][4];
        int matrizB[][] = new int[4][3];
        int calculo[][] = new int[3][3];

        String saidaA = "LinhaA\tColunaA\tValoresA\n";
        String saidaB = "LinhaB\tColunaB\tValoresB\n";
        String resultado = "Linha\tColuna\tProduto\n";

        // ENTRADA DOS VALORRES NA MATRIZA E MATRIZB
        for (linha = 0; linha < matrizA.length; linha++) {
            for (coluna = 0; coluna < matrizA[linha].length; coluna++) {

                String valor = JOptionPane.showInputDialog("Digite o valor da matrizA" + "\n" + "Linha: " + (linha + 1)
                        + "\n" + "Coluna: " + (coluna + 1));
                matrizA[linha][coluna] = Integer.parseInt(valor);
            }
        }

        for (linha = 0; linha < matrizB.length; linha++) {
            for (coluna = 0; coluna < matrizB[linha].length; coluna++) {

                String valor = JOptionPane.showInputDialog("Digite o valor da matrizB" + "\n" + "Linha: " + (linha + 1)
                        + "\n" + "Coluna: " + (coluna + 1));
                matrizB[linha][coluna] = Integer.parseInt(valor);
            }
        }

        // Produto das Matrizes
        for (linha = 0; linha < matrizA.length; linha++) {
            for (coluna = 0; coluna < matrizB[linha].length; coluna++) {
                for (int k = 0; k < matrizA.length; k++) {

                    calculo[linha][coluna] = calculo[linha][coluna] + matrizA[linha][k] * matrizB[k][coluna];
                }
            }
        }

        // Saida dos Dados
        for (linha = 0; linha < matrizA.length; linha++) {
            for (coluna = 0; coluna < matrizA[linha].length; coluna++) {

                saidaA += linha + "\t" + coluna + "\t" + matrizA[linha][coluna] + "\n";
            }
        }

        for (linha = 0; linha < matrizB.length; linha++) {
            for (coluna = 0; coluna < matrizB[linha].length; coluna++) {

                saidaB += linha + "\t" + coluna + "\t" + matrizB[linha][coluna] + "\n";
            }
        }

        for (linha = 0; linha < calculo.length; linha++) {
            for (coluna = 0; coluna < calculo[linha].length; coluna++) {

                resultado += linha + "\t" + coluna + "\t" + calculo[linha][coluna] + "\n";
            }
        }

        JTextArea saidadados = new JTextArea();
        saidadados.setText(saidaA + saidaB + resultado);

        JOptionPane.showMessageDialog(null, saidadados, "PRODUTO MATRIZ",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
