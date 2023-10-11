package Poli;

import javax.swing.JOptionPane;

public class Oficina_Mecanica {
    
    private String marca;
    private String modelo;
    
    public void set_marca(String marca){
    
        this.marca = marca;
    }
    
    public void set_modelo(String modelo){
    
        this.modelo = modelo;
    }
    
    public String get_marca(){
    
        return marca;
    }
    
    public String get_modelo(){
        
        return modelo;
    }
    
    public String pintura(){
        
        return "pintar de verde";
    }
    
    public String funilaria(){
    
        return "desamassar teto";
    }
    
    public String eletrica(){
    
        return "instala alarme";
    }
    
    public void Informa_Dados(){
        
        JOptionPane.showMessageDialog(null, "Marca: " + get_marca()
        + "\nModelo: " + get_modelo() + "\nPintura: " + pintura() + "\nFunilaria: "
        + funilaria() + "\nEletrica: " + eletrica());
    }

}
