package herança_contribuinte;
import javax.swing.*;

public class PessoaFisica extends Contribuinte {
    
    private String rg;
    
    public void setRG(String rg){
    
        this.rg = rg;
    }
    
    public String getRG(){
    
        return(rg);
    }
    
    public void mostraClasse(){
    
        JOptionPane.showMessageDialog(null, "Classe Pessoa Fisica");
    }
}
