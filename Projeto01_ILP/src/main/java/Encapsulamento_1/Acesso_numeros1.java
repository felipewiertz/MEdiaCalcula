
package Encapsulamento_1;

public class Acesso_numeros1 {
    
    int a;
    public int b;
    private int c;
    protected int d;
    
    public void setNumero(String id, int numero){
        
        if (id == "a") {
            this.a = numero;
        }
        
        if (id == "c") {
            this.c = numero;
        }
        
        if (id == "d") {
            this.d = numero;
        }
    }
    
    public void mostra_numero(){
        
        System.out.println("Numero a = " + a);
        System.out.println("Numero b = " + b);
        System.out.println("Numero c = " + c);
        System.out.println("Numero d = " + d);
    }
}
