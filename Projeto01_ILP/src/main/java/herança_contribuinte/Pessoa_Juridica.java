package herança_contribuinte;
import javax.swing.*;

public class Pessoa_Juridica extends Contribuinte{
    
    private String cnpj;
    
    public void setCNPJ(String cnpj){
    
        this.cnpj = cnpj;
    }
    
    public String getCNPJ(){
    
        return(cnpj);
    }
    
    public void mostraClasse(){
    
        JOptionPane.showMessageDialog(null, "Classe Pessoa Juridica");
    }
}
