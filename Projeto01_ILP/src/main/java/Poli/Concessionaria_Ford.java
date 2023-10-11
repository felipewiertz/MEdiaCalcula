package Poli;

import javax.swing.JOptionPane;

public class Concessionaria_Ford extends Oficina_Mecanica {
    
    Oficina_Mecanica ford = new Oficina_Mecanica();
   
    
    
    
    public Concessionaria_Ford(){
    
        ford.set_marca("FORD");
        ford.set_modelo("BELINA");
    }

    
    
    public String pintura(){
    
        return "Pintar de amarelo";
    }
    
    public String funilaria(){
    
        return "Trocar pneus";
    }
    
    public String eletrica(){
    
        return "Alterar buzina";
    }
    
    public void Informa_Dados(){
    
        JOptionPane.showMessageDialog(null, "Marca: " + ford.get_marca()
        + "\nModelo: " + ford.get_modelo() + "\nPintura: " + ford.pintura() + "\nFunilaria: "
        + ford.funilaria() + "\nEletrica: " + ford.eletrica());
    }
}




