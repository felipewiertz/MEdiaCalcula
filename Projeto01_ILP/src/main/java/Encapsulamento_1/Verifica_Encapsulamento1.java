
package Encapsulamento_1;

public class Verifica_Encapsulamento1 {
    
    public static void main(String args []){
        
        Acesso_numeros1 chave = new Acesso_numeros1();
        
        chave.a = 10;
        chave.b = 20;
        chave.setNumero("c", 30);
        chave.d = 40;
        
        chave.mostra_numero();
       
    }
}
