package Livraria;

public class Livro {
    
    private String titulo;
    private String autor;
    
    Livro(){}
    Livro(String mensagem){
        
        System.out.println(mensagem);
    }
    
    public void settitulo(String titulo){
    
        this.titulo = titulo;
    }
    
    public void setautor(String autor){
        
        this.autor = autor;
    }
    
    public String gettitulo(){
        
        return titulo;
    }
    
    public String gettautor(){
    
        return autor;
    }
    
    public void Consulta_Livro(){
    
        System.out.println("Ciencias da Computacao");
    }
}
