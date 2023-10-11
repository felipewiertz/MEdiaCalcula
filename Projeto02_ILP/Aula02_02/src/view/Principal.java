
package view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import negocio.Adicao;
import negocio.Divisao;
import negocio.Multiplicacao;
import negocio.Subtracao;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exibe caixa de diálogo com mensagem informativa
        JOptionPane.showMessageDialog(null, 
                                      "Programa para cálculo aritmético!", 
                                      "Calculadora com OO",
                                      JOptionPane.INFORMATION_MESSAGE);
        
        int opcao = 0;
        do {
            // exibe caixa de diálogo para receber a opção de cálculo a ser realizado
            opcao = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                "Informe a operação aritmética desejada:\n" +
                                "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir"));
            
            if (opcao < 1 || opcao > 4){
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
            
        } while (opcao < 1 || opcao > 4);
        
        // instancia objeto para receber valores a serem usados na conta
        Scanner entrada = new Scanner(System.in);
        // recebe valores do usuário
        System.out.print("Informe o valor 1: ");
        float valor1 = entrada.nextFloat();
        System.out.print("Informe o valor 2: ");
        float valor2 = entrada.nextFloat();
        
        // de acordo com a operação arimética desejada, instancia a 
        // classe correspondente e realiza o cálculo
        switch (opcao){
            case 1:
                Adicao objAdicao = new Adicao(valor1, valor2);
                objAdicao.calcular();
                System.out.println(String.format("Resultado: %.2f.", objAdicao.getResultado()));
                break;
            case 2:
                Subtracao objSubtracao = new Subtracao(valor1, valor2);
                objSubtracao.calcular();
                System.out.println(String.format("Resultado: %.2f.", objSubtracao.getResultado()));
                break;
            case 3:
                Multiplicacao objMultiplicacao = new Multiplicacao(valor1, valor2);
                objMultiplicacao.calcular();
                System.out.println(String.format("Resultado: %.2f.", objMultiplicacao.getResultado()));
                break;
            case 4:
                Divisao objDivisao = new Divisao(valor1, valor2);
                objDivisao.calcular();
                System.out.println(String.format("Resultado: %.2f.", objDivisao.getResultado()));
                break;
        }
    }
}
