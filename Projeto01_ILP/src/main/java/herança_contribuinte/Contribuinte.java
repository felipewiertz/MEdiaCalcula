package herança_contribuinte;
import javax.swing.*;

public class Contribuinte {
    
    private String Nome;
    
    public void setNome(String Nome){
        
        this.Nome = Nome;
    }
    
    public String getNome(){
        
        return(Nome);
    }
    
    public void mostraClasse(){
    
        JOptionPane.showMessageDialog(null, "Classe Contribuinte");
    }
}
