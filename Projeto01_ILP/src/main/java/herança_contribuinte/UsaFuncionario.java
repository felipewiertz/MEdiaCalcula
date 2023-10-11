package herança_contribuinte;

import javax.swing.JOptionPane;

public class UsaFuncionario {
        
    public static void main(String args[]){
    
        Funcionario funcionario = new Funcionario();
        Pessoa_Juridica func = new Pessoa_Juridica();
        
        String u,v,t,z;
        int x;
        
        z = JOptionPane.showInputDialog("digite 1 se o contrubuente e pessoa fisica \n digite 2 se e pessoa juridica");
        x = Integer.parseInt(z);
        
        if(z.length() == 1){
        
            switch(x){
                
                case 1:
                {
                    u = JOptionPane.showInputDialog("Digite o nome do contribuente: ");
                    v = JOptionPane.showInputDialog("Digite o RG do contribuente: ");
                    t = JOptionPane.showInputDialog("Digite a identificacao do cartao do contribuente: ");
                    
                    funcionario.setNome(u);
                    funcionario.setRG(v);
                    funcionario.setCartao(t);
                    
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRG());
                    System.out.println("CARTAO: " + funcionario.getCartao());
                    
                    break;
                }
                
                case 2:
                {
                    u = JOptionPane.showInputDialog("Digite o nome do contribuente: ");
                    v = JOptionPane.showInputDialog("Digite o CNPJ do contribuente: ");
                    t = JOptionPane.showInputDialog("Digite a identificacao do cartao do contribuente: ");
                    
                    funcionario.setNome(u);
                    func.setCNPJ(v);
                    funcionario.setCartao(t);
                    
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("CNPJ: " + func.getCNPJ());
                    System.out.println("CARTAO: " + funcionario.getCartao());
                    
                    break;
                }
                    
            }
        }
    }
}
