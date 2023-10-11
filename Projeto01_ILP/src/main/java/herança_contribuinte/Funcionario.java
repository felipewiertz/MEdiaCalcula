package herança_contribuinte;
import javax.swing.*;

public class Funcionario extends PessoaFisica {
    
    private String cartao;
    
    public void setCartao(String cartao){
    
        this.cartao = cartao;
    }
    
    public String getCartao(){
    
        return(cartao);
    }
    
    public void mostraClasse(){
    
        JOptionPane.showMessageDialog(null, "Classe Funcionario");;
    }
}

