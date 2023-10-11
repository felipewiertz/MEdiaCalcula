package Poli;

import javax.swing.JOptionPane;

public class Concessionaria_Volks extends Oficina_Mecanica {
    
    Oficina_Mecanica volks = new Oficina_Mecanica();
   
    
    public Concessionaria_Volks(){
    
        volks.set_marca("VOLKSWAGEN");
        volks.set_modelo("FUSCA");
    }
   
    
    public String pintura(){
    
        return "Pintar de azul";
    }
    
    public String funilaria(){
    
        return "Trocar farois";
    }
    
    public String eletrica(){
    
        return "Instalar janela eletrica";
    }
    
    public void Informa_Dados(){
    
        JOptionPane.showMessageDialog(null,"Marca: " + volks.get_marca()
        + "\nModelo: " + volks.get_modelo() + "\nPintura: " + volks.pintura() + "\nFunilaria: "
        + volks.funilaria() + "\nEletrica: " + volks.eletrica());
    }
}
