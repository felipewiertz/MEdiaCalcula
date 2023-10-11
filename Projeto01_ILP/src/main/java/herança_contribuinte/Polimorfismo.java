package herança_contribuinte;
import javax.swing.*;

public class Polimorfismo {
    
    public static void main (String args[]){
    
        Contribuinte pessoa = null;
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Escolha um valor: 
                                                                1 - Constribuinte 
                                                                 2 - Pessoa fisica 
                                                                 3 - Funcionario 
                                                                 4 - Pessoa Juridica"""));
        
        switch(tipo){
        
            case 1:
            {
                pessoa = new Contribuinte(); break;
            }
            
            case 2:
            {
                pessoa = new PessoaFisica(); break;
            }
            
            case 3:
            {
                pessoa = new Funcionario(); break;
            }
            
            case 4:
            {
                pessoa = new Pessoa_Juridica(); break;
            }
            
            default:
            {
                JOptionPane.showMessageDialog(null, "Valor Invalido");
                System.exit(0);
            }
        }
        
        pessoa.mostraClasse();
    }
}
