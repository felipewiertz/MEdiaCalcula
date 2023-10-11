package Construcao;

import javax.swing.JOptionPane;

public class Empresa_de_Construcao {
    
    public static void main(String args[]){
    
        Construcao pedreiro = null;
        
        int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                           Dgitar o tipo de construcao: 
                                                                           1 - CASA e 2 - APARTAMENTO ou 3 - TUDO"""));
        
        switch(tipo_construcao){
        
            case 1:
            {
                pedreiro = new Casa(); break;
            }
            
            case 2:
            {
                pedreiro = new Apartamento(); break;
            }
            
            case 3:
            {
                pedreiro = new Construcao(); break;
            }
            
            default:
                System.out.println("CONSTRUCAO INVALIDA");
                System.exit(0);
        }
        
        pedreiro.constroi();
        
    }
}
