
package Encapsulamento_2;

import Encapsulamento_1.Acesso_numeros1;

public class Verifica_Encapsulamento2 {
    
    public static void main(String args[]){
        
        Acesso_numeros1 chave = new Acesso_numeros1();
        
        chave.setNumero("a", 10);
        chave.b = 20;
        chave.setNumero("c", 30);
        chave.setNumero("d", 40);
        
        chave.mostra_numero();
       
    }
}
