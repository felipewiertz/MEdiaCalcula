package Poli;

import javax.swing.JOptionPane;

public class Ordem_Servico extends Oficina_Mecanica {
    
    Oficina_Mecanica mecanica = null;

    int servico;
    String mecanico1;
    
    public void concessionaria(int servico){
    
        switch(servico){
        
            case 1:
            {
                mecanica = new Concessionaria_Volks();
                break;
            }
            
            case 2:
            {
                mecanica = new Concessionaria_Ford();
                break;
            }
            
            default:
            {
                System.out.println("MARCA INVALIDA");
                System.exit(0);
            }
        }
    }
    
    public void servico(int mecanico1){
    
        switch(mecanico1){
        
            case 1:
            {
                JOptionPane.showMessageDialog(null, mecanica.funilaria());break;
            }
            case 2:
            {
                JOptionPane.showMessageDialog(null, mecanica.pintura());break;
            }
            case 3:
            {
                JOptionPane.showMessageDialog(null, mecanica.eletrica());break;
            }
            case 4:
            {
                mecanica.Informa_Dados();break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "SERVICO INVALIDO");
                System.exit(0);
            }
        }
    
    }
}
