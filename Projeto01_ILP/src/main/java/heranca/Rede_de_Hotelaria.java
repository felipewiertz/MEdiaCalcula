package heranca;

public class Rede_de_Hotelaria{

private String nome;
private String cidade;
	
	public void setnome(String nome) { 
	    this.nome = nome;
	}
	public Rede_de_Hotelaria () {  
	    System.out.println("metodo construtor da superclasse \n" + "cidade: " + cidade);
	}   	
	public String getnome (){
		return nome;
    	
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}

}
