package Padaria_abstracao;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        String opc, opc2;
        String nome, cpf, cargo;
        int cp, opc1, item;
        
        Produto p = new Produto();
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        
        do{
            opc = JOptionPane.showInputDialog("""
                                              Bem Vindo a padaria
                                              Escolha uma opcao:
                                              1 - Novo pedido
                                              2 - Adicionar cliente
                                              3 - Adicionar funcionario
                                              9 - Sair""");
            
            opc1 = Integer.parseInt(opc);
            
            switch(opc1){
                
                case 1:
                {
                    do{
                        opc2 = JOptionPane.showInputDialog("""
                                                           Escolha um item: 
                                                           1 - cafe R$1,00
                                                           2 - pao na chapa R$3,00
                                                           3 - refrigerante R$4,00
                                                           9 - Encerrar Pedido""");

                        item = Integer.parseInt(opc2);
                        
                        p.setCod(item);

                        if(p.getCod() == 1)
                        {
                            p.setPreco(1);
                        }
                        if(p.getCod() == 2)
                        {
                            p.setPreco(3);
                        }
                        if(p.getCod() == 3)
                        {
                            p.setPreco(4);
                        }
                        
                        JOptionPane.showMessageDialog(null, "Valor do pedido R$" + p.getPreco());
                    
                    }while (p.getCod() != 9);break;
                }
                
                case 2:
                {
                
                    nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente");
                    cpf = JOptionPane.showInputDialog(null, "Informe o CPF do cliente(sem pontos)");
                    
                    cp = Integer.parseInt(cpf);
                    
                    c.setNome(nome);
                    c.setCpf(cp);
                    
                    JOptionPane.showMessageDialog(null, """
                                                        Cliente cadastrado com sucesso!
                                                        \n NOME: """ + c.getNome() + 
                                                        "\n CPF: " + c.getCpf(),"",JOptionPane.PLAIN_MESSAGE);break;
                }
                
                case 3:
                {
                    nome = JOptionPane.showInputDialog(null, "Informe o nome do Funcionario");
                    cpf = JOptionPane.showInputDialog(null, "Informe o CPF do cliente(sem pontos)");
                    cargo = JOptionPane.showInputDialog(null, "Informe o cargo do funcionario: ");
                    
                    cp = Integer.parseInt(cpf);
                    
                    c.setNome(nome);
                    c.setCpf(cp);
                    f.setCargo(cargo);
                    
                    JOptionPane.showMessageDialog(null, """
                                                        Cliente cadastrado com sucesso!
                                                        \n NOME: """ + c.getNome() + 
                                                        "\n CPF: " + c.getCpf() +
                                                        "\n CARGO: " + f.getCargo(),"",JOptionPane.PLAIN_MESSAGE);break;
                    
                }
            }
            

        }while(opc1 != 9);
    }
}
