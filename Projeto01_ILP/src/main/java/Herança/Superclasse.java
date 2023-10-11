package Herança;

public class Superclasse {
    
    private String atributo_1;
    
    Superclasse(){
        
        System.out.println("Acesso ao metodo construtor da SuperClasee");
    }
    
    public void set_atributo_1(String atributo_1){
    
        this.atributo_1 = atributo_1;
    }
    
    public String get_atributo_1(){
    
        return atributo_1;
    }
}
