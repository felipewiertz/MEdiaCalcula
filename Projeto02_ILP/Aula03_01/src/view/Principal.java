
package view;

import negocio.Figura;
import negocio.Quadrado;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // *** UPCASTING ***
        Quadrado objQuadradoUp = new Quadrado();
        objQuadradoUp.setLado(5);
        // as linhas abaixo sugerem alguma lógica/necessidade de 
        // negócio que justifiquem a utilização de upcasting
        // ...
        
        // via atribuição direta (casting implícito), repassa a instância 
        // da classe filha para gerar um objeto da classe pai (upcasting)
        Figura objFiguraUp = objQuadradoUp;
        // exibe resultado da área a partir da instância da classe pai
        System.out.println(
            String.format("[Upcasting] A área da figura é de %.2f cm².", 
                objFiguraUp.calcularArea()));
        
        
        // *** DOWNCASTING ***
        // gera objeto da classe pai a partir da instância da classe filha
        Figura objFiguraDown = new Quadrado(); // upcasting (somente nesta linha!)
        
        // as linhas abaixo sugerem alguma lógica/necessidade de 
        // negócio que justifiquem a utilização de downcasting
        // ...

        // via atribuição indireta (casting explícito) , repassa a instância 
        // da classe pai para gerar um objeto da classe filha (downcasting)
        Quadrado objQuadradoDown = (Quadrado)objFiguraDown;
        objQuadradoDown.setLado(7);

        // exibe resultado da área a partir da instância da classe pai
        System.out.println(
            String.format("[Downcasting] A área do quadrado é de %.2f cm².", 
                objQuadradoDown.calcularArea()));
    }
}
